package com.opera.android.widget;

import android.app.Application;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.k2d;
import defpackage.kc;
import defpackage.ws8;

/* loaded from: classes.dex */
public class LottieAnimationView extends n2d {
    public static final /* synthetic */ int s = 0;
    public final ws8 o;
    public boolean p;
    public final int q;
    public Runnable r;

    public LottieAnimationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = new ws8(this, (byte) 1);
        kc kcVar = new kc(this, (byte) 17);
        this.q = -1;
        ((n2d) this).d.b.addListener(kcVar);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.o = new ws8(this, (byte) 1);
        kc kcVar = new kc(this, (byte) 17);
        this.q = -1;
        ((n2d) this).d.b.addListener(kcVar);
    }

    public static boolean r(p2d p2dVar) {
        for (h3d h3dVar : p2dVar.d.values()) {
            if (h3dVar.a * h3dVar.b > 16777216) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        ((n2d) this).h = false;
        ((n2d) this).d.j();
        this.p = false;
    }

    public final void h() {
        ((n2d) this).j.add(l2d.f);
        ((n2d) this).d.k();
        this.p = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        ((Application) getContext().getApplicationContext()).registerActivityLifecycleCallbacks(this.o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        if (isInEditMode()) {
            return;
        }
        ((Application) getContext().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
        int i = this.q;
        if (i != -1) {
            f3d f3dVar = ((n2d) this).d;
            if (!f3dVar.i() || ((int) f3dVar.b.h) <= i) {
                return;
            }
            float f = i;
            if (f3dVar.b.e() != f) {
                if (f3dVar.a == null) {
                    f3dVar.e.add(new c3d(f3dVar, i, (byte) 0));
                } else {
                    f3dVar.b.l(f, (int) r3.k);
                }
            }
        }
    }

    public final void q() {
        ((n2d) this).j.add(l2d.f);
        f3d f3dVar = ((n2d) this).d;
        f3dVar.e.clear();
        f3dVar.b.cancel();
        if (!f3dVar.isVisible()) {
            f3dVar.E = 1;
        }
        this.p = false;
    }

    public final void s(int i, int i2, int i3, Runnable runnable) {
        this.r = runnable;
        f();
        p(i);
        ((n2d) this).d.q(i2, i3);
        h();
    }

    public final void t(k2d k2dVar, Runnable runnable) {
        s(k2dVar.c, k2dVar.a, k2dVar.b, runnable);
    }
}
