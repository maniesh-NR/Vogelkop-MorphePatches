package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m1i implements n27 {
    public int a;
    public float b = 1.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e;
    public float f;
    public float g;
    public long h;
    public long i;
    public float j;
    public float k;
    public float l;
    public float m;
    public long n;
    public paj o;
    public boolean p;
    public int q;
    public long r;
    public v1c s;
    public n27 t;
    public d2c u;
    public kh3 v;
    public int w;
    public w7d x;

    public m1i() {
        long j = t3a.a;
        this.h = j;
        this.i = j;
        this.m = 8.0f;
        this.n = a2m.b;
        this.o = kfo.i;
        this.q = 0;
        this.r = 9205357640488583168L;
        this.s = v1c.a;
        this.t = xf8.i();
        this.u = d2c.a;
        this.w = 3;
    }

    public final void a() {
        g(1.0f);
        h(1.0f);
        c(1.0f);
        if (this.e != 0.0f) {
            this.a |= 8;
            this.e = 0.0f;
        }
        t(0.0f);
        l(0.0f);
        long j = t3a.a;
        d(j);
        p(j);
        if (this.j != 0.0f) {
            this.a |= NotificationCompat.FLAG_LOCAL_ONLY;
            this.j = 0.0f;
        }
        if (this.k != 0.0f) {
            this.a |= NotificationCompat.FLAG_GROUP_SUMMARY;
            this.k = 0.0f;
        }
        if (this.l != 0.0f) {
            this.a |= 1024;
            this.l = 0.0f;
        }
        if (this.m != 8.0f) {
            this.a |= 2048;
            this.m = 8.0f;
        }
        r(a2m.b);
        n(kfo.i);
        f(false);
        if (!Intrinsics.a(this.v, null)) {
            this.a |= 262144;
            this.v = null;
        }
        if (this.w != 3) {
            this.a |= 524288;
            this.w = 3;
        }
        if (this.q != 0) {
            this.a |= 32768;
            this.q = 0;
        }
        v1c v1cVar = v1c.a;
        if (!Intrinsics.a(this.s, v1cVar)) {
            this.a |= 1048576;
            this.s = v1cVar;
        }
        this.r = 9205357640488583168L;
        this.x = null;
        this.a = 0;
    }

    @Override // defpackage.n27
    public final float b() {
        return this.t.b();
    }

    public final void c(float f) {
        if (this.d == f) {
            return;
        }
        this.a |= 4;
        this.d = f;
    }

    public final void d(long j) {
        long j2 = this.h;
        int i = u95.h;
        if (jgm.a(j2, j)) {
            return;
        }
        this.a |= 64;
        this.h = j;
    }

    public final void f(boolean z) {
        if (this.p != z) {
            this.a |= 16384;
            this.p = z;
        }
    }

    public final void g(float f) {
        if (this.b == f) {
            return;
        }
        this.a |= 1;
        this.b = f;
    }

    public final void h(float f) {
        if (this.c == f) {
            return;
        }
        this.a |= 2;
        this.c = f;
    }

    public final void l(float f) {
        if (this.g == f) {
            return;
        }
        this.a |= 32;
        this.g = f;
    }

    public final void n(paj pajVar) {
        if (Intrinsics.a(this.o, pajVar)) {
            return;
        }
        this.a |= 8192;
        this.o = pajVar;
    }

    @Override // defpackage.n27
    public final float n0() {
        return this.t.n0();
    }

    public final void p(long j) {
        long j2 = this.i;
        int i = u95.h;
        if (jgm.a(j2, j)) {
            return;
        }
        this.a |= NotificationCompat.FLAG_HIGH_PRIORITY;
        this.i = j;
    }

    public final void r(long j) {
        if (a2m.a(this.n, j)) {
            return;
        }
        this.a |= 4096;
        this.n = j;
    }

    public final void t(float f) {
        if (this.f == f) {
            return;
        }
        this.a |= 16;
        this.f = f;
    }
}
