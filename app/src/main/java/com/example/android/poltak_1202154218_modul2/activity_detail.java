package com.example.android.poltak_1202154218_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_detail extends AppCompatActivity {

    private Button button; //inisiasi button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        button = (Button) findViewById(R.id.button); // untuk mencari id dari button

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(activity_detail.this, activity_menu.class); //untuk pindah dari activity detail ke activity menu
                startActivity(b); //start
            }
        });
    }
}
