package com.tareqrobin.customadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter{

    List<Student>studentInfo=new ArrayList<Student>();

    public CustomAdapter(Context context,List<Student>studentInfo){
        super(context,R.layout.custom_layout,studentInfo);
        this.studentInfo=studentInfo;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row=inflater.inflate(R.layout.custom_layout,parent,false);
        TextView tv=row.findViewById(R.id.tv_custom);
        tv.setText(studentInfo.get(position).getName());
        return row;
    }

}
