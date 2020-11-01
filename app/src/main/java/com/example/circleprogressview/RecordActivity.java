package com.example.circleprogressview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.circleprogress.CircleProgressView;


public class RecordActivity extends AppCompatActivity {
    private ImageButton imageButton;
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record_layout);
        final Intent intent=getIntent();
        imageButton=findViewById(R.id.ib);
        CircleProgressView result=findViewById(R.id.result);
        result.setTextEnabled(true);
        result.setMaxProgress(100);
        final String sub1 = intent.getStringExtra("Subject1");
        final Double sco1 = intent.getDoubleExtra("Score1",0);
        final String sub2 = intent.getStringExtra("Subject2");
        final Double sco2 = intent.getDoubleExtra("Score2",0);
        final String sub3 = intent.getStringExtra("Subject3");
        final Double sco3 = intent.getDoubleExtra("Score3",0);
        final String sub4 = intent.getStringExtra("Subject4");
        final Double sco4 = intent.getDoubleExtra("Score4",0);
        String lv1 = intent.getStringExtra("Level1");
        String lv2 = intent.getStringExtra("Level2");
        String lv3 = intent.getStringExtra("Level3");
        String lv4 = intent.getStringExtra("Level4");
        Double gp1 =intent.getDoubleExtra("GradePoint1",0);
        Double gp2 =intent.getDoubleExtra("GradePoint2",0);
        Double gp3 =intent.getDoubleExtra("GradePoint3",0);
        Double gp4 =intent.getDoubleExtra("GradePoint4",0);
        final String variance = intent.getStringExtra("Variance");
        Float weightedAverageScore =intent.getFloatExtra("WeightedAverageScore",0);
        result.setProgressWithAnimation(weightedAverageScore,3000);
        Integer totalGPA = intent.getIntExtra("TotalGPA",0);
        Integer totalCredit = intent.getIntExtra("TotalCredit",0);
        String lv=intent.getStringExtra("Level");
        final TextView subject1 = (TextView)findViewById(R.id.subject1);
        subject1.setText(sub1);
        TextView score1 = (TextView)findViewById(R.id.score1);
        score1.setText("成绩:"+sco1);
        TextView gradePoint1 = (TextView)findViewById((R.id.gradePoint1));
        gradePoint1.setText(("绩点："+gp1));
        TextView subject2 = (TextView)findViewById(R.id.subject2);
        subject2.setText(sub2);
        TextView score2 = (TextView)findViewById(R.id.score2);
        score2.setText("成绩:"+sco2);
        TextView gradePoint2 = (TextView)findViewById((R.id.gradePoint2));
        gradePoint2.setText(("绩点："+gp2));
        TextView subject3 = (TextView)findViewById(R.id.subject3);
        subject3.setText(sub3);
        TextView score3 = (TextView)findViewById(R.id.score3);
        score3.setText("成绩:"+sco3);
        TextView gradePoint3 = (TextView)findViewById((R.id.gradePoint3));
        gradePoint3.setText(("绩点："+gp3));
        TextView subject4 = (TextView)findViewById(R.id.subject4);
        subject4.setText(sub4);
        TextView score4 = (TextView)findViewById(R.id.score4);
        score4.setText("成绩:"+sco4);
        TextView gradePoint4 = (TextView)findViewById((R.id.gradePoint4));
        gradePoint4.setText(("绩点："+gp4));
        TextView level1 = (TextView)findViewById((R.id.level1));
        level1.setText("评价:"+lv1);
        TextView level2 = (TextView)findViewById((R.id.level2));
        level2.setText("评价:"+lv2);
        TextView level3 = (TextView)findViewById((R.id.level3));
        level3.setText("评价:"+lv3);
        TextView level4 = (TextView)findViewById((R.id.level4));
        level4.setText("评价:"+lv4);
        TextView TGPA = (TextView)findViewById(R.id.totalGradePointArrange);
        TGPA.setText("绩点："+totalGPA);
        TextView TC = (TextView)findViewById(R.id.totalCredit);
        TC.setText("学分："+totalCredit);
        TextView LV = (TextView)findViewById(R.id.level);
        LV.setText(lv);
        final TextView Variance=(TextView)findViewById(R.id.actualStability);
        Variance.setText(variance);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String analysize1=null;
                String analysize2=null;
                String analysize3=null;
                String analysize4=null;
                String analysize5=null;
                Intent intent1=new Intent(RecordActivity.this, AnalysizeActivity.class);
                if(sco1>=60&&sco2>=60&&sco3>=60&&sco4>=60){
                    assert variance != null;
                    if(variance.equals("优秀")) analysize1="您的各科成绩比较不错，且没有偏科现象，要加强学习，多多努力。";
                    if(variance.equals("良好")) analysize1="您的各科成绩中规中矩，且有轻微的偏科现象，要多多注意。";
                    if(variance.equals("较差")) analysize1="您的各科成绩还可以，但存在偏科现象，平时要注意弱势学科的学习。";
                    if(variance.equals("差")) analysize1="您的各科成绩较差，且存在严重的偏科现象，需要多花时间在弱势学科上的学习。";
                }
                if(sco1>=90&&sco2>=90&&sco3>=90&&sco4>=90&&variance=="优秀"){
                    analysize1="您的各科成绩都很优秀，不存在偏科现象。";
                }
                if(sco1<60||sco2<60||sco3<60||sco4<60){
                    analysize1="你的各科成绩较为糟糕，要多注意学习。";
                }
                if(sco1<60&&sco2<60&&sco3<60&&sco4<60){
                    analysize1="您的各科成绩都十分糟糕，要多花时间在学习上面。";
                }
                if(sco1>=80&&sco2>=80||sco1>=80&&sco3>=80||sco1>=80&&sco4>=80||sco2>=80&&sco3>=80||sco2>=80&&sco4>=80||sco3>=80&&sco4>=80){
                    analysize1="您的各科成绩比较优秀，还需多多努力";
                }
                if(sco1>=90) analysize2="十分优秀，但平常还是不能松懈学习。";
                if(sco2>=90) analysize3="十分优秀，但平常还是不能松懈学习。";
                if(sco3>=90) analysize4="十分优秀，但平常还是不能松懈学习。";
                if(sco4>=90) analysize5="十分优秀，但平常还是不能松懈学习。";
                if(sco1<60) analysize2="十分糟糕，平时要加强这门科目的学习。";
                if(sco2<60) analysize3="十分糟糕，平时要加强这门科目的学习。";
                if(sco3<60) analysize4="十分糟糕，平时要加强这门科目的学习。";
                if(sco4<60) analysize5="十分糟糕，平时要加强这门科目的学习。";
                if(sco1>=80&&sco1<90) analysize2="较为优秀，再多花点心思就能上一个台阶。";
                if(sco2>=80&&sco2<90) analysize3="较为优秀，再多花点心思就能上一个台阶。";
                if(sco3>=80&&sco3<90) analysize4="较为优秀，再多花点心思就能上一个台阶。";
                if(sco4>=80&&sco4<90) analysize5="较为优秀，再多花点心思就能上一个台阶。";
                if(sco1>=60&&sco1<80) analysize2="较为一般，你还有很大的上升空间。";
                if(sco2>=60&&sco2<80) analysize3="较为一般，你还有很大的上升空间。";
                if(sco3>=60&&sco3<80) analysize4="较为一般，你还有很大的上升空间。";
                if(sco4>=60&&sco4<80) analysize5="较为一般，你还有很大的上升空间。";
                intent1.putExtra("Analysize1",analysize1);
                intent1.putExtra("Analysize2",analysize2);
                intent1.putExtra("Analysize3",analysize3);
                intent1.putExtra("Analysize4",analysize4);
                intent1.putExtra("Analysize5",analysize5);
                intent1.putExtra("Subject1",sub1);
                intent1.putExtra("Subject2",sub2);
                intent1.putExtra("Subject3",sub3);
                intent1.putExtra("Subject4",sub4);

                startActivity(intent1);
            }
        });
    }
}
