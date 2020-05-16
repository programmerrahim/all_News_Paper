package com.rahim.gridlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class AmaderSomoy_Activity extends AppCompatActivity {
    WebView prothomalowebview;
    ProgressBar progressBarWeb;
    ProgressDialog progressDialog;
    SwipeRefreshLayout swipeRefreshLayout;





    //Main Method Starts

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matching);




        //find ProgressBar
        progressBarWeb = findViewById(R.id.progressBarId);
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading Please wait...");
        //Find Swipe Layout
        swipeRefreshLayout = findViewById(R.id.swipeLayoutId);
        //Set Listener on SwipeLayoute Start
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                prothomalowebview.loadUrl("http://www.dainikamadershomoy.com/");
            }
        });
        //Set Listener on SwipeLayoute Ends
        LoadWeb();

        //WebChromeClient Start
        prothomalowebview.setWebChromeClient(new WebChromeClient(){

            @Override
            public void onProgressChanged(WebView view, int newProgress) {

                progressBarWeb.setVisibility(View.VISIBLE);
                progressBarWeb.setProgress(newProgress);

                if (newProgress==100){
                    progressBarWeb.setVisibility(View.GONE);
                    setTitle(view.getTitle());
                    progressDialog.dismiss();
                }

                super.onProgressChanged(view, newProgress);
            }
        });
        //WebChromeClient Ends




        checkConnection();









    }
    //Main Method Ends


    //Load Method Start
    public  void LoadWeb(){
        //Find prothomAloWebView
        prothomalowebview = findViewById(R.id.prothomAloWebId);



        prothomalowebview.loadUrl("http://www.dainikamadershomoy.com/");
        swipeRefreshLayout.setRefreshing(true);
        swipeRefreshLayout.setColorSchemeColors(Color.BLUE,Color.YELLOW,Color.GREEN);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                prothomalowebview.loadUrl("http://www.dainikamadershomoy.com/");
                checkConnection();
            }
        });

        //WebView Client Start
        prothomalowebview.setWebViewClient(new WebViewClient(){

            @Override
            public void onPageFinished(WebView view, String url) {
                swipeRefreshLayout.setRefreshing(false);
                super.onPageFinished(view, url);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

        //WebView Client Ends

        WebSettings webSettings = prothomalowebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        prothomalowebview.getSettings().setLoadWithOverviewMode(true);
        prothomalowebview.getSettings().setUseWideViewPort(true);
        prothomalowebview.getSettings().setDomStorageEnabled(true);
        prothomalowebview.getSettings().setLoadsImagesAutomatically(true);
        prothomalowebview.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        prothomalowebview.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        prothomalowebview.getSettings().setAppCacheEnabled(true);
        prothomalowebview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        prothomalowebview.getSettings().setDomStorageEnabled(true);
        prothomalowebview.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        prothomalowebview.getSettings().setSavePassword(true);
        prothomalowebview.getSettings().setSaveFormData(true);
        prothomalowebview.getSettings().setEnableSmoothTransition(true);

    }

    //Load Method Ends

    //Back Button Start

    @Override
    public void onBackPressed(){

        try {
            if (prothomalowebview.canGoBack()){
                prothomalowebview.goBack();
            }
            else{
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Do you want to Exit?")
                        .setNegativeButton("No",null)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(AmaderSomoy_Activity.this,MainActivity.class);
                                startActivity(intent);
                                finish();
                                finishAffinity();
                            }
                        }).show();
            }

        }
        catch (Exception e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();
        };

    }

//Back Button Ends

    //Check Connection Start
    public void checkConnection(){

        ConnectivityManager manager = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = manager.getActiveNetworkInfo();

        if (null!=activeNetwork){

            if (activeNetwork.getType()==ConnectivityManager.TYPE_WIFI){
                Toast.makeText(this,"Wifi Connected",Toast.LENGTH_SHORT).show();
            }
            if (activeNetwork.getType()==ConnectivityManager.TYPE_MOBILE){
                Toast.makeText(this,"Mobile Network Connected",Toast.LENGTH_SHORT).show();
            }


        }

        else{
            Intent intent = new Intent(AmaderSomoy_Activity.this,Checkconnection.class);
            startActivity(intent);
        }
    }
    //Check Connection Ends

    //Home Button Method Start



    //Home Button Method Ends






}
