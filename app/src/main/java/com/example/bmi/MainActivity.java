package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView result;
        EditText edtweight, edtheightin, edtheightft;
        Button btncalculate;

        edtweight = findViewById(R.id.edtweight);
        edtheightin = findViewById(R.id.edtheightin);
        edtheightft = findViewById(R.id.edtheightft);
        result = findViewById(R.id.result);
        btncalculate = findViewById(R.id.calculate);

        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt = Integer.parseInt(edtweight.getText().toString());
                int ft = Integer.parseInt(edtheightft.getText().toString());
                int in = Integer.parseInt(edtheightin.getText().toString());

                int totalIn = ft * 12 + in;
                double totalCm = totalIn * 2.53;

                double totalm = totalCm / 100;
                double bmi = wt / (totalm * totalm);

                if (bmi > 25) {
                    result.setText("You are over weight");
                } else if (bmi < 18) {
                    result.setText("You are under weight");
                } else {
                    result.setText("You are healthy");
                }

            }
        });
    }
}