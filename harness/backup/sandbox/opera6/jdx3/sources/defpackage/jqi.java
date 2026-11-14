package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class jqi {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Set j;
    public final String k;
    public final long l;
    public final int m;
    public final List n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final Boolean u;
    public final Integer v;

    public jqi(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Set set, String str10, long j, int i, List list, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = set;
        this.k = str10;
        this.l = j;
        this.m = i;
        this.n = list;
        this.o = str11;
        this.p = str12;
        this.q = str13;
        this.r = str14;
        this.s = str15;
        this.t = str16;
        this.u = bool;
        this.v = num;
    }

    public final String a() {
        f8a f8aVar = f8a.h;
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(this.c);
        sb.append("opera_combined");
        sb.append(this.d);
        sb.append(this.e);
        sb.append(this.f);
        sb.append(this.g);
        sb.append(this.i);
        sb.append(CollectionsKt.P(CollectionsKt.b0(this.j), ",", (CharSequence) null, (String) null, 0, (Function1) null, 62));
        sb.append(this.o);
        String str = this.q;
        List listX = StringsKt.X(str, new char[]{'.'});
        if (listX.size() > 2) {
            str = listX.get(0) + "." + listX.get(1);
        }
        sb.append(str);
        sb.append(this.s);
        sb.append(this.t);
        sb.append(this.u);
        sb.append(this.v);
        return f8aVar.a(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqi)) {
            return false;
        }
        jqi jqiVar = (jqi) obj;
        return Intrinsics.a(this.a, jqiVar.a) && Intrinsics.a(this.b, jqiVar.b) && Intrinsics.a(this.c, jqiVar.c) && Intrinsics.a(this.d, jqiVar.d) && Intrinsics.a(this.e, jqiVar.e) && Intrinsics.a(this.f, jqiVar.f) && Intrinsics.a(this.g, jqiVar.g) && Intrinsics.a(this.h, jqiVar.h) && Intrinsics.a(this.i, jqiVar.i) && Intrinsics.a(this.j, jqiVar.j) && Intrinsics.a(this.k, jqiVar.k) && this.l == jqiVar.l && this.m == jqiVar.m && Intrinsics.a(this.n, jqiVar.n) && Intrinsics.a(this.o, jqiVar.o) && Intrinsics.a(this.p, jqiVar.p) && Intrinsics.a(this.q, jqiVar.q) && Intrinsics.a(this.r, jqiVar.r) && Intrinsics.a(this.s, jqiVar.s) && Intrinsics.a(this.t, jqiVar.t) && Intrinsics.a(this.u, jqiVar.u) && Intrinsics.a(this.v, jqiVar.v);
    }

    public final int hashCode() {
        String str = this.a;
        int iF = z1m.f(z1m.f(z1m.f((((this.c.hashCode() + z1m.f((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31) + 270718449) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.g;
        int iHashCode = (iF + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iF2 = z1m.f(rfp.f(rfp.c(this.m, z1m.e(z1m.f((this.j.hashCode() + z1m.f((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.i)) * 31, 31, this.k), 31, this.l), 31), 31, this.n), 31, this.o);
        String str4 = this.p;
        int iF3 = z1m.f((iF2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.q);
        String str5 = this.r;
        int iHashCode2 = (iF3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.s;
        int iHashCode3 = (iHashCode2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.t;
        int iHashCode4 = (iHashCode3 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.u;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.v;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
