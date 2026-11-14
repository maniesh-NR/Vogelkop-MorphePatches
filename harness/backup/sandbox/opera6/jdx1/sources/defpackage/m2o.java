package defpackage;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class m2o {
    public final int a;
    public float b;
    public final Interpolator c;
    public final short d;

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public m2o(int i, Interpolator interpolator, long j) {
        this.a = i;
        this.c = interpolator;
        this.d = (int) j;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.d;
    }

    public float c() {
        float f = this.b;
        Interpolator interpolator = this.c;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    public int d() {
        return this.a;
    }

    public void e(float f) {
        this.b = f;
    }
}
