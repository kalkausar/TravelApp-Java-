package com.example.kalkausar.latihan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Layout_Relative extends AppCompatActivity {
TextView txt_judul1;
TextView lrnmore1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout__relative);

        txt_judul1 = findViewById(R.id.txt_judul1);
        lrnmore1 = findViewById(R.id.learnmore1);
        //txt_judul1.setText(jdl);

        lrnmore1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent readmore = new Intent(Layout_Relative.this,ReadMore.class);
                startActivity( readmore.putExtra("judul",txt_judul1.getText()));
            }
        });

        Button btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v){
                Intent a = new Intent(Layout_Relative.this,Menu_Activity.class);
                startActivity(a);
            }
        });

        Button btn_cls = findViewById(R.id.btn_cls);
        btn_cls.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
                moveTaskToBack(true);
            }
        });
    }
}
