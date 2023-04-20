package com.project.deeplearningfish;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    Button identifikasi, bantuan, tentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        identifikasi = findViewById(R.id.button_identification);
        bantuan = findViewById(R.id.button_help);
        tentang = findViewById(R.id.button_about);

        setEvent();
    }

    private void setEvent() {
        identifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iden = new Intent(HomeActivity.this, IdentifikasiActivity.class);
                startActivity(iden);
            }
        });

        bantuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iden = new Intent(HomeActivity.this, BantuanActivity.class);
                startActivity(iden);
            }
        });

        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iden = new Intent(HomeActivity.this, TentangActivity.class);
                startActivity(iden);
            }
        });
    }
}