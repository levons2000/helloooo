package com.example.levon.putextra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private Button buttonSecond;
    private EditText editTextSecond;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        buttonSecond = findViewById(R.id.buttonsecond);
        editTextSecond = findViewById(R.id.textsecond);
        textView = findViewById(R.id.textviewsecond);
        textView.setText(getIntent().getExtras().getString("KEY_FIRST"));
        buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ss = getIntent().getExtras().getString("KEY_FIRST") + editTextSecond.getText().toString();
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                intent.putExtra("KEY_SECOND", ss);
                startActivityForResult(intent, 2);
            }
        });
    }
}
