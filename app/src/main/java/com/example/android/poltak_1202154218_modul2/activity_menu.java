package com.example.android.poltak_1202154218_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_menu extends AppCompatActivity {

    @Override
    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void menu  (View view){
        Intent p = new Intent(activity_menu.this, activity_nasigoreng.class); // untuk bisa pindah ke activity nasi goreng dari activity_menu
        startActivity(p);
    }
}
