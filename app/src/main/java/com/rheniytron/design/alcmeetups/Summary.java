package com.rheniytron.design.alcmeetups;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
    }

    public void doneWithQuiz(View view) {
                    startActivity( new Intent(this, Summary.class));
    }
}
