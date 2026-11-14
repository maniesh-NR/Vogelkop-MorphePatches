package com.opera.android;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.c1f;
import defpackage.h03;
import defpackage.khh;
import defpackage.kze;

/* loaded from: classes.dex */
public class StatusBarDrawingFrameLayout extends FrameLayout {
    public static final /* synthetic */ int l = 0;
    public final h03 a;
    public final Paint b;
    public c1f c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final boolean g;
    public int h;
    public final kze i;
    public int j;
    public int k;

    public StatusBarDrawingFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StatusBarDrawingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.a = new h03(this, (byte) 2);
        this.b = new Paint();
        this.e = true;
        this.g = true;
        this.i = new kze(0);
        this.j = 0;
        this.k = 0;
        setWillNotDraw(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.J, 0, 0);
        this.j = typedArrayObtainStyledAttributes.getColor(3, this.j);
        this.k = typedArrayObtainStyledAttributes.getColor(2, this.k);
        this.e = typedArrayObtainStyledAttributes.getBoolean(1, this.e);
        this.f = typedArrayObtainStyledAttributes.getBoolean(0, this.f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a() {
        c1f c1fVar;
        c1f c1fVar2;
        boolean zIsAttachedToWindow = isAttachedToWindow();
        h03 h03Var = this.a;
        if (zIsAttachedToWindow && getVisibility() == 0) {
            if (this.d || (c1fVar2 = this.c) == null) {
                return;
            }
            this.d = true;
            c1fVar2.d(h03Var);
            return;
        }
        if (!this.d || (c1fVar = this.c) == null) {
            return;
        }
        this.d = false;
        c1fVar.g(h03Var);
    }

    public final void b() {
        invalidate();
        c1f c1fVar = this.c;
        if (c1fVar != null) {
            c1fVar.e();
        }
    }

    public final void c(boolean z) {
        if (z == this.e) {
            return;
        }
        this.e = z;
        requestApplyInsets();
        b();
    }

    public final void d(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        requestApplyInsets();
        b();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        c1f c1fVar = this.c;
        if (c1fVar != null) {
            if (c1fVar.b || Color.alpha(this.k) >= 255) {
                int i = this.k;
                Paint paint = this.b;
                paint.setColor(i);
                canvas.drawRect(0.0f, getHeight() - ((Integer) this.i.g()).intValue(), getWidth(), getHeight(), paint);
            }
        }
    }

    public final void e(int i) {
        if (i == this.j) {
            return;
        }
        this.j = i;
        b();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        d3o d3oVar = g3o.g(this, windowInsets).a;
        r9b r9bVarI = d3oVar.i(519);
        int i = (!this.e || this.c == null) ? 0 : r9bVarI.b;
        int i2 = this.c != null ? r9bVarI.d : 0;
        kze kzeVar = this.i;
        if (i2 != ((Integer) kzeVar.g()).intValue()) {
            kzeVar.r(Integer.valueOf(i2));
            invalidate();
        }
        int iIntValue = this.f ? ((Integer) kzeVar.g()).intValue() : 0;
        if (this.g) {
            iIntValue = Math.max(iIntValue, d3oVar.i(8).d);
        }
        setPadding(0, i, 0, iIntValue);
        if (i != this.h) {
            this.h = i;
            invalidate();
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = c1f.c(this);
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        c1f c1fVar;
        super.onDetachedFromWindow();
        if (this.d && (c1fVar = this.c) != null) {
            this.d = false;
            c1fVar.g(this.a);
        }
        this.c = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.e ? this.j : 0;
        Paint paint = this.b;
        paint.setColor(i);
        canvas.drawRect(0.0f, 0.0f, getWidth(), this.h, paint);
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        if (f == getAlpha()) {
            return;
        }
        super.setAlpha(f);
        b();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        a();
    }
}
