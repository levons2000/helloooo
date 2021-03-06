package com.example.levon.putextra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    static final String KEY_FIRST = "KEY_FIRST";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonMain = findViewById(R.id.buttonfirst);
        final EditText editTextMain = findViewById(R.id.textfirst);
        textView = findViewById(R.id.textext);
        buttonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editTextMain.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(KEY_FIRST, s);
                startActivityForResult(intent, 2);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 2) {
            if (resultCode == RESULT_OK && data != null) {
                textView.setText(String.valueOf(data.getExtras().getString(SecondActivity.KEY_SECOND)));
            }
        }
    }
}
