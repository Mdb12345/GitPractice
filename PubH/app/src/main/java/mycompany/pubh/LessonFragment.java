    package mycompany.pubh;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static android.R.attr.data;
import static android.R.attr.entries;
import static android.R.attr.start;

    public class LessonFragment extends Fragment implements View.OnClickListener{

        public LessonFragment() {
        }

        public static LessonFragment newInstance(String param1, String param2) {
            LessonFragment fragment = new LessonFragment();
            Bundle args = new Bundle();

            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View myView = inflater.inflate(R.layout.fragment_lesson, container, false);
            Button chap1 = (Button) myView.findViewById(R.id.Chapter1);
            Button chap2 = (Button) myView.findViewById(R.id.Chapter2);
            Button chap3 = (Button) myView.findViewById(R.id.Chapter3);
            Button chap4 = (Button) myView.findViewById(R.id.Chapter4);
            Button chap5 = (Button) myView.findViewById(R.id.Chapter5);
            Button chap6 = (Button) myView.findViewById(R.id.Chapter6);
            Button chap7 = (Button) myView.findViewById(R.id.Chapter7);
            Button chap8 = (Button) myView.findViewById(R.id.Chapter8);
            Button chap9 = (Button) myView.findViewById(R.id.Chapter9);
            Button chap10 = (Button) myView.findViewById(R.id.Chapter10);
            Button chap11 = (Button) myView.findViewById(R.id.Chapter11);
            Button chap12 = (Button) myView.findViewById(R.id.Chapter12);
            Button chap13 = (Button) myView.findViewById(R.id.Chapter13);
            Button chap14 = (Button) myView.findViewById(R.id.Chapter14);
            Button chap15 = (Button) myView.findViewById(R.id.Chapter15);
            Button chap16 = (Button) myView.findViewById(R.id.Chapter16);
            Button chap17 = (Button) myView.findViewById(R.id.Chapter17);
            Button chap18 = (Button) myView.findViewById(R.id.Chapter18);
            Button chap19 = (Button) myView.findViewById(R.id.Chapter19);
            Button chap20 = (Button) myView.findViewById(R.id.Chapter20);
            Button chap21 = (Button) myView.findViewById(R.id.Chapter21);
            Button chap22 = (Button) myView.findViewById(R.id.Chapter22);
            chap1.setOnClickListener(this);
            chap2.setOnClickListener(this);
            chap3.setOnClickListener(this);
            chap4.setOnClickListener(this);
            chap5.setOnClickListener(this);
            chap6.setOnClickListener(this);
            chap7.setOnClickListener(this);
            chap8.setOnClickListener(this);
            chap9.setOnClickListener(this);
            chap10.setOnClickListener(this);
            chap11.setOnClickListener(this);
            chap12.setOnClickListener(this);
            chap13.setOnClickListener(this);
            chap14.setOnClickListener(this);
            chap15.setOnClickListener(this);
            chap16.setOnClickListener(this);
            chap17.setOnClickListener(this);
            chap18.setOnClickListener(this);
            chap19.setOnClickListener(this);
            chap20.setOnClickListener(this);
            chap21.setOnClickListener(this);
            chap22.setOnClickListener(this);

            return myView;
        }

        @Override
        public void onClick(View v) {
            Intent ChapAct;
            switch (v.getId()){
                case R.id.Chapter1:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("Chapter","Chapter 1");
                    ChapAct.putExtra("CHImage","https://firebasestorage.googleapis.com/v0/b/pubh-714d7.appspot.com/o/chap1.jpg?alt=media&token=39724122-9d42-457d-b6a1-a35e423880a8");
                    getActivity().startActivity(ChapAct);
                    break;
                case R.id.Chapter2:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("CHImage","https://firebasestorage.googleapis.com/v0/b/pubh-714d7.appspot.com/o/chap1.jpg?alt=media&token=39724122-9d42-457d-b6a1-a35e423880a8");
                    ChapAct.putExtra("Chapter","Chapter 2");
                    getActivity().startActivity(ChapAct);
                    break;
                case R.id.Chapter3:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("Chapter","Chapter 3");
                    getActivity().startActivity(ChapAct);
                    break;
                case R.id.Chapter4:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("Chapter","Chapter 4");
                    getActivity().startActivity(ChapAct);
                    break;
                case R.id.Chapter5:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("Chapter","Chapter 5");
                    getActivity().startActivity(ChapAct);
                    break;
                case R.id.Chapter6:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("Chapter","Chapter 6");
                    getActivity().startActivity(ChapAct);
                    break;
                case R.id.Chapter7:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("Chapter","Chapter 7");
                    getActivity().startActivity(ChapAct);
                    break;
                case R.id.Chapter8:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("Chapter","Chapter 8");
                    getActivity().startActivity(ChapAct);
                    break;
                case R.id.Chapter9:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("Chapter","Chapter 9");
                    getActivity().startActivity(ChapAct);
                    break;
                case R.id.Chapter10:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("Chapter","Chapter 10");
                    getActivity().startActivity(ChapAct);
                    break;
                case R.id.Chapter11:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("Chapter","Chapter 11");
                    getActivity().startActivity(ChapAct);
                    break;
                case R.id.Chapter12:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("Chapter","Chapter 12");
                    getActivity().startActivity(ChapAct);
                    break;
                case R.id.Chapter13:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("Chapter","Chapter 13");
                    getActivity().startActivity(ChapAct);
                    break;
                case R.id.Chapter14:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("Chapter","Chapter 14");
                    getActivity().startActivity(ChapAct);
                    break;
                case R.id.Chapter15:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("Chapter","Chapter 15");
                    getActivity().startActivity(ChapAct);
                    break;
                case R.id.Chapter16:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("Chapter","Chapter 16");
                    getActivity().startActivity(ChapAct);
                    break;
                case R.id.Chapter17:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("Chapter","Chapter 17");
                    getActivity().startActivity(ChapAct);
                    break;
                case R.id.Chapter18:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("Chapter","Chapter 18");
                    getActivity().startActivity(ChapAct);
                    break;
                case R.id.Chapter19:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("Chapter","Chapter 19");
                    getActivity().startActivity(ChapAct);
                    break;
                case R.id.Chapter20:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("Chapter","Chapter 20");
                    getActivity().startActivity(ChapAct);
                    break;
                case R.id.Chapter21:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("Chapter","Chapter 21");
                    getActivity().startActivity(ChapAct);
                    break;
                case R.id.Chapter22:
                    ChapAct = new Intent(getActivity(), ChapterActivity.class);
                    ChapAct.putExtra("Chapter","Chapter 22");
                    getActivity().startActivity(ChapAct);
                    break;

            }
        }

    }


