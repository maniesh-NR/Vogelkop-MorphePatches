package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jcl {
    public final String a;
    public final String b;
    public final String c;
    public final lcl d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final ncl k;
    public final String l;
    public final String m;
    public final ou9 n;
    public final ebb o;
    public final Integer p;

    public jcl(String str, String str2, String str3, lcl lclVar, String str4, String str5, String str6, String str7, String str8, String str9, ncl nclVar, String str10, String str11, ou9 ou9Var, ebb ebbVar, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = lclVar;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = nclVar;
        this.l = str10;
        this.m = str11;
        this.n = ou9Var;
        this.o = ebbVar;
        this.p = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcl)) {
            return false;
        }
        jcl jclVar = (jcl) obj;
        return this.a.equals(jclVar.a) && Intrinsics.a(this.b, jclVar.b) && Intrinsics.a(this.c, jclVar.c) && this.d == jclVar.d && Intrinsics.a(this.e, jclVar.e) && Intrinsics.a(this.f, jclVar.f) && Intrinsics.a(this.g, jclVar.g) && Intrinsics.a(this.h, jclVar.h) && Intrinsics.a(this.i, jclVar.i) && Intrinsics.a(this.j, jclVar.j) && this.k == jclVar.k && Intrinsics.a(this.l, jclVar.l) && Intrinsics.a(this.m, jclVar.m) && Intrinsics.a(this.n, jclVar.n) && Intrinsics.a(this.o, jclVar.o) && this.p.equals(jclVar.p);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iF = z1m.f((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.i);
        String str5 = this.j;
        int iHashCode5 = (this.k.hashCode() + ((iF + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        String str6 = this.l;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.m;
        return this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
