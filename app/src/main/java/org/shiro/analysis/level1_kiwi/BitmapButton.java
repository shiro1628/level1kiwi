package org.shiro.analysis.level1_kiwi;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class BitmapButton extends AppCompatButton {

    public BitmapButton(Context context) {
        super(context);


        init(context);
    }

    public BitmapButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    private void init(Context context){
        setBackgroundResource(R.drawable.kiwi1_1);

        float textSize = getResources().getDimension(R.dimen.text_size);
        setTextSize(textSize);
        setTextColor(Color.WHITE);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();

        switch (action){
            case MotionEvent.ACTION_DOWN:
                setBackgroundResource(R.drawable.kiwi3_3);
                break;

            case MotionEvent.ACTION_UP:
                setBackgroundResource(R.drawable.kiwi1_1);
                break;

        }
        invalidate();
        return true;
    }
}

