package com.example.student.baitaptk_tuan2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt1;
    EditText edt2;
    TextView tong;
    Button btnClickTong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        btnClickTong = findViewById(R.id.btnClickTong);
        tong = findViewById(R.id.tong);
        btnClickTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=Integer.parseInt(edt1.getText().toString());
                int b=Integer.parseInt( edt2.getText().toString());
                tong.setText(a+b+"");
            }
        });
    }
}
