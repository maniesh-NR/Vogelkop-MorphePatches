package com.opera.android;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import defpackage.c1f;
import defpackage.kqe;
import defpackage.wuf;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/opera/android/OverlaidStatusBarDrawingView;", "Landroid/view/View;", "wuf", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OverlaidStatusBarDrawingView extends View {
    public static final /* synthetic */ int g = 0;
    public final kqe a;
    public final Paint b;
    public c1f c;
    public int d;
    public int e;
    public wuf f;

    public OverlaidStatusBarDrawingView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = new kqe(this, (byte) 1);
        this.b = new Paint();
        this.f = wuf.a;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int i = this.e;
        Paint paint = this.b;
        paint.setColor(i);
        canvas.drawRect(0.0f, 0.0f, getWidth(), this.d, paint);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int i = g3o.g(this, windowInsets).a.i(519).b;
        if (i != this.d) {
            this.d = i;
            invalidate();
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c1f c1fVarC = c1f.c(this);
        this.c = c1fVarC;
        if (c1fVarC != null) {
            c1fVarC.d(this.a);
        }
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c1f c1fVar = this.c;
        if (c1fVar != null) {
            c1fVar.g(this.a);
        }
        this.c = null;
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        if (f != getAlpha()) {
            super.setAlpha(f);
            invalidate();
            c1f c1fVar = this.c;
            if (c1fVar != null) {
                c1fVar.e();
            }
        }
    }
}
