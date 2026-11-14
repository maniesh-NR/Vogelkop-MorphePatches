package com.leanplum.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.leanplum.utils.SizeUtil;

/* loaded from: classes.dex */
public class CloseButton extends View {
    private Paint circlePaint;
    private Paint circlePressedPaint;
    private boolean isPressed;
    private Paint linePaint;
    private float size;
    private float x1;
    private float x2;
    private float y1;
    private float y2;

    public CloseButton(Context context) {
        super(context);
        this.circlePaint = new Paint();
        this.circlePressedPaint = new Paint();
        this.linePaint = new Paint();
        this.isPressed = false;
        SizeUtil.init(context);
        initLabelView();
    }

    public CloseButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.circlePaint = new Paint();
        this.circlePressedPaint = new Paint();
        this.linePaint = new Paint();
        this.isPressed = false;
        SizeUtil.init(context);
        initLabelView();
    }

    private void initLabelView() {
        this.circlePaint.setAntiAlias(true);
        this.circlePaint.setColor(-2236963);
        this.circlePaint.setStrokeWidth(2.0f);
        Paint paint = this.circlePaint;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint.setStyle(style);
        this.circlePressedPaint.setAntiAlias(true);
        this.circlePressedPaint.setColor(-6710887);
        this.circlePressedPaint.setStrokeWidth(2.0f);
        this.circlePressedPaint.setStyle(style);
        this.linePaint.setAntiAlias(true);
        this.linePaint.setColor(-16777216);
        this.linePaint.setStrokeWidth(3.0f);
        this.linePaint.setStyle(style);
        float f = SizeUtil.dp30;
        this.size = f;
        this.x1 = f * 0.33333334f;
        this.x2 = f * 0.6666667f;
        this.y1 = 0.33333334f * f;
        this.y2 = f * 0.6666667f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - 1.0f, this.isPressed ? this.circlePressedPaint : this.circlePaint);
        canvas.drawLine(this.x1, this.y1, this.x2, this.y2, this.linePaint);
        canvas.drawLine(this.x2, this.y1, this.x1, this.y2, this.linePaint);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
        float f = this.size;
        setMeasuredDimension((int) f, (int) f);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.isPressed = true;
            invalidate();
            return true;
        }
        if (motionEvent.getAction() != 1) {
            return super.onTouchEvent(motionEvent);
        }
        this.isPressed = false;
        invalidate();
        performClick();
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }
}
