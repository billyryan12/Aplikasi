package org.d3if0048.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mulai extends AppCompatActivity {
    Button siswa;
    Button guru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai);

        siswa = findViewById(R.id.btn_siswa);
        guru = findViewById(R.id.btn_guru);

        siswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mulai.this, Siswa.class);
                startActivity(intent);
            }
        });

        guru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mulai.this, Guru.class);
                startActivity(intent);
            }
        });
    }
}
