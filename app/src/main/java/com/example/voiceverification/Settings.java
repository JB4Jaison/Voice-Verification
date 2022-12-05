package com.example.voiceverification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings extends AppCompatActivity {
    private Intent packageContext;
    Button profilesettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        profilesettings = findViewById(R.id.settingsbutton);
        Intent intent = getIntent();


        profilesettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Settings.this, ProfileSetiings.class);
                startActivity(intent1);
            }
        });
    }

}