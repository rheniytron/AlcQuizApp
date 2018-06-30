package com.rheniytron.design.alcmeetups;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class QuestionBox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_box);

        questionField = (TextView) findViewById(R.id.tv_qtns);
        progressbar0 = (View) findViewById(R.id.v_q0);
        progressbar1 = (View) findViewById(R.id.v_q1);
        progressbar2 = (View) findViewById(R.id.v_q2);
        progressbar3 = (View) findViewById(R.id.v_q3);
        progressbar4 = (View) findViewById(R.id.v_q4);
        progressbar5 = (View) findViewById(R.id.v_q5);

        nextQ();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    TextView questionField;
    View progressbar0,progressbar1,progressbar2,progressbar3,progressbar4,progressbar5;

    //increase the count on each question answered in the quiz
    int counter_Question = 0;

    //Stores the values of the answers in relating to the Quiz in 2d array
    String questions[][] = new String [][]{

            {"I am 40,  Am I too old to learn User Experience?",
                    "It will at least take me a year to learn User Experience","Is learning User Experience necessary?",
                    "Learning User Experience will cost a lot of money","I do need a coding experience to learn User Experience",
                    "Is there a large community of User Interface/User Experience designers ",
                    " Do you like this app and it will give you a feedback"}, {"no","no","no","no","no","no","no"}
    };

    public void btn_yes(View view) {

        nextQ();
        ansCheck(counter_Question,"yes");
    }


    public void btn_no(View view) {
        nextQ();
        ansCheck(counter_Question,"no");
    }

    //next question
    void nextQ(){

        if (counter_Question >= 6){
            startActivity( new Intent(this, Summary.class));
            return;}

        questionField.setText(questions[0][counter_Question]);

        switch (counter_Question) {
            case 1:
                progressbar1.setVisibility(View.VISIBLE);
                break;
            case 2:
                progressbar2.setVisibility(View.VISIBLE);
                break;
            case 3:
                progressbar3.setVisibility(View.VISIBLE);
                break;
            case 4:
                progressbar4.setVisibility(View.VISIBLE);
                break;
            case 5:
                progressbar5.setVisibility(View.VISIBLE);
                break;
        }

        counter_Question +=1;
            Log.d("fine","counter");
    }


    // @qtnNum to identify the corrent Question
    // @selected to get the Question selected answer
    private void ansCheck(int qtnNum, String selected) {
        if (qtnNum >= 7)
            return;
        if (selected.equals("yes"))
            questions[1][qtnNum] = "yes";
        if (selected.equals("no"))
            questions[1][qtnNum] = "no";

        Log.d(questions[0][qtnNum].toString(),"qtn");
        Log.d(questions[1][qtnNum].toString(),"ans");
    }



}
