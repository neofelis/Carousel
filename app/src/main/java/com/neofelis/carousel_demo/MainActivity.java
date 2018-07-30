package com.neofelis.carousel_demo;

import android.app.Activity;
import android.os.Bundle;

import com.neofelis.carousel.view.CarouselViewFlipper;

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarouselViewFlipper carousel = findViewById(R.id.carousel);
    }

}
