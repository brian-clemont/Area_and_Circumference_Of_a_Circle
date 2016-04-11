package com.coutinho.brian.areacircumferenceofacircle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class main_activity extends AppCompatActivity implements View.OnClickListener {
private Button area,circumference;
    private TextView result;
    private EditText input_radius;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);

        area =(Button)findViewById(R.id.button_area);
        area.setOnClickListener(this);
        circumference = (Button)findViewById(R.id.button_circumference);
        circumference.setOnClickListener(this);
        input_radius =(EditText)findViewById(R.id.input_radius);
        result =(TextView)findViewById(R.id.area_result);

    }

    @Override
    public void onClick(View v) {
            String inputS = input_radius.getText().toString();
            float radius = Float.parseFloat(inputS);

            float pi = (float) 3.14;
            switch (v.getId()) {
                case R.id.button_area:
                    float areaOfCircle;
                    areaOfCircle = pi * (radius * radius);
                    result.setText(getString(R.string.areaOfC) + " " + areaOfCircle);
                    break;
                case R.id.button_circumference:
                    float circumference;
                    circumference = 2 * pi * radius;
                    result.setText(getString(R.string.circumferenceOfCircle) + " " + circumference);
                    break;
            }

    }
}
