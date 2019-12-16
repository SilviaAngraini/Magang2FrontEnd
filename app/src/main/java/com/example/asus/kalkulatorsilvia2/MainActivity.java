package com.example.asus.kalkulatorsilvia2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText angkasatu,angkadua,angkatiga;
    Button btntambah,btnkurang,btnkali,btnbagi;
    TextView hasil,hasil1;
    CheckBox ch1,ch2,ch3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angkasatu = findViewById(R.id.angkasatu);
        angkadua = findViewById(R.id.angkadua);
        angkatiga = findViewById(R.id.angkatiga);
        btntambah =findViewById(R.id.btntambah);
        btnkurang =findViewById(R.id.btnkurang);
        btnkali =findViewById(R.id.btnkali);
        btnbagi =findViewById(R.id.btnbagi);
        hasil = findViewById(R.id.hasil);
        hasil1=findViewById(R.id.hasil1);
        ch1=findViewById(R.id.ch1);
        ch2=findViewById(R.id.ch2);
        ch3=findViewById(R.id.ch3);

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch1.isChecked()&& !ch2.isChecked() && !ch3.isChecked() ||
                        !ch1.isChecked()&& ch2.isChecked() && !ch3.isChecked()||
                        !ch1.isChecked()&& !ch2.isChecked() && ch3.isChecked()){
                    Toast.makeText(getApplicationContext(), "Tidak Boleh 1 Input", Toast.LENGTH_LONG).show();
                }else{
                    if((angkasatu.getText().length()>0) && (angkadua.getText().length()>0)&& (angkatiga.getText().length()>0)){
                        double angka1, angka2, angka3;
                        if (ch1.isChecked()){
                            angka1 = Double.parseDouble(angkasatu.getText().toString());
                        }else{
                            angka1 = 0;
                        }
                        if (ch2.isChecked()){
                            angka2 = Double.parseDouble(angkadua.getText().toString());
                        }else{
                            angka2 = 0;
                        }
                        if (ch3.isChecked()){
                            angka3 = Double.parseDouble(angkatiga.getText().toString());
                        }else{
                            angka3 = 0;
                        }
                        double result =angka1 + angka2 + angka3;
                        hasil1.setText(Double.toString(result));

                    }
                    else {
                        Toast toast =Toast.makeText(MainActivity.this,"Mohon masukkan angka",Toast.LENGTH_LONG);
                        toast.show();
                    }
                }

            }
        });
        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch1.isChecked() && !ch2.isChecked() && !ch3.isChecked() ||
                        !ch1.isChecked() && ch2.isChecked() && !ch3.isChecked() ||
                        !ch1.isChecked() && !ch2.isChecked() && ch3.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Tidak Boleh 1 Input", Toast.LENGTH_LONG).show();
                } else {
                    if ((angkasatu.getText().length() > 0) && (angkadua.getText().length() > 0) && (angkatiga.getText().length() > 0)) {
                        double angka1, angka2, angka3;
                        if (ch1.isChecked()){
                            angka1 = Double.parseDouble(angkasatu.getText().toString());
                        }else{
                            angka1 = 0;
                        }
                        if (ch2.isChecked()){
                            angka2 = Double.parseDouble(angkadua.getText().toString());
                        }else{
                            angka2 = 0;
                        }
                        if (ch3.isChecked()){
                            angka3 = Double.parseDouble(angkatiga.getText().toString());
                        }else{
                            angka3 = 0;
                        }
                        double result = angka1 - angka2 - angka3;
                        hasil1.setText(Double.toString(result));

                    } else {
                        Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka", Toast.LENGTH_LONG);
                        toast.show();
                    }
                }
            }

        });
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch1.isChecked() && !ch2.isChecked() && !ch3.isChecked() ||
                        !ch1.isChecked() && ch2.isChecked() && !ch3.isChecked() ||
                        !ch1.isChecked() && !ch2.isChecked() && ch3.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Tidak Boleh 1 Input", Toast.LENGTH_LONG).show();
                } else {
                    if ((angkasatu.getText().length() > 0) && (angkadua.getText().length() > 0) && (angkatiga.getText().length() > 0)) {
                        double angka1, angka2, angka3;
                        if (ch1.isChecked()){
                            angka1 = Double.parseDouble(angkasatu.getText().toString());
                        }else{
                            angka1 = 1;
                        }
                        if (ch2.isChecked()){
                            angka2 = Double.parseDouble(angkadua.getText().toString());
                        }else{
                            angka2 = 1;
                        }
                        if (ch3.isChecked()){
                            angka3 = Double.parseDouble(angkatiga.getText().toString());
                        }else{
                            angka3 = 1;
                        }
                        double result = angka1 * angka2 * angka3;
                        hasil1.setText(Double.toString(result));

                    } else {
                        Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka", Toast.LENGTH_LONG);
                        toast.show();
                    }
                }
            }
        });
        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch1.isChecked() && !ch2.isChecked() && !ch3.isChecked() ||
                        !ch1.isChecked() && ch2.isChecked() && !ch3.isChecked() ||
                        !ch1.isChecked() && !ch2.isChecked() && ch3.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Tidak Boleh 1 Input", Toast.LENGTH_LONG).show();
                } else {
                    if ((angkasatu.getText().length() > 0) && (angkadua.getText().length() > 0) && (angkatiga.getText().length() > 0)) {
                        double angka1, angka2, angka3;
                        if (ch1.isChecked()){
                            angka1 = Double.parseDouble(angkasatu.getText().toString());
                        }else{
                            angka1 = 1;
                        }
                        if (ch2.isChecked()){
                            angka2 = Double.parseDouble(angkadua.getText().toString());
                        }else{
                            angka2 = 1;
                        }
                        if (ch3.isChecked()){
                            angka3 = Double.parseDouble(angkatiga.getText().toString());
                        }else{
                            angka3 = 1;
                        }
                        double result = angka1 / angka2 / angka3;
                        hasil1.setText(Double.toString(result));
                    } else {
                        Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka", Toast.LENGTH_LONG);
                        toast.show();
                    }
                }
            }
        });
    }
}


