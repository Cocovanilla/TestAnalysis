package com.example.circleprogressview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AnalysizeActivity  extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.analysis_layout);
        Intent intent=getIntent();
        String analysize1= intent.getStringExtra("Analysize1");
        String analysize2= intent.getStringExtra("Analysize2");
        String analysize3= intent.getStringExtra("Analysize3");
        String analysize4= intent.getStringExtra("Analysize4");
        String analysize5= intent.getStringExtra("Analysize5");
        String subject1= intent.getStringExtra("Subject1");
        String subject2= intent.getStringExtra("Subject2");
        String subject3= intent.getStringExtra("Subject3");
        String subject4= intent.getStringExtra("Subject4");
        TextView textView1=findViewById(R.id.textview1);
        textView1.setText(analysize1);
        TextView textView2=findViewById(R.id.textview2);
        textView2.setText("您的"+subject1+analysize2);
        TextView textView3=findViewById(R.id.textview3);
        textView3.setText("您的"+subject2+analysize3);
        TextView textView4=findViewById(R.id.textview4);
        textView4.setText("您的"+subject3+analysize4);
        TextView textView5=findViewById(R.id.textview5);
        textView5.setText("您的"+subject4+analysize5);
    }
}
