package com.example.ruchitdutt.trulia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import java.util.Timer;
import java.util.TimerTask;

public class DisplayImage extends AppCompatActivity {
    private static final long DELAY = 1000;
    private boolean scheduled = false;
    private Timer splashTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_display_image);
        splashTimer = new Timer();
        splashTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                DisplayImage.this.finish();
                startActivity(new Intent(DisplayImage.this, MainActivity.class));
            }
        }, DELAY);
        scheduled = true;
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        if (scheduled)
            splashTimer.cancel();
        splashTimer.purge();
    }
}
