package defpackage;

import androidx.core.app.NotificationCompat;
import androidx.work.OverwritingInputMerger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h5o {
    public final String a;
    public int b;
    public final String c;
    public final String d;
    public ib6 e;
    public final ib6 f;
    public long g;
    public final long h;
    public final long i;
    public xo5 j;
    public final int k;
    public int l;
    public long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public int r;
    public final int s;
    public final int t;
    public final long u;
    public final int v;
    public final int w;
    public String x;

    static {
        qs7.B("WorkSpec");
    }

    public h5o(String str, int i, String str2, String str3, ib6 ib6Var, ib6 ib6Var2, long j, long j2, long j3, xo5 xo5Var, int i2, int i3, long j4, long j5, long j6, long j7, boolean z, int i4, int i5, int i6, long j8, int i7, int i8, String str4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = ib6Var;
        this.f = ib6Var2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = xo5Var;
        this.k = i2;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z;
        this.r = i4;
        this.s = i5;
        this.t = i6;
        this.u = j8;
        this.v = i7;
        this.w = i8;
        this.x = str4;
    }

    public /* synthetic */ h5o(String str, int i, String str2, String str3, ib6 ib6Var, ib6 ib6Var2, long j, long j2, long j3, xo5 xo5Var, int i2, int i3, long j4, long j5, long j6, long j7, boolean z, int i4, int i5, long j8, int i6, int i7, String str4, int i8) {
        this(str, (i8 & 2) != 0 ? 1 : i, str2, (i8 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i8 & 16) != 0 ? ib6.b : ib6Var, (i8 & 32) != 0 ? ib6.b : ib6Var2, (i8 & 64) != 0 ? 0L : j, (i8 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0 ? 0L : j2, (i8 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 0L : j3, (i8 & NotificationCompat.FLAG_GROUP_SUMMARY) != 0 ? xo5.j : xo5Var, (i8 & 1024) != 0 ? 0 : i2, (i8 & 2048) != 0 ? 1 : i3, (i8 & 4096) != 0 ? 30000L : j4, (i8 & 8192) != 0 ? -1L : j5, (i8 & 16384) == 0 ? j6 : 0L, (32768 & i8) != 0 ? -1L : j7, (65536 & i8) != 0 ? false : z, (131072 & i8) != 0 ? 1 : i4, (262144 & i8) != 0 ? 0 : i5, 0, (1048576 & i8) != 0 ? Long.MAX_VALUE : j8, (2097152 & i8) != 0 ? 0 : i6, (4194304 & i8) != 0 ? -256 : i7, (i8 & 8388608) != 0 ? null : str4);
    }

    public final long a() {
        int i = this.b;
        int i2 = this.k;
        boolean z = i == 1 && i2 > 0;
        int i3 = this.l;
        long j = this.m;
        long j2 = this.n;
        boolean zC = c();
        long j3 = this.g;
        long j4 = this.u;
        int i4 = this.s;
        if (j4 != Long.MAX_VALUE && zC) {
            if (i4 != 0) {
                long j5 = j2 + 900000;
                if (j4 < j5) {
                    return j5;
                }
            }
            return j4;
        }
        if (z) {
            long jScalb = i3 == 2 ? j * i2 : (long) Math.scalb(j, i2 - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j2 + jScalb;
        }
        if (!zC) {
            if (j2 == -1) {
                return Long.MAX_VALUE;
            }
            return j2 + j3;
        }
        long j6 = this.h;
        long j7 = i4 == 0 ? j2 + j3 : j2 + j6;
        long j8 = this.i;
        return (j8 == j6 || i4 != 0) ? j7 : (j6 - j8) + j7;
    }

    public final boolean b() {
        return !Intrinsics.a(xo5.j, this.j);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5o)) {
            return false;
        }
        h5o h5oVar = (h5o) obj;
        return Intrinsics.a(this.a, h5oVar.a) && this.b == h5oVar.b && Intrinsics.a(this.c, h5oVar.c) && Intrinsics.a(this.d, h5oVar.d) && Intrinsics.a(this.e, h5oVar.e) && Intrinsics.a(this.f, h5oVar.f) && this.g == h5oVar.g && this.h == h5oVar.h && this.i == h5oVar.i && Intrinsics.a(this.j, h5oVar.j) && this.k == h5oVar.k && this.l == h5oVar.l && this.m == h5oVar.m && this.n == h5oVar.n && this.o == h5oVar.o && this.p == h5oVar.p && this.q == h5oVar.q && this.r == h5oVar.r && this.s == h5oVar.s && this.t == h5oVar.t && this.u == h5oVar.u && this.v == h5oVar.v && this.w == h5oVar.w && Intrinsics.a(this.x, h5oVar.x);
    }

    public final int hashCode() {
        int iC = rfp.c(this.w, rfp.c(this.v, z1m.e(rfp.c(this.t, rfp.c(this.s, (vep.A(this.r) + fki.k(z1m.e(z1m.e(z1m.e(z1m.e((vep.A(this.l) + rfp.c(this.k, (this.j.hashCode() + z1m.e(z1m.e(z1m.e((this.f.hashCode() + ((this.e.hashCode() + z1m.f(z1m.f((vep.A(this.b) + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q)) * 31, 31), 31), 31, this.u), 31), 31);
        String str = this.x;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return o18.p(new StringBuilder("{WorkSpec: "), this.a, '}');
    }
}
