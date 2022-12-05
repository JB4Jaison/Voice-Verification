package com.example.voiceverification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileSetiings extends AppCompatActivity {
    Button button1;
    private Intent packageContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_setiings);

        Button button1 = findViewById(R.id.button7);
        Intent intent = getIntent();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ProfileSetiings.this, LogOut.class);
                startActivity(intent1);
            }
        });
    }

}