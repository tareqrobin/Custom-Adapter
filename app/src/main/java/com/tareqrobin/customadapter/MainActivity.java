package com.tareqrobin.customadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    static List<Student> studentInfo=new ArrayList<Student>();
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(R.id.listView);

        CustomAdapter adptr;

        studentInfo.add(new Student(R.drawable.download,"Amim",R.raw.music1));
        studentInfo.add(new Student(R.drawable.download3,"Amim 1",R.raw.music2));
        studentInfo.add(new Student(R.drawable.download2,"Amim 2",R.raw.music3));
        studentInfo.add(new Student(R.drawable.download4,"Amim 3",R.raw.music4));
        studentInfo.add(new Student(R.drawable.download5,"Amim 4",R.raw.music5));
        studentInfo.add(new Student(R.drawable.download6,"Amim 4",R.raw.music6));
        studentInfo.add(new Student(R.drawable.download7,"Amim 5",R.raw.music7));
        studentInfo.add(new Student(R.drawable.download8,"Amim 6",R.raw.music8));
        studentInfo.add(new Student(R.drawable.download9,"Amim 7",R.raw.music9));
        studentInfo.add(new Student(R.drawable.download2,"Amim 7",R.raw.music10));
        studentInfo.add(new Student(R.drawable.download3,"Amim 8",R.raw.music11));
        studentInfo.add(new Student(R.drawable.download4,"Amim 9",R.raw.music12));


        adptr=new CustomAdapter(getApplicationContext(),studentInfo);
        lv.setAdapter(adptr);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent gate=new Intent(getApplicationContext(), Details.class);
                gate.putExtra("Key",i);
                startActivity(gate);
            }
        });
    }
}