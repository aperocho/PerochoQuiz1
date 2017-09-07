package com.perocho.perochoquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ISScreen extends AppCompatActivity {

    Button btn_ITScreen;
    Button btn_CSScreen;
    Button btn_Home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isscreen);
    }


    public void MainScreen(View view) {

        Intent intent2 = new Intent(this, MainScreen.class);
        startActivity(intent2);
    }
}

