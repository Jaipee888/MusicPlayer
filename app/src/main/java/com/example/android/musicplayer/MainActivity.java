package com.example.android.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button playmusic,pausemusic;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bhagwadgitatwo);

        playmusic = (Button) findViewById(R.id.play);
        pausemusic = (Button) findViewById(R.id.pause);

        /*tx1 = (TextView)findViewById(R.id.textView2);
        tx2 = (TextView)findViewById(R.id.textView3);
        tx3.setText("Song.mp3");*/


        pausemusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Pausing sound",Toast.LENGTH_SHORT).show();
                        mediaPlayer.pause();

            }
        });


        playmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(), "Playing sound",Toast.LENGTH_SHORT).show();
                mediaPlayer.start();

            }
        });

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mediaPlayer1) {
                Toast.makeText(getApplicationContext(), "I'm Done ",Toast.LENGTH_SHORT).show();
                mediaPlayer1.release(); // finish current activity
            }
        });




    }
/*
    public void playmusic () {
        TextView playView = (TextView) findViewById(R.id.play);

        mediaPlayer.start();

    }


    public void pausemusic () {
        mediaPlayer.pause();
    }*/
}
