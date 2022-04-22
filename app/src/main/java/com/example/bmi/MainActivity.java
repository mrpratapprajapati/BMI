package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText KG,CM;
    Button SB;
    TextView TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        KG = findViewById(R.id.KG);
        CM = findViewById(R.id.CM);
        SB = findViewById(R.id.SB);
        TV = findViewById(R.id.TV);

        SB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Float HIGHT = Float.parseFloat(CM.getText().toString());
                Float WEIGHT = Float.parseFloat(KG.getText().toString());

                Float h = HIGHT/100;
                Float ANS = WEIGHT/(h*h);

                if(ANS<18.5){

                    TV.setText("Under Weight health : " + ANS);
                }else if(ANS>=18.5 && ANS<25){

                    TV.setText("Normal Weight health : " + ANS);
                }else if(ANS>=25 && ANS<30){

                    TV.setText(" Over Weight health : " + ANS);
                }
                else{

                    TV.setText(" Obesity health : " + ANS);
                }

            }

        });
    }
}