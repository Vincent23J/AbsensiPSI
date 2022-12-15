package com.si51.newabsensi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class AbsenActivity extends AppCompatActivity {
    private Button btn_logout, btn_ok;
    private Spinner spAksi;
    private String Aksi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absen);

        btn_logout = findViewById(R.id.btn_logout);
        btn_ok = findViewById(R.id.btn_ok);
        Intent intent = new Intent(AbsenActivity.this, MainActivity.class);
        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
                finish();
                Toast.makeText(AbsenActivity.this, "Logout Berhasil", Toast.LENGTH_SHORT).show();
            }
        });

        spAksi = findViewById(R.id.spinneraksi);
        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Aksi = spAksi.getSelectedItem().toString();
                if (Aksi.equals("Hadir")){
                    Toast.makeText(AbsenActivity.this, "Absensi Berhasil Di Simpan", Toast.LENGTH_SHORT).show();
                } else if(Aksi.equals("Izin")){
                    Toast.makeText(AbsenActivity.this, "Izin Berhasil", Toast.LENGTH_SHORT).show();
                } else if(Aksi.equals("Lembur")){
                    Toast.makeText(AbsenActivity.this, "Permintaan Lembur Berhasil Dikirim", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}