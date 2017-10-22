package com.example.souhaib.currency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText t1 = (EditText) findViewById(R.id.t1);
        final RadioButton rb1 = (RadioButton) findViewById(R.id.rb1);
        final RadioButton rb2 = (RadioButton) findViewById(R.id.rb2);
        final TextView tv2 = (TextView) findViewById(R.id.tv2);
        Button btn1 = (Button) findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb1.isChecked()){
                    String ch = t1.getText().toString();
                    double varCurr = Double.parseDouble(ch) * 3;
                    tv2.setText(String.valueOf(varCurr));
                    Toast.makeText(MainActivity.this, "To Euro", Toast.LENGTH_LONG).show();
                }
                else if (rb2.isChecked()){
                    String ch = t1.getText().toString();
                    double varCurr = Double.parseDouble(ch) / 3;
                    tv2.setText(String.valueOf(String.format("%.2f",varCurr)));
                    Toast.makeText(MainActivity.this, "To dinar :(", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
