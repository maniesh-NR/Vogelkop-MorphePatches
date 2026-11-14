package defpackage;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;

/* loaded from: classes.dex */
public class zvb {
    public final p2d a;
    public final Object b;
    public Object c;
    public final BaseInterpolator d;
    public final BaseInterpolator e;
    public final BaseInterpolator f;
    public final float g;
    public Float h;
    public float i;
    public float j;
    public int k;
    public int l;
    public float m;
    public float n;
    public PointF o;
    public PointF p;

    public zvb(g2a g2aVar, g2a g2aVar2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = null;
        this.b = g2aVar;
        this.c = g2aVar2;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }

    public zvb(Object obj) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = null;
        this.b = obj;
        this.c = obj;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }

    public zvb(p2d p2dVar, Object obj, Object obj2, BaseInterpolator baseInterpolator, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = p2dVar;
        this.b = obj;
        this.c = obj2;
        this.d = baseInterpolator;
        this.e = null;
        this.f = null;
        this.g = f;
        this.h = f2;
    }

    public zvb(p2d p2dVar, Object obj, Object obj2, BaseInterpolator baseInterpolator, BaseInterpolator baseInterpolator2, float f) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = p2dVar;
        this.b = obj;
        this.c = obj2;
        this.d = null;
        this.e = baseInterpolator;
        this.f = baseInterpolator2;
        this.g = f;
        this.h = null;
    }

    public zvb(p2d p2dVar, Object obj, Object obj2, BaseInterpolator baseInterpolator, BaseInterpolator baseInterpolator2, BaseInterpolator baseInterpolator3, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = p2dVar;
        this.b = obj;
        this.c = obj2;
        this.d = baseInterpolator;
        this.e = baseInterpolator2;
        this.f = baseInterpolator3;
        this.g = f;
        this.h = f2;
    }

    public final float a() {
        p2d p2dVar = this.a;
        if (p2dVar == null) {
            return 1.0f;
        }
        float f = this.n;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        if (this.h == null) {
            this.n = 1.0f;
            return 1.0f;
        }
        float fFloatValue = ((this.h.floatValue() - this.g) / (p2dVar.k - p2dVar.j)) + b();
        this.n = fFloatValue;
        return fFloatValue;
    }

    public final float b() {
        p2d p2dVar = this.a;
        if (p2dVar == null) {
            return 0.0f;
        }
        float f = this.m;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        float f2 = p2dVar.j;
        float f3 = (this.g - f2) / (p2dVar.k - f2);
        this.m = f3;
        return f3;
    }

    public final boolean c() {
        return this.d == null && this.e == null && this.f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.b + ", endValue=" + this.c + ", startFrame=" + this.g + ", endFrame=" + this.h + ", interpolator=" + this.d + '}';
    }
}
