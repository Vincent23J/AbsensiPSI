package com.si51.newabsensi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;

public class KehadiranActivity extends AppCompatActivity {
    DatePicker datePicker;
    String tanggal, bulan, tahun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kehadiran);

        datePicker = findViewById(R.id.datepicker);
        bulan = String.valueOf(datePicker.getMonth());

        datePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}