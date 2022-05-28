package com.trentin.cerebrum;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button play,exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = (Button) findViewById(R.id.jogar);
        play.setOnClickListener(this);
        exit = (Button) findViewById(R.id.sair);
        exit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == play) {
            Intent i = new Intent(this, Tela1.class);
            Bundle b = new Bundle();
            i.putExtras(b);
            startActivity(i);
        }
        if (view == exit) {
            finishAffinity();
        }
    }
}