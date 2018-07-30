package com.neofelis.carousel.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ViewFlipper;

/**
 * Created by Norton on 2018/7/30.
 *CarouselViewFlipper
 */

public class CarouselViewFlipper extends ViewFlipper {
    private static final String TAG = "CarouselViewFlipper";
    
    public CarouselViewFlipper(Context context) {
        super(context);
    }

    public CarouselViewFlipper(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        performClick();
        switch (event.getAction()) {
            case MotionEvent.ACTION_MOVE:
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "onTouchEvent: action up");
                break;
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "onTouchEvent: action down");
                stopFlipping();
                break;
            default:
                break;
        }
        return true;
    }

    @Override
    public boolean performClick() {
        return super.performClick();
    }
}
