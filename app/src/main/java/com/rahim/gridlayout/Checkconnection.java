package com.rahim.gridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Checkconnection extends AppCompatActivity {
    Button reloadbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkconnection);

        reloadbutton = findViewById(R.id.reloadId);


       reloadbutton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              Intent intent = new Intent(Checkconnection.this,MainActivity.class);
              startActivity(intent );
           }
       });

    }

}
