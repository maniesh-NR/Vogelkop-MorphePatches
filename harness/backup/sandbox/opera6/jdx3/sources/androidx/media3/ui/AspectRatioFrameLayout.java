package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import defpackage.pa2;
import defpackage.qa2;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public final qa2 a;
    public pa2 b;
    public float c;
    public int d;

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, yhh.a, 0, 0);
            try {
                this.d = typedArrayObtainStyledAttributes.getInt(0, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.a = new qa2(this, (byte) 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r4 > 0.0f) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r4 > 0.0f) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        r1 = r1 / r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        r2 = r2 * r3;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.c
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L3d
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.c
            float r4 = r4 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r3
            float r3 = java.lang.Math.abs(r4)
            r5 = 1008981770(0x3c23d70a, float:0.01)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r5 = 1
            qa2 r6 = r8.a
            if (r3 > 0) goto L3e
            r6.getClass()
            r8 = 0
            r6.b = r8
            boolean r8 = r6.c
            if (r8 != 0) goto L3d
            r6.c = r5
            android.widget.FrameLayout r8 = r6.d
            androidx.media3.ui.AspectRatioFrameLayout r8 = (androidx.media3.ui.AspectRatioFrameLayout) r8
            r8.post(r6)
        L3d:
            return
        L3e:
            int r3 = r8.d
            if (r3 == 0) goto L5b
            if (r3 == r5) goto L56
            r7 = 2
            if (r3 == r7) goto L51
            r7 = 4
            if (r3 != r7) goto L65
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            float r3 = r8.c
            if (r10 <= 0) goto L61
            goto L63
        L51:
            float r9 = r8.c
            float r2 = r2 * r9
        L54:
            int r9 = (int) r2
            goto L65
        L56:
            float r10 = r8.c
            float r1 = r1 / r10
        L59:
            int r0 = (int) r1
            goto L65
        L5b:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            float r3 = r8.c
            if (r10 <= 0) goto L63
        L61:
            float r1 = r1 / r3
            goto L59
        L63:
            float r2 = r2 * r3
            goto L54
        L65:
            r6.getClass()
            r6.b = r5
            boolean r10 = r6.c
            if (r10 != 0) goto L77
            r6.c = r5
            android.widget.FrameLayout r10 = r6.d
            androidx.media3.ui.AspectRatioFrameLayout r10 = (androidx.media3.ui.AspectRatioFrameLayout) r10
            r10.post(r6)
        L77:
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }
}
