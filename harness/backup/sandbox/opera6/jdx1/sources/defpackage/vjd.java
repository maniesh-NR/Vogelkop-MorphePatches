package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* loaded from: classes.dex */
public final class vjd {
    public static final vjd K = new vjd(new ujd());
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public final CharSequence A;
    public final CharSequence B;
    public final Integer C;
    public final Integer D;
    public final CharSequence E;
    public final CharSequence F;
    public final CharSequence G;
    public final Integer H;
    public final Bundle I;
    public final h1b J;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Long h;
    public final xjh i;
    public final xjh j;
    public final byte[] k;
    public final Integer l;
    public final Uri m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Boolean q;
    public final Boolean r;
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final Integer y;
    public final CharSequence z;

    static {
        String str = tym.a;
        L = "0";
        M = "1";
        N = "2";
        O = "3";
        P = "4";
        Q = "5";
        R = "6";
        S = "8";
        T = "9";
        U = "a";
        V = "b";
        W = "c";
        X = "d";
        Y = "e";
        Z = "f";
        a0 = "g";
        b0 = "h";
        c0 = "i";
        d0 = "j";
        e0 = "k";
        f0 = "l";
        g0 = "m";
        h0 = "n";
        i0 = "o";
        j0 = "p";
        k0 = "q";
        l0 = "r";
        m0 = "s";
        n0 = "t";
        o0 = "u";
        p0 = "v";
        q0 = "w";
        r0 = "x";
        s0 = "y";
        t0 = "rs";
    }

    public vjd(ujd ujdVar) {
        Boolean boolValueOf = ujdVar.q;
        Integer numValueOf = ujdVar.p;
        Integer numValueOf2 = ujdVar.G;
        int i = 1;
        int i2 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i2 = i;
                }
                numValueOf = Integer.valueOf(i2);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        }
        this.a = ujdVar.a;
        this.b = ujdVar.b;
        this.c = ujdVar.c;
        this.d = ujdVar.d;
        this.e = ujdVar.e;
        this.f = ujdVar.f;
        this.g = ujdVar.g;
        this.h = ujdVar.h;
        this.i = ujdVar.i;
        this.j = ujdVar.j;
        this.k = ujdVar.k;
        this.l = ujdVar.l;
        this.m = ujdVar.m;
        this.n = ujdVar.n;
        this.o = ujdVar.o;
        this.p = numValueOf;
        this.q = boolValueOf;
        this.r = ujdVar.r;
        Integer num = ujdVar.s;
        this.s = num;
        this.t = num;
        this.u = ujdVar.t;
        this.v = ujdVar.u;
        this.w = ujdVar.v;
        this.x = ujdVar.w;
        this.y = ujdVar.x;
        this.z = ujdVar.y;
        this.A = ujdVar.z;
        this.B = ujdVar.A;
        this.C = ujdVar.B;
        this.D = ujdVar.C;
        this.E = ujdVar.D;
        this.F = ujdVar.E;
        this.G = ujdVar.F;
        this.H = numValueOf2;
        this.J = ujdVar.I;
        this.I = ujdVar.H;
    }

    public static vjd b(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        ujd ujdVar = new ujd();
        ujdVar.a = bundle.getCharSequence(L);
        ujdVar.b = bundle.getCharSequence(M);
        ujdVar.c = bundle.getCharSequence(N);
        ujdVar.d = bundle.getCharSequence(O);
        ujdVar.e = bundle.getCharSequence(P);
        ujdVar.f = bundle.getCharSequence(Q);
        ujdVar.g = bundle.getCharSequence(R);
        byte[] byteArray = bundle.getByteArray(U);
        String str = n0;
        ujdVar.b(byteArray, bundle.containsKey(str) ? Integer.valueOf(bundle.getInt(str)) : null);
        ujdVar.m = (Uri) bundle.getParcelable(V);
        ujdVar.y = bundle.getCharSequence(g0);
        ujdVar.z = bundle.getCharSequence(h0);
        ujdVar.A = bundle.getCharSequence(i0);
        ujdVar.D = bundle.getCharSequence(l0);
        ujdVar.E = bundle.getCharSequence(m0);
        ujdVar.F = bundle.getCharSequence(o0);
        ujdVar.H = bundle.getBundle(t0);
        String str2 = S;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            ujdVar.i = xjh.a(bundle3);
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            ujdVar.j = xjh.a(bundle2);
        }
        String str4 = r0;
        if (bundle.containsKey(str4)) {
            ujdVar.c(Long.valueOf(bundle.getLong(str4)));
        }
        String str5 = W;
        if (bundle.containsKey(str5)) {
            ujdVar.n = Integer.valueOf(bundle.getInt(str5));
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            ujdVar.o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            ujdVar.p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = q0;
        if (bundle.containsKey(str8)) {
            ujdVar.q = Boolean.valueOf(bundle.getBoolean(str8));
        }
        String str9 = Z;
        if (bundle.containsKey(str9)) {
            ujdVar.r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = a0;
        if (bundle.containsKey(str10)) {
            ujdVar.s = Integer.valueOf(bundle.getInt(str10));
        }
        String str11 = b0;
        if (bundle.containsKey(str11)) {
            ujdVar.t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = c0;
        if (bundle.containsKey(str12)) {
            ujdVar.u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = d0;
        if (bundle.containsKey(str13)) {
            ujdVar.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = e0;
        if (bundle.containsKey(str14)) {
            ujdVar.w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f0;
        if (bundle.containsKey(str15)) {
            ujdVar.x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = j0;
        if (bundle.containsKey(str16)) {
            ujdVar.B = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = k0;
        if (bundle.containsKey(str17)) {
            ujdVar.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = p0;
        if (bundle.containsKey(str18)) {
            ujdVar.G = Integer.valueOf(bundle.getInt(str18));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(s0);
        if (stringArrayList != null) {
            ujdVar.I = h1b.s(stringArrayList);
        }
        return new vjd(ujdVar);
    }

    public final ujd a() {
        ujd ujdVar = new ujd();
        ujdVar.a = this.a;
        ujdVar.b = this.b;
        ujdVar.c = this.c;
        ujdVar.d = this.d;
        ujdVar.e = this.e;
        ujdVar.f = this.f;
        ujdVar.g = this.g;
        ujdVar.h = this.h;
        ujdVar.i = this.i;
        ujdVar.j = this.j;
        ujdVar.k = this.k;
        ujdVar.l = this.l;
        ujdVar.m = this.m;
        ujdVar.n = this.n;
        ujdVar.o = this.o;
        ujdVar.p = this.p;
        ujdVar.q = this.q;
        ujdVar.r = this.r;
        ujdVar.s = this.t;
        ujdVar.t = this.u;
        ujdVar.u = this.v;
        ujdVar.v = this.w;
        ujdVar.w = this.x;
        ujdVar.x = this.y;
        ujdVar.y = this.z;
        ujdVar.z = this.A;
        ujdVar.A = this.B;
        ujdVar.B = this.C;
        ujdVar.C = this.D;
        ujdVar.D = this.E;
        ujdVar.E = this.F;
        ujdVar.F = this.G;
        ujdVar.G = this.H;
        ujdVar.I = this.J;
        ujdVar.H = this.I;
        return ujdVar;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(L, charSequence);
        }
        CharSequence charSequence2 = this.b;
        if (charSequence2 != null) {
            bundle.putCharSequence(M, charSequence2);
        }
        CharSequence charSequence3 = this.c;
        if (charSequence3 != null) {
            bundle.putCharSequence(N, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(O, charSequence4);
        }
        CharSequence charSequence5 = this.e;
        if (charSequence5 != null) {
            bundle.putCharSequence(P, charSequence5);
        }
        CharSequence charSequence6 = this.f;
        if (charSequence6 != null) {
            bundle.putCharSequence(Q, charSequence6);
        }
        CharSequence charSequence7 = this.g;
        if (charSequence7 != null) {
            bundle.putCharSequence(R, charSequence7);
        }
        Long l = this.h;
        if (l != null) {
            bundle.putLong(r0, l.longValue());
        }
        byte[] bArr = this.k;
        if (bArr != null) {
            bundle.putByteArray(U, bArr);
        }
        Uri uri = this.m;
        if (uri != null) {
            bundle.putParcelable(V, uri);
        }
        CharSequence charSequence8 = this.z;
        if (charSequence8 != null) {
            bundle.putCharSequence(g0, charSequence8);
        }
        CharSequence charSequence9 = this.A;
        if (charSequence9 != null) {
            bundle.putCharSequence(h0, charSequence9);
        }
        CharSequence charSequence10 = this.B;
        if (charSequence10 != null) {
            bundle.putCharSequence(i0, charSequence10);
        }
        CharSequence charSequence11 = this.E;
        if (charSequence11 != null) {
            bundle.putCharSequence(l0, charSequence11);
        }
        CharSequence charSequence12 = this.F;
        if (charSequence12 != null) {
            bundle.putCharSequence(m0, charSequence12);
        }
        CharSequence charSequence13 = this.G;
        if (charSequence13 != null) {
            bundle.putCharSequence(o0, charSequence13);
        }
        xjh xjhVar = this.i;
        if (xjhVar != null) {
            bundle.putBundle(S, xjhVar.c());
        }
        xjh xjhVar2 = this.j;
        if (xjhVar2 != null) {
            bundle.putBundle(T, xjhVar2.c());
        }
        Integer num = this.n;
        if (num != null) {
            bundle.putInt(W, num.intValue());
        }
        Integer num2 = this.o;
        if (num2 != null) {
            bundle.putInt(X, num2.intValue());
        }
        Integer num3 = this.p;
        if (num3 != null) {
            bundle.putInt(Y, num3.intValue());
        }
        Boolean bool = this.q;
        if (bool != null) {
            bundle.putBoolean(q0, bool.booleanValue());
        }
        Boolean bool2 = this.r;
        if (bool2 != null) {
            bundle.putBoolean(Z, bool2.booleanValue());
        }
        Integer num4 = this.t;
        if (num4 != null) {
            bundle.putInt(a0, num4.intValue());
        }
        Integer num5 = this.u;
        if (num5 != null) {
            bundle.putInt(b0, num5.intValue());
        }
        Integer num6 = this.v;
        if (num6 != null) {
            bundle.putInt(c0, num6.intValue());
        }
        Integer num7 = this.w;
        if (num7 != null) {
            bundle.putInt(d0, num7.intValue());
        }
        Integer num8 = this.x;
        if (num8 != null) {
            bundle.putInt(e0, num8.intValue());
        }
        Integer num9 = this.y;
        if (num9 != null) {
            bundle.putInt(f0, num9.intValue());
        }
        Integer num10 = this.C;
        if (num10 != null) {
            bundle.putInt(j0, num10.intValue());
        }
        Integer num11 = this.D;
        if (num11 != null) {
            bundle.putInt(k0, num11.intValue());
        }
        Integer num12 = this.l;
        if (num12 != null) {
            bundle.putInt(n0, num12.intValue());
        }
        Integer num13 = this.H;
        if (num13 != null) {
            bundle.putInt(p0, num13.intValue());
        }
        h1b h1bVar = this.J;
        if (!h1bVar.isEmpty()) {
            bundle.putStringArrayList(s0, new ArrayList<>((Collection) h1bVar));
        }
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            bundle.putBundle(t0, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vjd.class == obj.getClass()) {
            vjd vjdVar = (vjd) obj;
            if (Objects.equals(this.a, vjdVar.a) && Objects.equals(this.b, vjdVar.b) && Objects.equals(this.c, vjdVar.c) && Objects.equals(this.d, vjdVar.d) && Objects.equals(this.e, vjdVar.e) && Objects.equals(this.f, vjdVar.f) && Objects.equals(this.g, vjdVar.g) && Objects.equals(this.h, vjdVar.h) && Objects.equals(this.i, vjdVar.i) && Objects.equals(this.j, vjdVar.j) && Arrays.equals(this.k, vjdVar.k) && Objects.equals(this.l, vjdVar.l) && Objects.equals(this.m, vjdVar.m) && Objects.equals(this.n, vjdVar.n) && Objects.equals(this.o, vjdVar.o) && Objects.equals(this.p, vjdVar.p) && Objects.equals(this.q, vjdVar.q) && Objects.equals(this.r, vjdVar.r) && Objects.equals(this.t, vjdVar.t) && Objects.equals(this.u, vjdVar.u) && Objects.equals(this.v, vjdVar.v) && Objects.equals(this.w, vjdVar.w) && Objects.equals(this.x, vjdVar.x) && Objects.equals(this.y, vjdVar.y) && Objects.equals(this.z, vjdVar.z) && Objects.equals(this.A, vjdVar.A) && Objects.equals(this.B, vjdVar.B) && Objects.equals(this.C, vjdVar.C) && Objects.equals(this.D, vjdVar.D) && Objects.equals(this.E, vjdVar.E) && Objects.equals(this.F, vjdVar.F) && Objects.equals(this.G, vjdVar.G) && Objects.equals(this.H, vjdVar.H) && Objects.equals(this.J, vjdVar.J)) {
                if ((this.I == null) == (vjdVar.I == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, Integer.valueOf(Arrays.hashCode(this.k)), this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, Boolean.valueOf(this.I == null), this.J);
    }
}
