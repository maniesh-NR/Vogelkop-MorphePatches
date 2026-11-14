package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import defpackage.a6n;
import defpackage.g00;
import defpackage.j6j;
import defpackage.khh;
import defpackage.nij;
import defpackage.z5n;

/* loaded from: classes.dex */
public class FadingNestedScrollView extends NestedScrollView implements a6n, nij {
    public final z5n D;
    public final boolean E;
    public j6j F;
    public final m9f G;
    public g00 H;
    public boolean I;
    public boolean J;
    public boolean K;

    /* JADX WARN: Multi-variable type inference failed */
    public FadingNestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.D = new z5n(this, context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.l);
        if (typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            this.G = new m9f(this);
            this.E = typedArrayObtainStyledAttributes.getBoolean(1, true);
            this.J = typedArrayObtainStyledAttributes.getBoolean(0, false);
        } else {
            this.E = false;
            this.J = false;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.nij
    public final void a(g00 g00Var) {
        this.H = g00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a6n
    public final void c() {
        if (this.J) {
            return;
        }
        this.J = true;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dispatchDraw(Canvas canvas) {
        super/*android.view.View*/.dispatchDraw(canvas);
        z5n z5nVar = this.D;
        int i = z5nVar.f;
        z5nVar.a(canvas, this, 0.0f, getChildCount() == 0 ? 0.0f : getScrollY() < i ? getScrollY() / i : 1.0f, 0.0f, z5nVar.b(this));
    }

    @Override // defpackage.a6n
    public final void f() {
        z5n z5nVar = this.D;
        if (z5nVar.n) {
            return;
        }
        z5nVar.n = true;
        z5nVar.a.invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a6n
    public final void h(ColorStateList colorStateList) {
        this.D.r = colorStateList;
        invalidate();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9f m9fVar = this.G;
        if (m9fVar != null) {
            m9fVar.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
        m9f m9fVar = this.G;
        if (m9fVar != null) {
            m9fVar.h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        boolean z = this.E;
        z5n z5nVar = this.D;
        boolean z2 = false;
        m9f m9fVar = this.G;
        if (m9fVar == null) {
            if (z) {
                z5nVar.f(false);
            }
            if (this.J) {
                z5nVar.e(false);
            }
        } else if (View.MeasureSpec.getMode(i) != 0) {
            int iE = m9fVar.e();
            boolean z3 = iE > 0;
            this.I = true;
            setPadding(iE, getPaddingTop(), iE, getPaddingBottom());
            this.I = false;
            z5nVar.f(z && iE > 0);
            if (this.J && iE > 0) {
                z2 = true;
            }
            z5nVar.e(z2);
            z2 = z3;
        }
        super.onMeasure(i, i2);
        if (z2 != this.K) {
            this.K = z2;
            g00 g00Var = this.H;
            if (g00Var != null) {
                g00Var.a(z2);
            }
        }
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onScrollChanged(i, i2, i3, i4);
        j6j j6jVar = this.F;
        if (j6jVar == null || (i5 = j6jVar.a) < 0) {
            return;
        }
        boolean z = i2 > i5;
        if (j6jVar.b != z) {
            j6jVar.b = z;
            MenuItem menuItem = j6jVar.c.w;
            if (menuItem != null) {
                menuItem.setVisible(z);
            }
        }
    }

    public final void requestLayout() {
        if (this.I) {
            return;
        }
        super.requestLayout();
    }
}
