package com.tareqrobin.customadapter;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import static com.tareqrobin.customadapter.MainActivity.studentInfo;
public class Details extends AppCompatActivity {

    TextView tv1;
    ImageView iv;
    MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatails);
        tv1=findViewById(R.id.tv_name);
        iv=findViewById(R.id.iv_image);
        int position=getIntent().getExtras().getInt("Key");

        iv.setImageResource(studentInfo.get(position).getImage());
        tv1.setText(studentInfo.get(position).getName());
        if(music!=null){
            music.release();
            music=null;
        }
        music=MediaPlayer.create(getApplicationContext(),studentInfo.get(position).getSound());
        music.start();
    }
}
