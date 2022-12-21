package com.si51.newabsensi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LemburActivity extends AppCompatActivity {
    Button kirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lembur);

        kirim = findViewById(R.id.btn_kirim);

        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LemburActivity.this, "Data Lembur Dikirimkan ke Admin", Toast.LENGTH_SHORT).show();
            }
        });
    }
}