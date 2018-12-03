package com.example.davidvarassolano.lloguermaterialgires;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EditCommandActivity extends AppCompatActivity {
    Intent intent = getIntent();
    TextView Nomcomanda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_command);
        Nomcomanda = findViewById(R.id.lbl_nomcomanda);
        if (intent != null){
            String nomcomanda = intent.getStringExtra("nomcomanda");
            Nomcomanda.setText(nomcomanda);
        }


    }

}
