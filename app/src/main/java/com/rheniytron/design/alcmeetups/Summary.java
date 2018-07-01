package com.rheniytron.design.alcmeetups;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
    }

    public void doneWithQuiz(View view) {

//        Bundle likeApp = new Bundle();
//        likeApp.putInt("result",8);
//
//        Intent i = new Intent(this, QuestionBox.class);
//        i.putExtras(likeApp);
//        setResult(RESULT_OK,i);
//        startActivityForResult(i,1);

        Intent intent=new Intent();
        intent.putExtra("result",8);
        setResult(1,intent);

        finish();
        //TODO return to summary with value 8 to ask user if they like the app

    }



    public void btn_link0(View view) {openUrl(getString(R.string.link0));
    }
    public void btn_link1(View view) {openUrl(getString(R.string.link1));
    }
    public void btn_link2(View view) {openUrl(getString(R.string.link2));
    }
    public void btn_link3(View view) {openUrl(getString(R.string.link3));
    }
    public void btn_link4(View view) {openUrl(getString(R.string.link4));
    }
    public void btn_link5(View view) {openUrl(getString(R.string.link5));
    }

    void openUrl(String url){

        Intent urlIntent = new Intent(Intent.ACTION_VIEW);
        urlIntent.setData(Uri.parse(url));
        startActivity(urlIntent);

    }
}
