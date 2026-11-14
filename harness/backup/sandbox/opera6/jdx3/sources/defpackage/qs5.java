package defpackage;

import android.graphics.Point;
import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qs5 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final sqh k;
    public final int l;
    public final int m;
    public final String n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final boolean u;

    public qs5(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, sqh sqhVar, int i2, int i3, String str9, int i4, int i5, int i6, int i7) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = z;
        this.k = sqhVar;
        this.l = i2;
        this.m = i3;
        this.n = str9;
        this.o = i4;
        this.p = i5;
        this.q = i6;
        this.r = i7;
        this.s = !TextUtils.isEmpty(str);
        this.t = i == 1;
        this.u = i == 2;
        new Point(i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs5)) {
            return false;
        }
        qs5 qs5Var = (qs5) obj;
        return this.a == qs5Var.a && Intrinsics.a(this.b, qs5Var.b) && Intrinsics.a(this.c, qs5Var.c) && Intrinsics.a(this.d, qs5Var.d) && Intrinsics.a(this.e, qs5Var.e) && Intrinsics.a(this.f, qs5Var.f) && Intrinsics.a(this.g, qs5Var.g) && Intrinsics.a(this.h, qs5Var.h) && Intrinsics.a(this.i, qs5Var.i) && this.j == qs5Var.j && Intrinsics.a(this.k, qs5Var.k) && this.l == qs5Var.l && this.m == qs5Var.m && Intrinsics.a(this.n, qs5Var.n) && this.o == qs5Var.o && this.p == qs5Var.p && this.q == qs5Var.q && this.r == qs5Var.r;
    }

    public final int hashCode() {
        int iK = fki.k(z1m.f(z1m.f(z1m.f(z1m.f(z1m.f(z1m.f(z1m.f(z1m.f(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        sqh sqhVar = this.k;
        return Integer.hashCode(this.r) + rfp.c(this.q, rfp.c(this.p, rfp.c(this.o, z1m.f(rfp.c(this.m, rfp.c(this.l, (iK + (sqhVar == null ? 0 : sqhVar.hashCode())) * 31, 31), 31), 31, this.n), 31), 31), 31);
    }

    public final String toString() {
        return "";
    }
}
