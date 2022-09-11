package com.example.webview2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout karar,durbar,shikol,cholchol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        karar=findViewById(R.id.karar);
        durbar=findViewById(R.id.durbar);
        shikol=findViewById(R.id.shikol);
        cholchol=findViewById(R.id.cholchol);

        karar.setOnClickListener(this);
        durbar.setOnClickListener(this);
        shikol.setOnClickListener(this);
        cholchol.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.karar:
                MainActivity2.url="https://www.youtube.com/embed/vygkffWTSxc";
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                break;

            case R.id.durbar:
                MainActivity2.url="https://www.youtube.com/embed/vpcnWJyI4NM";
                Intent intent1=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent1);
                break;

            case R.id.shikol:
                MainActivity2.url="https://www.youtube.com/embed/6lmJocWpmWw";
                Intent intent2=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent2);
                break;

            case R.id.cholchol:
                MainActivity2.url="https://www.youtube.com/embed/QIT-eOIx8Vk";
                Intent intent3=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent3);
                break;
        }

    }
}