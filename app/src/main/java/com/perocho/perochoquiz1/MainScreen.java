package com.perocho.perochoquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreen extends AppCompatActivity {


    Button btn_IT;
    Button btn_CS;
    Button btn_IS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        btn_IT = (Button) findViewById(R.id.btn_IT);
        btn_IS = (Button) findViewById(R.id.btn_IS);
        btn_CS = (Button) findViewById(R.id.btn_CS);
    }
    public void buttonClickFunction(View view)
    {

        Intent intent = new Intent(this, CSScreen.class);
        startActivity(intent);
        Intent intent1 = new Intent(this, ITScreen.class);
        startActivity(intent1);
        Intent intent2 = new Intent(this, ISScreen.class);
        startActivity(intent2);

    }

    }





