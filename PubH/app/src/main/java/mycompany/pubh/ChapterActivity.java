package mycompany.pubh;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChapterActivity extends AppCompatActivity {

    private DatabaseReference databaseReference,rootReference,databaseReference2,databaseReference3;
    TextView chdesc;
    TextView chtitle;
    ImageView chpterimg;
    String imageurl,imageurl2,imageurl3,imageulr4;
    ViewGroup linearlayout;
    ListView listview;
    public ArrayList<String> arr;
    public ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter);
        createLesson();
    }

    private void createLesson(){
        final String chp;
        linearlayout = (ViewGroup) findViewById(R.id.chapterLayout);
        chtitle = new TextView(this);
        chdesc = new TextView(this);
        final Button back = new Button(this);
        listview = (ListView) findViewById(R.id.Lists);
        chpterimg = (ImageView) findViewById(R.id.ChapterImages);
        chp = getIntent().getStringExtra("Chapter").toString();
        imageurl = getIntent().getStringExtra("CHImage").toString();
        arr = new ArrayList<>();


/*
        StorageReference storageRef = FirebaseStorage.getInstance().getReferenceFromUrl("gs://pubh-714d7.appspot.com/").child("chap1");
*/
        Picasso.with(ChapterActivity.this).load(imageurl).into(chpterimg);
        rootReference = FirebaseDatabase.getInstance().getReference();
        databaseReference = rootReference.child("Lessons").child(chp).child("Title");
        databaseReference2 = rootReference.child("Lessons").child(chp).child("Section");

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                chtitle.setLayoutParams(new LinearLayoutCompat.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT));
                chtitle.setText(value);
                chtitle.setPadding(10,10,10,10);
                chtitle.setGravity(1);
               /* linearlayout.addView(chtitle);*/
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                //database error checker
            }
        });


        databaseReference2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot sections : dataSnapshot.getChildren()) {
                    Log.i("player", sections.getKey());
                    arr.add(sections.getKey());
                }
                ArrayAdapter arrayAdapter = new ArrayAdapter(ChapterActivity.this, android.R.layout.simple_list_item_1,
                        arr);
                listview.setAdapter(arrayAdapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println(databaseError.toException());
            }
        });
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, arr);
        listview.setAdapter(adapter);

      /*  databaseReference2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String descriptionValue = dataSnapshot.getValue(String.class);
                chdesc.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT));
                chdesc.setText(Html.fromHtml(descriptionValue));
                chdesc.setPadding(10,10,10,10);
                chdesc.setGravity(2);
                linearlayout.addView(chdesc);

                back.setText("Back");
                back.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                linearlayout.addView(back);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                //database error checker
            }
        });*/

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // When clicked, show a toast with the TextView text
                Toast.makeText(getApplicationContext(), ((TextView) view).getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
