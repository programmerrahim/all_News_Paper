package com.rahim.gridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView btn_prothomalo;
    private ImageView btn_bangladeshprotidin;
    private ImageView btn_ittefak;
    private ImageView btn_kalerkontho;
    private ImageView btn_noyadigonto;
    private ImageView btn_bbc;
    private ImageView btn_jagonews;
    private ImageView btn_amadersomoy;
    private ImageView btn_voiceofamerica;
    private ImageView btn_bdlive24;
    private ImageView btn_dt;
    private ImageView btn_news24;
    private ImageView btn_banglatribune;
    private ImageView btn_bangladeshonline;
    private ImageView btn_banglanews24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_prothomalo = findViewById(R.id.prothomAloId);
        btn_bangladeshprotidin = findViewById(R.id.bdProtidinId);
        btn_ittefak = findViewById(R.id.ittefakId);
        btn_kalerkontho = findViewById(R.id.kalerKonthoId);
        btn_noyadigonto = findViewById(R.id.noyaDigontoId);
        btn_bbc = findViewById(R.id.bbcId);
        btn_jagonews = findViewById(R.id.jagoId);
        btn_amadersomoy = findViewById(R.id.amaderSomoiiId);
        btn_voiceofamerica = findViewById(R.id.voiceOfAmericaId);
        btn_bdlive24 = findViewById(R.id.bdLiveId);
        btn_dt = findViewById(R.id.dhakaTribuneId);
        btn_news24 = findViewById(R.id.news24Id);
        btn_banglatribune = findViewById(R.id.banglaTribuneId);
        btn_bangladeshonline = findViewById(R.id.bangladeshOnlineId);
        btn_banglanews24 = findViewById(R.id.bdNewsId);




        btn_prothomalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Matching.class);
                startActivity(intent);
            }
        });

        btn_bangladeshprotidin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BdProtidin_Activity.class);
                startActivity(intent);
            }
        });

        btn_ittefak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Ittafak_Activity.class);
                startActivity(intent);
            }
        });

        btn_kalerkontho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,KalerKontho_Activity.class);
                startActivity(intent);
            }
        });

        btn_noyadigonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NoyaDigonto_Activity.class);
                startActivity(intent);
            }
        });

        btn_bbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Bbc_Activity.class);
                startActivity(intent);
            }
        });

        btn_jagonews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Jago_Activity.class);
                startActivity(intent);
            }
        });

        btn_amadersomoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AmaderSomoy_Activity.class);
                startActivity(intent);
            }
        });

        btn_voiceofamerica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,VoiceOfAmerica_Activity.class);
                startActivity(intent);
            }
        });

        btn_bdlive24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BdLive24_Activity.class);
                startActivity(intent);
            }
        });

        btn_dt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DhakaTribune_Activity.class);
                startActivity(intent);
            }
        });

         btn_news24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,News24_Activity.class);
                startActivity(intent);
            }
        });

        btn_banglatribune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BanglaTribune_Activity.class);
                startActivity(intent);
            }
        });

        btn_bangladeshonline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BangladeshOnline_Activity.class);
                startActivity(intent);
            }
        });

        btn_banglanews24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BanglaNews_Activity.class);
                startActivity(intent);
            }
        });


    }



}
