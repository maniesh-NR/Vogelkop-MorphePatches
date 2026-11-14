package com.opera.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.custom_views.StylingImageView;
import defpackage.b9i;
import defpackage.khh;
import defpackage.q8i;
import defpackage.s8i;

/* loaded from: classes.dex */
public class RoundedImageView extends StylingImageView {
    public static final /* synthetic */ int n = 0;
    public int k;
    public int l;
    public float[] m;

    public RoundedImageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.D, 0, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        if (typedArrayObtainStyledAttributes.hasValue(5) || typedArrayObtainStyledAttributes.hasValue(6) || typedArrayObtainStyledAttributes.hasValue(2) || typedArrayObtainStyledAttributes.hasValue(1)) {
            float[] fArr = new float[4];
            this.m = fArr;
            float f = dimensionPixelSize;
            fArr[0] = typedArrayObtainStyledAttributes.getDimension(5, f);
            this.m[1] = typedArrayObtainStyledAttributes.getDimension(6, f);
            this.m[2] = typedArrayObtainStyledAttributes.getDimension(2, f);
            this.m[3] = typedArrayObtainStyledAttributes.getDimension(1, f);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(int i, int i2) {
        if (this.k == i && this.l == i2 && this.m == null) {
            return;
        }
        this.k = i;
        this.l = i2;
        this.m = null;
        Drawable drawable = getDrawable();
        if (drawable instanceof b9i) {
            invalidate();
        } else if (drawable instanceof q8i) {
            ((q8i) drawable).a(i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.android.custom_views.StylingImageView
    public final void setImageDrawable(Drawable drawable) {
        Bitmap bitmap;
        if ((this.k != 0 || this.l != 0 || this.m != null) && (drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && bitmap.getHeight() > 0 && bitmap.getWidth() > 0) {
            if (getScaleType() == ImageView.ScaleType.CENTER_CROP && this.m == null) {
                drawable = new b9i(this, bitmap);
            } else {
                float[] fArr = this.m;
                if (fArr != null) {
                    PathInterpolator pathInterpolator = s8i.d;
                    drawable = new q8i(bitmap, fArr);
                } else {
                    int i = this.k;
                    int i2 = this.l;
                    PathInterpolator pathInterpolator2 = s8i.d;
                    drawable = new q8i(bitmap, i, i2);
                }
            }
        }
        super.setImageDrawable(drawable);
    }
}
