package com.opera.android.custom_views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import defpackage.fr8;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class OverlayView extends View {
    public static final /* synthetic */ int e = 0;
    public final int[] a;
    public final float[] b;
    public final ArrayList c;
    public fr8 d;

    public OverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new int[2];
        this.b = new float[2];
        this.c = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        fr8 fr8Var = this.d;
        if (fr8Var == null) {
            return;
        }
        View view = fr8Var.getView();
        Matrix matrix = view.getMatrix();
        int[] iArr = this.a;
        view.getLocationInWindow(iArr);
        float translationX = (iArr[0] + this.d.j) - view.getTranslationX();
        float translationY = (iArr[1] + this.d.k) - view.getTranslationY();
        getLocationInWindow(iArr);
        float[] fArr = this.b;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        float f = (translationX - iArr[0]) - fArr[0];
        float f2 = (translationY - iArr[1]) - fArr[1];
        int iSave = canvas.save();
        canvas.translate(f, f2);
        canvas.concat(matrix);
        this.d.g(canvas);
        canvas.restoreToCount(iSave);
    }
}
