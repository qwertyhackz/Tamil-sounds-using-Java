        package com.example.tamilsounds;
        import androidx.appcompat.app.AppCompatActivity;

        import android.media.MediaPlayer;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class Page2 extends AppCompatActivity implements View.OnClickListener{

    Button lion, bear, bison, rhino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animals2);

        lion = findViewById(R.id.lion);
        bear = findViewById(R.id.bear);
        bison = findViewById(R.id.bison);
        rhino = findViewById(R.id.rhino);

        lion.setOnClickListener(this);
        bear.setOnClickListener(this);
        bison.setOnClickListener(this);
        rhino.setOnClickListener(this);
    }
    public void onClick(View v){

        int clickedBtnId = v.getId();

        if (clickedBtnId == R.id.lion) {
            Play(R.raw.lion);
        } else if (clickedBtnId == R.id.bear) {
            Play(R.raw.bear);
        } else if (clickedBtnId == R.id.bison) {
            Play(R.raw.bison);
        } else if (clickedBtnId == R.id.rhino) {
            Play(R.raw.rhino);
        }}


    public void Play(int id) {
        MediaPlayer mediaPlayer = MediaPlayer.create(
                this,
                id
        );
        mediaPlayer.start();}}