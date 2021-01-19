package com.safalfrom2050.adscreen;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

import com.bumptech.glide.Glide;
import com.safalfrom2050.adscreen.View.ImageAd;

public class MainActivity extends Activity {

    private ImageView imageAdView;
    private VideoView videoAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageAdView = findViewById(R.id.imageAdView);
        videoAdView = findViewById(R.id.videoAdView);
        //loadImageAd();
        loadVideo();
    }

    public void loadVideo(){

        videoAdView.setVisibility(View.VISIBLE);

        // Sample
        Uri videoUri = Uri.parse("https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4");

        videoAdView.setVideoURI(videoUri);

        videoAdView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {

                videoAdView.start();
            }
        });

        videoAdView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                // Restart Video
                videoAdView.seekTo(1);
                videoAdView.start();
            }
        });

    }

    public void loadImageAd(){
        String url = "https://www.verdict.co.uk/wp-content/uploads/2017/09/giphy-downsized-large.gif";
        ImageAd imageAd = new ImageAd(12, url, 50);

        Log.d("TEST", "id: "+ imageAd.getId()+" timeout: "+imageAd.getTimeout());


        imageAdView.setVisibility(View.VISIBLE);
        // TODO: Add placeholder, image scale, etc
        Glide.with(this).load(url).into(imageAdView);
    }
}
