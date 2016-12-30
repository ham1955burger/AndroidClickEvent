package com.example.user.zzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {
    final String TAG = getClass().getSimpleName();

    EditText wordEditText;
    Button toastButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind
        wordEditText = (EditText) findViewById(R.id.wordEditText);
        toastButton = (Button) findViewById(R.id.toastButton);

        // 익명 클래스로 구현하기
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 showToast();
            }
        });



        // 기본적인 방법

        /*
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast()
            }
        };

        toastButton.setOnClickListener(listener);
        */

        // implements를 이용한 방법

        //toastButton.setOnClickListener(this);
    }

    /*
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.toastButton:
            showToast()
        }
    }*/

    public void showToast() {
        Toast.makeText(this,
                "입력하신 단어는 '" + wordEditText.getText() + "' 입니다.",
                Toast.LENGTH_SHORT
        ).show();
    }
}
