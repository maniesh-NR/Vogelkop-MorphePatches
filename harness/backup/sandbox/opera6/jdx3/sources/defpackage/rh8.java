package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class rh8 {
    public static final long n;
    public static final long o;
    public static final AccelerateInterpolator p;
    public static final DecelerateInterpolator q;
    public static final long r;
    public static final long s;
    public static final fci t;
    public static final LinearInterpolator u;
    public static final long v;
    public static final long w;
    public final pde a;
    public final b2l b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final View e;
    public final RecyclerView f;
    public final RecyclerView g;
    public final z5l h;
    public final wv3 i;
    public final nqi j;
    public final j1k k;
    public final c1f l;
    public final long m = SystemClock.uptimeMillis();

    static {
        on7 on7Var = pn7.b;
        un7 un7Var = un7.d;
        long jX0 = cs5.x0(150, un7Var);
        n = jX0;
        long jX02 = cs5.x0(150, un7Var);
        o = jX02;
        p = lf1.b;
        q = lf1.c;
        r = cs5.x0(20, un7Var);
        s = cs5.x0(700, un7Var);
        t = new fci();
        u = lf1.f;
        v = cs5.y0(Long.max(pn7.f(cs5.x0(350, un7Var)), pn7.f(pn7.m(jX02, jX0))), un7Var);
        w = cs5.x0(100, un7Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rh8(defpackage.pde r1, defpackage.b2l r2, android.view.ViewGroup r3, android.view.ViewGroup r4, android.view.View r5, androidx.recyclerview.widget.RecyclerView r6, androidx.recyclerview.widget.RecyclerView r7, defpackage.z5l r8, defpackage.wv3 r9, defpackage.nqi r10, defpackage.j1k r11) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh8.<init>(pde, b2l, android.view.ViewGroup, android.view.ViewGroup, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView, z5l, wv3, nqi, j1k):void");
    }

    public final void a(long j) {
        pn7 pn7Var = new pn7(j);
        long j2 = n;
        this.j.invoke(pn7Var, new pn7(j2));
        this.d.animate().setDuration(pn7.f(j2)).setStartDelay(pn7.f(j)).alpha(0.0f).setUpdateListener(new nl2(this, (byte) 7)).withEndAction(new nh8(this, (byte) 2));
        this.e.animate().setInterpolator(lf1.n).setDuration(pn7.f(j2)).scaleX(0.7f).scaleY(0.7f).alpha(0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh8.b():void");
    }
}
