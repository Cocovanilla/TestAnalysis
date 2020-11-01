package com.example.circleprogressview;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EdittextInputNumber {
    public static void inputWatch(final EditText edit, final Context context, final int max, final int min) {


        edit.addTextChangedListener(new TextWatcher() {
            int l = 0;
            int location = 0;
            String data;

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub
                l = s.length();
                location = edit.getSelectionStart();
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if (!TextUtils.isEmpty(s.toString())){
                    Pattern p = Pattern.compile("[0-9]*");
                    Matcher m = p.matcher(s.toString());
                    if(m.matches() ){
                        int number = Integer.valueOf(s.toString());
                        if (number<=max&&number>=min) {
                            if(s!=null){
                                data= s.toString();
                            }
                        } else {
                            edit.setError("请输入正确的学科信息");
                            edit.setText(data);
                            edit.setSelection(data.length());
                        }
                    }else{
                        if(!TextUtils.isEmpty(s.toString())){
                            edit.setError("请输入学科信息");
                        }
                        edit.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }
        });
    }
}

public class InputActivity extends AppCompatActivity {
    private Button button;

    protected  void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.input_layout);
        button =findViewById(R.id.confirm);
        final EditText sub1=(EditText)findViewById(R.id.sub1);
        final EditText cd1=(EditText)findViewById(R.id.cd1);
        final EditText sco1=(EditText)findViewById(R.id.sco1);
        final EditText sub2=(EditText)findViewById(R.id.sub2);
        final EditText cd2=(EditText)findViewById(R.id.cd2);
        final EditText sco2=(EditText)findViewById(R.id.sco2);
        final EditText sub3=(EditText)findViewById(R.id.sub3);
        final EditText cd3=(EditText)findViewById(R.id.cd3);
        final EditText sco3=(EditText)findViewById(R.id.sco3);
        final EditText sub4=(EditText)findViewById(R.id.sub4);
        final EditText cd4=(EditText)findViewById(R.id.cd4);
        final EditText sco4=(EditText)findViewById(R.id.sco4);
        EdittextInputNumber.inputWatch(cd1,this,15,0);
        EdittextInputNumber.inputWatch(cd2,this,15,0);
        EdittextInputNumber.inputWatch(cd3,this,15,0);
        EdittextInputNumber.inputWatch(cd4,this,15,0);
        EdittextInputNumber.inputWatch(sco1,this,100,0);
        EdittextInputNumber.inputWatch(sco2,this,100,0);
        EdittextInputNumber.inputWatch(sco3,this,100,0);
        EdittextInputNumber.inputWatch(sco4,this,100,0);
        sub1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (TextUtils.isEmpty(sub1.getText())) {
                    button.setEnabled(Boolean.FALSE);
                }else{
                    button.setEnabled(Boolean.TRUE);
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        cd1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (TextUtils.isEmpty(cd1.getText())) {
                    button.setEnabled(Boolean.FALSE);
                }else{
                    button.setEnabled(Boolean.TRUE);
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        sco1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (TextUtils.isEmpty(sco1.getText())) {
                    button.setEnabled(Boolean.FALSE);
                }else{
                    button.setEnabled(Boolean.TRUE);
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        sub2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (TextUtils.isEmpty(sub2.getText())) {
                    button.setEnabled(Boolean.FALSE);
                }else{
                    button.setEnabled(Boolean.TRUE);
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        cd2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (TextUtils.isEmpty(cd2.getText())) {
                    button.setEnabled(Boolean.FALSE);
                }else{
                    button.setEnabled(Boolean.TRUE);
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        sco2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (TextUtils.isEmpty(sco2.getText())) {
                    button.setEnabled(Boolean.FALSE);
                }else{
                    button.setEnabled(Boolean.TRUE);
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        sub3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (TextUtils.isEmpty(sub3.getText())) {
                    button.setEnabled(Boolean.FALSE);
                }else{

                    button.setEnabled(Boolean.TRUE);
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        cd3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (TextUtils.isEmpty(cd3.getText())) {
                    button.setEnabled(Boolean.FALSE);
                }else{
                    button.setEnabled(Boolean.TRUE);
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        sco3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (TextUtils.isEmpty(sco3.getText())) {
                    button.setEnabled(Boolean.FALSE);
                }else{
                    button.setEnabled(Boolean.TRUE);
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        sub4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (TextUtils.isEmpty(sub4.getText())) {
                    button.setEnabled(Boolean.FALSE);
                }else{
                    button.setEnabled(Boolean.TRUE);
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        cd4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (TextUtils.isEmpty(cd4.getText())) {
                    button.setEnabled(Boolean.FALSE);
                }else{
                    button.setEnabled(Boolean.TRUE);
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        sco4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (TextUtils.isEmpty(sco4.getText())) {
                    button.setEnabled(Boolean.FALSE);
                }else{
                    button.setEnabled(Boolean.TRUE);
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InputActivity.this, RecordActivity.class);
                String subject1 = sub1.getText().toString();
                Double credit1 = Double.parseDouble(cd1.getText().toString());
                Double score1 = Double.parseDouble(sco1.getText().toString());
                String subject2 = sub2.getText().toString();
                Double credit2 = Double.parseDouble(cd2.getText().toString());
                Double score2 = Double.parseDouble(sco2.getText().toString());
                String subject3 = sub3.getText().toString();
                Double credit3 = Double.parseDouble(cd3.getText().toString());
                Double score3 = Double.parseDouble(sco3.getText().toString());
                String subject4 = sub4.getText().toString();
                Double credit4 = Double.parseDouble(cd4.getText().toString());
                Double score4 = Double.parseDouble(sco4.getText().toString());
                double sum = (score1 + score2 + score3 + score4) / 4;
                double f = (score1 - sum) * (score1 - sum) + (score2 - sum) * (score2 - sum) + (score3 - sum) * (score3 - sum) + (score4 - sum) * (score4 - sum);
                double f1 = f / 4;
                int totalCredit = 0, totalGPA = 0;
                float weightedAverageScore = 0;
                double gp1 = 0, gp2 = 0, gp3 = 0, gp4 = 0, gp = 0;
                String variance = null;
                if (f1 <= 0.99 && f1 >= 0) {
                    variance = "优秀";
                }
                if (f1 <= 3.99 && f1 >= 1) {
                    variance = "良好";
                }
                if (f1 <= 9.99 && f1 >= 4) {
                    variance = "较差";
                }
                if (f1 >= 10) {
                    variance = "差";
                }
                String lv1 = null, lv2 = null, lv3 = null, lv4 = null, lv = null;
                if (score1 >= 90 & score1 <= 100) {
                    gp1 = 4.0;
                    lv1 = "A";
                }
                if (score1 >= 86 & score1 <= 89) {
                    gp1 = 3.7;
                    lv1 = "B+";
                }
                if (score1 <= 85 & score1 >= 83) {
                    gp1 = 3.3;
                    lv1 = "B";
                }
                if (score1 <= 82 & score1 >= 80) {
                    gp1 = 3.0;
                    lv1 = "B-";
                }
                if (score1 <= 79 & score1 >= 76) {
                    gp1 = 2.7;
                    lv1 = "C+";
                }
                if (score1 <= 75 & score1 >= 73) {
                    gp1 = 2.3;
                    lv1 = "C";
                }
                if (score1 <= 72 & score1 >= 70) {
                    gp1 = 2.0;
                    lv1 = "C-";
                }
                if (score1 <= 69 & score1 >= 66) {
                    gp1 = 1.7;
                    lv1 = "D+";
                }
                if (score1 <= 63 & score1 >= 65) {
                    gp1 = 1.3;
                    lv1 = "D";
                }
                if (score1 <= 62 & score1 >= 60) {
                    gp1 = 1.0;
                    lv1 = "D-";
                }
                if (score1 <= 59 & score1 >= 0) {
                    lv1 = "F";
                }
                if (score2 >= 90 & score2 <= 100) {
                    gp2 = 4.0;
                    lv2 = "A";
                }
                if (score2 >= 86 & score2 <= 89) {
                    gp2 = 3.7;
                    lv2 = "B+";
                }
                if (score2 <= 85 & score2 >= 83) {
                    gp2 = 3.3;
                    lv2 = "B";
                }
                if (score2 <= 82 & score2 >= 80) {
                    gp2 = 3.0;
                    lv2 = "B-";
                }
                if (score2 <= 79 & score2 >= 76) {
                    gp2 = 2.7;
                    lv2 = "C+";
                }
                if (score2 <= 75 & score2 >= 73) {
                    gp2 = 2.3;
                    lv2 = "C";
                }
                if (score2 <= 72 & score2 >= 70) {
                    gp2 = 2.0;
                    lv2 = "C-";
                }
                if (score2 <= 69 & score2 >= 66) {
                    gp2 = 1.7;
                    lv2 = "D+";
                }
                if (score2 <= 63 & score2 >= 65) {
                    gp2 = 1.3;
                    lv2 = "D";
                }
                if (score2 <= 62 & score2 >= 60) {
                    gp2 = 1.0;
                    lv2 = "D-";
                }
                if (score2 <= 59 & score2 >= 0) {
                    lv2 = "F";
                }
                if (score3 >= 90 & score3 <= 100) {
                    gp3 = 4.0;
                    lv3 = "A";
                }
                if (score3 >= 86 & score3 <= 89) {
                    gp3 = 3.7;
                    lv3 = "B+";
                }
                if (score3 <= 85 & score3 >= 83) {
                    gp3 = 3.3;
                    lv3 = "B";
                }
                if (score3 <= 82 & score3 >= 80) {
                    gp3 = 3.0;
                    lv3 = "B-";
                }
                if (score3 <= 79 & score3 >= 76) {
                    gp3 = 2.7;
                    lv3 = "C+";
                }
                if (score3 <= 75 & score3 >= 73) {
                    gp3 = 2.3;
                    lv3 = "C";
                }
                if (score3 <= 72 & score3 >= 70) {
                    gp3 = 2.0;
                    lv3 = "C-";
                }
                if (score3 <= 69 & score3 >= 66) {
                    gp3 = 1.7;
                    lv3 = "D+";
                }
                if (score3 <= 63 & score3 >= 65) {
                    gp3 = 1.3;
                    lv3 = "D";
                }
                if (score3 <= 62 & score3 >= 60) {
                    gp3 = 1.0;
                    lv3 = "D-";
                }
                if (score3 <= 59 & score3 >= 0) {
                    lv3 = "F";
                }
                if (score4 >= 90 & score4 <= 100) {
                    gp4 = 4.0;
                    lv4 = "A";
                }
                if (score4 >= 86 & score4 <= 89) {
                    gp4 = 3.7;
                    lv4 = "B+";
                }
                if (score4 <= 85 & score4 >= 83) {
                    gp4 = 3.3;
                    lv4 = "B";
                }
                if (score4 <= 82 & score4 >= 80) {
                    gp4 = 3.0;
                    lv4 = "B-";
                }
                if (score4 <= 79 & score4 >= 76) {
                    gp4 = 2.7;
                    lv4 = "C+";
                }
                if (score4 <= 75 & score4 >= 73) {
                    gp4 = 2.3;
                    lv4 = "C";
                }
                if (score4 <= 72 & score4 >= 70) {
                    gp4 = 2.0;
                    lv4 = "C-";
                }
                if (score4 <= 69 & score4 >= 66) {
                    gp4 = 1.7;
                    lv4 = "D+";
                }
                if (score4 <= 63 & score4 >= 65) {
                    gp4 = 1.3;
                    lv4 = "D";
                }
                if (score4 <= 62 & score4 >= 60) {
                    gp4 = 1.0;
                    lv4 = "D-";
                }
                if (score4 <= 59 & score4 >= 0) {
                    lv4 = "F";
                }
                totalCredit = (int) (credit1 + credit2 + credit3 + credit4);
                weightedAverageScore = (float) ((score1 * credit1 + score2 * credit2 + score3 * credit3 + score4 * credit4) / totalCredit);
                if (weightedAverageScore >= 90 & weightedAverageScore <= 100) {
                    gp = 4.0;
                    lv = "A";
                }
                if (weightedAverageScore >= 86 & weightedAverageScore <= 89) {
                    gp = 3.7;
                    lv = "B+";
                }
                if (weightedAverageScore <= 85 & weightedAverageScore >= 83) {
                    gp = 3.3;
                    lv = "B";
                }
                if (weightedAverageScore <= 82 & weightedAverageScore >= 80) {
                    gp = 3.0;
                    lv = "B-";
                }
                if (weightedAverageScore <= 79 & weightedAverageScore >= 76) {
                    gp = 2.7;
                    lv = "C+";
                }
                if (weightedAverageScore <= 75 & weightedAverageScore >= 73) {
                    gp = 2.3;
                    lv = "C";
                }
                if (weightedAverageScore <= 72 & weightedAverageScore >= 70) {
                    gp = 2.0;
                    lv = "C-";
                }
                if (weightedAverageScore <= 69 & weightedAverageScore >= 66) {
                    gp = 1.7;
                    lv = "D+";
                }
                if (weightedAverageScore <= 63 & weightedAverageScore >= 65) {
                    gp = 1.3;
                    lv = "D";
                }
                if (weightedAverageScore <= 62 & weightedAverageScore >= 60) {
                    gp = 1.0;
                    lv = "D-";
                }
                if (weightedAverageScore <= 59 & weightedAverageScore >= 0) {
                    lv = "F";
                }
                totalGPA = (int) (gp1 * credit1 + gp2 * credit2 + gp3 * credit3 + gp4 * credit4);
                intent.putExtra("Level1", lv1);
                intent.putExtra("Level2", lv2);
                intent.putExtra("Level3", lv3);
                intent.putExtra("Level4", lv4);
                intent.putExtra("Subject1", subject1);
                intent.putExtra("Credit1", credit1);
                intent.putExtra("Score1", score1);
                intent.putExtra("Subject2", subject2);
                intent.putExtra("Credit2", credit2);
                intent.putExtra("Score2", score2);
                intent.putExtra("Subject3", subject3);
                intent.putExtra("Credit3", credit3);
                intent.putExtra("Score3", score3);
                intent.putExtra("Subject4", subject4);
                intent.putExtra("Credit4", credit4);
                intent.putExtra("Score4", score4);
                intent.putExtra("GradePoint1", gp1);
                intent.putExtra("GradePoint2", gp2);
                intent.putExtra("GradePoint3", gp3);
                intent.putExtra("GradePoint4", gp4);
                intent.putExtra("WeightedAverageScore", weightedAverageScore);
                intent.putExtra("TotalGPA", totalGPA);
                intent.putExtra("TotalCredit", totalCredit);
                intent.putExtra("Level", lv);
                intent.putExtra("GradePoint", gp);
                intent.putExtra("Variance", variance);
                startActivity(intent);
            }
        });

    }

    public static void setEditTextInputSpace(EditText editText) {
        InputFilter filter = new InputFilter() {
            @Override
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                if (source.equals(" ") || source.toString().contentEquals("\n")) {
                    return "";
                } else {
                    return null;
                }
            }
        };
        editText.setFilters(new InputFilter[]{filter});
    }
    public static void setEditTextInputSpeChat(EditText editText) {
        InputFilter filter = new InputFilter() {
            @Override
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                String speChat = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
                Pattern pattern = Pattern.compile(speChat);
                Matcher matcher = pattern.matcher(source.toString());
                if (matcher.find()) {
                    return "";
                } else {
                    return null;
                }
            }
        };
        editText.setFilters(new InputFilter[]{filter});
    }
}
