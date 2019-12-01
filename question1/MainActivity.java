package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Integer Value = 0;
    Button button1;
    EditText first, second;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.compute);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                first = (EditText) findViewById(R.id.FirstNum);
                second = (EditText) findViewById(R.id.SecondNum);

                Value=Integer.valueOf(first.getText().toString()) + Integer.valueOf(second.getText().toString());
                result = (TextView) findViewById(R.id.Result);
                result.setText(Value.toString());
            }
        });
    }

}
