package defpackage;

import android.net.Uri;
import java.util.Objects;

/* loaded from: classes.dex */
public final class fql {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final Object p = new Object();
    public static final Object q = new Object();
    public static final qjd r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public Object a = p;
    public qjd b = r;
    public Object c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public ljd i;
    public boolean j;
    public long k;
    public long l;
    public int m;
    public int n;
    public long o;

    static {
        ejd ejdVar = new ejd();
        ejdVar.a = "androidx.media3.common.Timeline";
        ejdVar.b = Uri.EMPTY;
        r = ejdVar.a();
        s = "1";
        t = "2";
        u = "3";
        v = "4";
        w = "5";
        x = "6";
        y = "7";
        z = "8";
        A = "9";
        B = "a";
        C = "b";
        D = "c";
        E = "d";
    }

    public final boolean a() {
        return this.i != null;
    }

    public final void b(Object obj, qjd qjdVar, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, ljd ljdVar, long j4, long j5, int i, int i2, long j6) {
        this.a = obj;
        if (qjdVar == null) {
            qjdVar = r;
        }
        this.b = qjdVar;
        this.c = obj2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z2;
        this.h = z3;
        this.i = ljdVar;
        this.k = j4;
        this.l = j5;
        this.m = i;
        this.n = i2;
        this.o = j6;
        this.j = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fql.class.equals(obj.getClass())) {
            fql fqlVar = (fql) obj;
            if (Objects.equals(this.a, fqlVar.a) && Objects.equals(this.b, fqlVar.b) && Objects.equals(this.c, fqlVar.c) && Objects.equals(this.i, fqlVar.i) && this.d == fqlVar.d && this.e == fqlVar.e && this.f == fqlVar.f && this.g == fqlVar.g && this.h == fqlVar.h && this.j == fqlVar.j && this.k == fqlVar.k && this.l == fqlVar.l && this.m == fqlVar.m && this.n == fqlVar.n && this.o == fqlVar.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.c;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        ljd ljdVar = this.i;
        int iHashCode3 = (iHashCode2 + (ljdVar != null ? ljdVar.hashCode() : 0)) * 31;
        long j = this.d;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31;
        long j4 = this.k;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.l;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.m) * 31) + this.n) * 31;
        long j6 = this.o;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
