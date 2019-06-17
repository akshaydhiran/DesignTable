package com.example.designtable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed;
    Button btn;
    TextView a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20;
    int a, r;

    private void init(){
        ed = findViewById(R.id.E1);
        btn = findViewById(R.id.B2);
        a1 = findViewById(R.id.num1);
        a2 = findViewById(R.id.num2);
        a3 = findViewById(R.id.num3);
        a4 = findViewById(R.id.num4);
        a5 = findViewById(R.id.num5);
        a6 = findViewById(R.id.num6);
        a7 = findViewById(R.id.num7);
        a8 = findViewById(R.id.num8);
        a9 = findViewById(R.id.num9);
        a10 = findViewById(R.id.num10);
        a11 =findViewById(R.id.num11);
        a12 = findViewById(R.id.num22);
        a13 = findViewById(R.id.num33);
        a14 = findViewById(R.id.num44);
        a15 = findViewById(R.id.num55);
        a16 = findViewById(R.id.num66);
        a17 = findViewById(R.id.num77);
        a18 = findViewById(R.id.num88);
        a19 = findViewById(R.id.num99);
        a20 = findViewById(R.id.num100);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(ed.getText().toString());
                a1.setText(num+"");
                a2.setText(num+"");
                a3.setText(num+"");
                a4.setText(num+"");
                a5.setText(num+"");
                a6.setText(num+"");
                a7.setText(num+"");
                a8.setText(num+"");
                a9.setText(num+"");
                a10.setText(num+"");

                a11.setText(num*1+"");
                a12.setText(num*2+"");
                a13.setText(num*3+"");
                a14.setText(num*4+"");
                a15.setText(num*5+"");
                a16.setText(num*6+"");
                a17.setText(num*7+"");
                a18.setText(num*8+"");
                a19.setText(num*9+"");
                a20.setText(num*10+"");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
