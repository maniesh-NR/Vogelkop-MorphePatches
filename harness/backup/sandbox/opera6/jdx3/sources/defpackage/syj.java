package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class syj {
    public final ode a;
    public final int b;
    public final float c;
    public final long d;
    public Long g;
    public float h;
    public long i;
    public final ArrayList e = new ArrayList();
    public final syj f = this;
    public final ssi j = new ssi(this, (byte) 4);

    public syj(ode odeVar, int i, int i2, float f) {
        this.a = odeVar;
        this.b = i2;
        this.c = f;
        this.d = i / 50;
    }

    public final void a(float f) {
        this.h = (f * f) + this.h;
        long j = this.i + 1;
        this.i = j;
        if (j == this.d) {
            this.h = (float) Math.sqrt(r5 / r2);
            synchronized (this.e) {
                this.e.add(Float.valueOf(this.h));
            }
            this.i = 0L;
            this.h = 0.0f;
        }
    }
}
