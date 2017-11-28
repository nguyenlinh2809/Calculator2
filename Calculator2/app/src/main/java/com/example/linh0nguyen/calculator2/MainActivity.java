package com.example.linh0nguyen.calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn1, btn_clear, btn_sin;
    TextView tvPhepTinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn_sin = (Button) findViewById(R.id.btn_sin);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        tvPhepTinh = (TextView) findViewById(R.id.tvPhepTinh);
        btn1.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_sin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                tvPhepTinh.setText(btn1.getText().toString());
                break;
            case R.id.btn_sin:
                tvPhepTinh.setText(btn_sin.getText().toString());
                break;
            case R.id.btn_clear:
                tvPhepTinh.setText("");
                break;
            default:
                break;
        }
    }
}
