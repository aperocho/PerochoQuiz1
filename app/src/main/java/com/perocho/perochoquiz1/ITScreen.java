package com.perocho.perochoquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ITScreen extends AppCompatActivity {

    Button btn_CSScreen;
    Button btn_ISScreen;
    Button btn_Home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itscreen);
    }


    public void MainScreen(View view) {

        Intent intent1 = new Intent(this, MainScreen.class);
        startActivity(intent1);

    }
}
