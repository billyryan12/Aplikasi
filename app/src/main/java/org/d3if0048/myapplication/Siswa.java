package org.d3if0048.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class Siswa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa);

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter imageAdapter = new ImageAdapter(this);
        viewPager.setAdapter(imageAdapter);

//        ViewPager viewPager = findViewById(R.id.viewPager);
//        ImageAdapter imageAdapter = new ImageAdapter(this);
//        viewPager.setAdapter(imageAdapter);
    }
}
