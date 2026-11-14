package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.opera.android.utilities.DisplayUtil;

/* loaded from: classes.dex */
public class AspectRatioImageView extends AppCompatImageView {
    public final Point a;

    public AspectRatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Point();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            android.graphics.drawable.Drawable r0 = r8.getDrawable()
            if (r0 != 0) goto La
            super.onMeasure(r9, r10)
            return
        La:
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            int r2 = android.view.View.MeasureSpec.getSize(r10)
            int r3 = r0.getIntrinsicWidth()
            int r0 = r0.getIntrinsicHeight()
            android.graphics.Point r4 = r8.a
            r4.set(r3, r0)
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            int r3 = r0.width
            r5 = -2
            r6 = -1
            if (r3 != r6) goto L39
            int r7 = r0.height
            if (r7 != r5) goto L39
            int r9 = r4.y
            int r9 = r9 * r1
            int r10 = r4.x
            int r2 = r9 / r10
            r4.y = r2
            r4.x = r1
            goto L8c
        L39:
            if (r3 != r5) goto L4b
            int r5 = r0.height
            if (r5 != r6) goto L4b
            int r9 = r4.x
            int r9 = r9 * r2
            int r10 = r4.y
            int r1 = r9 / r10
            r4.x = r1
            r4.y = r2
            goto L8c
        L4b:
            int r0 = r0.height
            if (r3 <= 0) goto L5e
            if (r0 > 0) goto L6d
            int r9 = r4.y
            int r9 = r9 * r3
            int r10 = r4.x
            int r2 = r9 / r10
            r4.y = r2
            r4.x = r3
            r1 = r3
            goto L8c
        L5e:
            if (r0 <= 0) goto L6d
            int r9 = r4.x
            int r9 = r9 * r0
            int r10 = r4.y
            int r1 = r9 / r10
            r4.x = r1
            r4.y = r0
            r2 = r0
            goto L8c
        L6d:
            if (r1 <= 0) goto L7d
            if (r2 != 0) goto L7d
            int r9 = r4.y
            int r9 = r9 * r1
            int r10 = r4.x
            int r2 = r9 / r10
            r4.y = r2
            r4.x = r1
            goto L8c
        L7d:
            if (r2 <= 0) goto L90
            if (r1 != 0) goto L90
            int r9 = r4.x
            int r9 = r9 * r2
            int r10 = r4.y
            int r1 = r9 / r10
            r4.x = r1
            r4.y = r2
        L8c:
            r8.setMeasuredDimension(r1, r2)
            return
        L90:
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.custom_views.AspectRatioImageView.onMeasure(int, int):void");
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i) {
        Configuration configuration = getResources().getConfiguration();
        DisplayUtil.f(getContext());
        if (DisplayUtil.c.densityDpi != 160 || (configuration.screenLayout & 15) != 4) {
            super.setImageResource(i);
            return;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        setImageBitmap(BitmapFactory.decodeResource(getResources(), i, options));
    }
}
