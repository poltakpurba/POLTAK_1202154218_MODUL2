package com.example.android.poltak_1202154218_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class takeaway extends AppCompatActivity {

    private Button button; // inisiasi button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeaway);

        button = (Button) findViewById(R.id.button2); //untuk mendapatkan id button

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(takeaway.this, activity_menu.class); // untuk pindah dari activity TakeAway ke activity menu
                startActivity(a);
            }
        });
    }
}
