package com.example.levon.putextra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    static final String KEY_SECOND = "KEY_SECOND";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button buttonSecond = findViewById(R.id.buttonsecond);
        final EditText editTextSecond = findViewById(R.id.textsecond);
        TextView textView = findViewById(R.id.textviewsecond);
        textView.setText(getIntent().getExtras().getString(MainActivity.KEY_FIRST));
        buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ss = getIntent().getExtras().getString(MainActivity.KEY_FIRST) + editTextSecond.getText().toString();
                Intent intent = new Intent();
                intent.putExtra(KEY_SECOND, ss);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
