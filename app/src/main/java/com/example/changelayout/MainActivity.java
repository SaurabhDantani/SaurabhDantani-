package com.example.changelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    RelativeLayout layout1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout1 = findViewById(R.id.layout1);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random= new Random();
                int color = Color.argb(255,random.nextInt(256),random.nextInt(256),random.nextInt(256));
                layout1.setBackgroundColor(color);
                //Toast.makeText(getApplicationContext(),"YOU CAN SEE CHANGE LAYOUT COLOR",Toast.LENGTH_LONG ).show();
            }
        });
    }
}
