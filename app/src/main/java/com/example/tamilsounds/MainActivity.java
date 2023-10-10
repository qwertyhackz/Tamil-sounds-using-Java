package com.example.tamilsounds;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button animals,birds, places, fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        birds = findViewById(R.id.birds);
        places = findViewById(R.id.places);
        fruits = findViewById(R.id.fruits);

        birds.setOnClickListener(this);
        places.setOnClickListener(this);
        fruits.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
       int clickedBtnId=v.getId();
        if (clickedBtnId==R.id.birds){
        PlaySounds(R.raw.birds);
        } else if (clickedBtnId == R.id.places) {
            PlaySounds(R.raw.places);
        } else if (clickedBtnId==R.id.fruits) {
            PlaySounds(R.raw.fruits);
        } else if (clickedBtnId==R.id.animals) {
            Intent intent = new Intent(MainActivity.this, Page2.class);
            startActivity(intent);
        }

    }


        public void PlaySounds(int id){
        MediaPlayer mediaPlayer=MediaPlayer.create(
                this,
                id);
        mediaPlayer.start();
        }



        public void Page2(View view) {

        startActivity(new Intent(this,Page2.class));
    }}