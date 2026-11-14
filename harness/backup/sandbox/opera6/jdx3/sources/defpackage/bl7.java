package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
public final class bl7 extends hyf implements dth {
    public final Drawable f;
    public final t0g g = hyg.k(0);
    public final t0g h;
    public final zyk i;

    public bl7(Drawable drawable) {
        long jFloatToRawIntBits;
        this.f = drawable;
        byte b = 0;
        l4c l4cVar = cl7.a;
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            jFloatToRawIntBits = 9205357640488583168L;
        } else {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            jFloatToRawIntBits = (Float.floatToRawIntBits(intrinsicWidth) << 32) | (Float.floatToRawIntBits(intrinsicHeight) & 4294967295L);
        }
        this.h = hyg.k(new bpj(jFloatToRawIntBits));
        this.i = z4c.b(new al7(this, b));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        Drawable.Callback callback = (Drawable.Callback) this.i.getValue();
        Drawable drawable = this.f;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    public final void b() {
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        Drawable drawable = this.f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    public final boolean d(float f) {
        this.f.setAlpha(djh.c(zed.b(f * 255.0f), 0, 255));
        return true;
    }

    public final boolean e(kh3 kh3Var) {
        this.f.setColorFilter(kh3Var != null ? kh3Var.a : null);
        return true;
    }

    public final void f(d2c d2cVar) {
        int i;
        int iOrdinal = d2cVar.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                h9o.p();
                return;
            }
        } else {
            i = 0;
        }
        this.f.setLayoutDirection(i);
    }

    public final long h() {
        return ((bpj) this.h.getValue()).a;
    }

    public final void i(mk7 mk7Var) {
        a31 a31VarA = mk7Var.s0().A();
        ((Number) this.g.getValue()).intValue();
        try {
            a31VarA.j();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.f;
            if (i >= 31 || !(drawable instanceof AnimatedImageDrawable)) {
                drawable.setBounds(0, 0, zed.b(bpj.d(mk7Var.e())), zed.b(bpj.b(mk7Var.e())));
            } else {
                a31VarA.a(bpj.d(mk7Var.e()) / bpj.d(h()), bpj.b(mk7Var.e()) / bpj.b(h()));
            }
            Canvas canvas = b31.a;
            drawable.draw(a31VarA.a);
        } finally {
            a31VarA.f();
        }
    }
}
