package com.perocho.perochoquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class        CSScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csscreen);
    }

    public void MainScreen(View view) {

        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);

    }
}
