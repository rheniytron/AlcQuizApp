package com.rheniytron.design.alcmeetups;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);



    }

    public void welcome(View view) {
        Intent intent = new Intent(this,QuestionBox.class);
        startActivity(intent);
    }
}
