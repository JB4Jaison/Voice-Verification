package com.example.voiceverification;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.voiceverification.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.SearchView;


public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    SearchView searchView;
    Button categoryOne;
    Button categoryTwo;
    Button categoryThree;
    Button categoryFour;
    private Intent packageContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        setSupportActionBar(binding.toolbar);

//        setContentView(R.layout.home_screen);
        Button categoryOne = findViewById(R.id.button);
//        Button categoryTwo = findViewById(R.id.button2);
//        Button categoryThree = findViewById(R.id.button3);
//        Button categoryFour = findViewById(R.id.button4);
        categoryOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, AssistantActivity.class);
                startActivity(intent1);
            }
        });
//        categoryTwo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent2 = new Intent(MainActivity.this, AssistantActivity.class);
//                startActivity(intent2);
//            }
//        });
//        categoryThree.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent3 = new Intent(MainActivity.this, AssistantActivity.class);
//                startActivity(intent3);
//            }
//
//        });
//        categoryFour.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent4 = new Intent(MainActivity.this, AssistantActivity.class);
//                startActivity(intent4);
//            }
//        });
//        searchView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intentSearch = new Intent(MainActivity.this, AssistantActivity.class);
//                startActivity(intentSearch);
//            }
//        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id){
            case R.id.action_FAQ:
                Intent intent = new Intent(MainActivity.this,FAQ.class);;
                startActivity(intent);
                break;
        }
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.action_Help) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        return false;
    }


}