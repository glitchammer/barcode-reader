package com.google.android.gms.samples.vision.barcodereader;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by dbahls on 10/09/2017.
 */

public class DebugView extends View {

    private Rect debugRect;

    public DebugView(Context context) {
        super(context);
    }

    public DebugView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DebugView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public DebugView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }



    public void setDebugRect(Rect debugRect) {
        this.debugRect = debugRect;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (debugRect==null) return;

        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);

        canvas.drawRect(debugRect, paint);

    }


}
