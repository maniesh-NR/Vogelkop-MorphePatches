package com.leanplum.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.leanplum.utils.BitmapUtil;
import com.leanplum.utils.SizeUtil;

/* loaded from: classes.dex */
public class BackgroundImageView extends AppCompatImageView {
    private Matrix emptyMatrix;
    private boolean loadedBitmap;
    private Paint paint;
    private boolean roundedCorners;

    /* JADX WARN: Multi-variable type inference failed */
    public BackgroundImageView(Context context, int i, Bitmap bitmap, boolean z) {
        super(context);
        this.paint = new Paint();
        this.emptyMatrix = new Matrix();
        this.roundedCorners = z;
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setImageBitmap(bitmap);
        ViewUtils.applyBackground(this, i, z);
        init();
    }

    public BackgroundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.paint = new Paint();
        this.emptyMatrix = new Matrix();
        init();
    }

    public BackgroundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.paint = new Paint();
        this.emptyMatrix = new Matrix();
        init();
    }

    public BackgroundImageView(Context context, boolean z) {
        super(context);
        this.paint = new Paint();
        this.emptyMatrix = new Matrix();
        init();
        this.roundedCorners = !z;
    }

    private void init() {
        this.paint.setColor(-16711936);
        this.paint.setStrokeWidth(2.0f);
        this.paint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    public Bitmap loadBitmapFromView(View view) {
        if (view.getMeasuredHeight() <= 0) {
            view.measure(-2, -2);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        this.loadedBitmap = true;
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
        if (this.roundedCorners) {
            if (this.loadedBitmap) {
                this.loadedBitmap = false;
                return;
            }
            Bitmap bitmapLoadBitmapFromView = loadBitmapFromView(this);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas.drawBitmap(BitmapUtil.getRoundedCornerBitmap(bitmapLoadBitmapFromView, SizeUtil.dp20), this.emptyMatrix, this.paint);
        }
    }
}
