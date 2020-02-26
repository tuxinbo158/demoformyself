package com.arcsoft.sdk_demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.arcsoft.sdk_demo.Fragment.HomeActivity;
import com.arcsoft.sdk_demo.R;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Signin extends Activity{
    ImageView back;
    TextView time;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Button Sure;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
        Sure=findViewById(R.id.sure);
        time=findViewById(R.id.time1);
//        back=findViewById(R.id.back);
       Intent intent=getIntent();


        Sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Signin.this, HomeActivity.class);
                startActivity(intent);
               finish();
            }
        });
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");// HH:mm:ss
//获取当前时间
        Date date = new Date(System.currentTimeMillis());
        time.setText(simpleDateFormat.format(date));
    }
}
