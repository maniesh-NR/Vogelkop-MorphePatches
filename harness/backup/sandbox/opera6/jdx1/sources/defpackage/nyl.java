package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class nyl {
    public static final nyl J;
    public static final nyl K;
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
    public static final String u0;
    public static final String v0;
    public static final String w0;
    public final int A;
    public final boolean B;
    public final int C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final l1b H;
    public final u1b I;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final csh m;
    public final csh n;
    public final csh o;
    public final int p;
    public final csh q;
    public final csh r;
    public final int s;
    public final int t;
    public final int u;
    public final csh v;
    public final lyl w;
    public final boolean x;
    public final csh y;
    public final csh z;

    static {
        nyl nylVar = new nyl(new myl());
        J = nylVar;
        K = nylVar;
        String str = tym.a;
        L = "1";
        M = "2";
        N = "3";
        O = "4";
        P = "5";
        Q = "6";
        R = "7";
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
        t0 = "z";
        u0 = "10";
        v0 = "11";
        w0 = "12";
    }

    public nyl(myl mylVar) {
        this.a = mylVar.a;
        this.b = mylVar.b;
        this.c = mylVar.c;
        this.d = mylVar.d;
        this.e = mylVar.e;
        this.f = mylVar.f;
        this.g = mylVar.g;
        this.h = mylVar.h;
        this.i = mylVar.i;
        this.j = mylVar.j;
        this.k = mylVar.k;
        this.l = mylVar.l;
        this.m = mylVar.m;
        this.n = mylVar.n;
        this.o = mylVar.o;
        this.p = mylVar.p;
        this.q = mylVar.q;
        this.s = mylVar.s;
        this.t = mylVar.t;
        this.r = mylVar.r;
        this.u = mylVar.u;
        this.v = mylVar.v;
        this.w = mylVar.w;
        this.x = mylVar.x;
        this.y = mylVar.y;
        this.A = mylVar.z;
        this.B = mylVar.A;
        this.z = mylVar.B;
        this.C = mylVar.C;
        this.D = mylVar.D;
        this.E = mylVar.E;
        this.F = mylVar.F;
        this.G = mylVar.G;
        this.H = l1b.h(mylVar.H);
        this.I = u1b.q(mylVar.I);
    }

    public static nyl b(Bundle bundle) {
        lyl lylVar;
        csh cshVarG;
        myl mylVar = new myl();
        nyl nylVar = J;
        mylVar.a = bundle.getInt(Q, nylVar.a);
        mylVar.b = bundle.getInt(R, nylVar.b);
        mylVar.c = bundle.getInt(S, nylVar.c);
        mylVar.d = bundle.getInt(T, nylVar.d);
        mylVar.e = bundle.getInt(U, nylVar.e);
        mylVar.f = bundle.getInt(V, nylVar.f);
        mylVar.g = bundle.getInt(W, nylVar.g);
        mylVar.h = bundle.getInt(X, nylVar.h);
        mylVar.i = bundle.getInt(Y, nylVar.i);
        int i = bundle.getInt(Z, nylVar.j);
        mylVar.j = i;
        mylVar.k = mylVar.i == Integer.MAX_VALUE && i == Integer.MAX_VALUE && bundle.getBoolean(r0, nylVar.k);
        mylVar.l = bundle.getBoolean(a0, nylVar.l);
        mylVar.m = h1b.t((String[]) cs5.G(bundle.getStringArray(b0), new String[0]));
        mylVar.n = h1b.t((String[]) cs5.G(bundle.getStringArray(u0), new String[0]));
        mylVar.o = h1b.t((String[]) cs5.G(bundle.getStringArray(q0), new String[0]));
        mylVar.p = bundle.getInt(j0, nylVar.p);
        mylVar.q = myl.f((String[]) cs5.G(bundle.getStringArray(L), new String[0]));
        mylVar.r = h1b.t((String[]) cs5.G(bundle.getStringArray(v0), new String[0]));
        mylVar.s = bundle.getInt(M, nylVar.s);
        mylVar.t = bundle.getInt(c0, nylVar.t);
        mylVar.u = bundle.getInt(d0, nylVar.u);
        mylVar.v = h1b.t((String[]) cs5.G(bundle.getStringArray(e0), new String[0]));
        Bundle bundle2 = bundle.getBundle(o0);
        if (bundle2 != null) {
            f8b f8bVar = new f8b();
            String str = lyl.e;
            lyl lylVar2 = lyl.d;
            f8bVar.a = bundle2.getInt(str, lylVar2.a);
            f8bVar.b = bundle2.getBoolean(lyl.f, lylVar2.b);
            f8bVar.c = bundle2.getBoolean(lyl.g, lylVar2.c);
            lylVar = new lyl(f8bVar);
        } else {
            f8b f8bVar2 = new f8b();
            lyl lylVar3 = lyl.d;
            f8bVar2.a = bundle.getInt(l0, lylVar3.a);
            f8bVar2.b = bundle.getBoolean(m0, lylVar3.b);
            f8bVar2.c = bundle.getBoolean(n0, lylVar3.c);
            lylVar = new lyl(f8bVar2);
        }
        mylVar.w = lylVar;
        mylVar.x = bundle.getBoolean(t0, nylVar.x);
        mylVar.y = myl.f((String[]) cs5.G(bundle.getStringArray(N), new String[0]));
        mylVar.z = bundle.getInt(O, nylVar.A);
        mylVar.A = mylVar.y.isEmpty() && mylVar.z == 0 && bundle.getBoolean(s0, nylVar.B);
        mylVar.C = bundle.getInt(k0, nylVar.C);
        mylVar.B = h1b.t((String[]) cs5.G(bundle.getStringArray(w0), new String[0]));
        mylVar.D = bundle.getBoolean(P, nylVar.D);
        mylVar.E = bundle.getBoolean(p0, nylVar.E);
        mylVar.F = bundle.getBoolean(f0, nylVar.F);
        mylVar.G = bundle.getBoolean(g0, nylVar.G);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(h0);
        if (parcelableArrayList == null) {
            cshVarG = csh.e;
        } else {
            z0b z0bVarP = h1b.p();
            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                Bundle bundle3 = (Bundle) parcelableArrayList.get(i2);
                bundle3.getClass();
                Bundle bundle4 = bundle3.getBundle(kyl.c);
                bundle4.getClass();
                eyl eylVarA = eyl.a(bundle4);
                int[] intArray = bundle3.getIntArray(kyl.d);
                intArray.getClass();
                z0bVarP.c(new kyl(eylVarA, sgb.i(intArray)));
            }
            cshVarG = z0bVarP.g();
        }
        mylVar.H = new HashMap();
        for (int i3 = 0; i3 < cshVarG.d; i3++) {
            kyl kylVar = (kyl) cshVarG.get(i3);
            mylVar.H.put(kylVar.a, kylVar);
        }
        int[] iArr = (int[]) cs5.G(bundle.getIntArray(i0), new int[0]);
        mylVar.I = new HashSet();
        for (int i4 : iArr) {
            mylVar.I.add(Integer.valueOf(i4));
        }
        return new nyl(mylVar);
    }

    public myl a() {
        myl mylVar = new myl();
        mylVar.e(this);
        return mylVar;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(Q, this.a);
        bundle.putInt(R, this.b);
        bundle.putInt(S, this.c);
        bundle.putInt(T, this.d);
        bundle.putInt(U, this.e);
        bundle.putInt(V, this.f);
        bundle.putInt(W, this.g);
        bundle.putInt(X, this.h);
        bundle.putInt(Y, this.i);
        bundle.putInt(Z, this.j);
        bundle.putBoolean(r0, this.k);
        bundle.putBoolean(a0, this.l);
        bundle.putStringArray(b0, (String[]) this.m.toArray(new String[0]));
        bundle.putStringArray(q0, (String[]) this.o.toArray(new String[0]));
        bundle.putStringArray(u0, (String[]) this.n.toArray(new String[0]));
        bundle.putInt(j0, this.p);
        bundle.putStringArray(L, (String[]) this.q.toArray(new String[0]));
        bundle.putInt(M, this.s);
        bundle.putInt(c0, this.t);
        bundle.putInt(d0, this.u);
        bundle.putStringArray(v0, (String[]) this.r.toArray(new String[0]));
        bundle.putStringArray(e0, (String[]) this.v.toArray(new String[0]));
        bundle.putBoolean(t0, this.x);
        bundle.putStringArray(N, (String[]) this.y.toArray(new String[0]));
        bundle.putInt(O, this.A);
        bundle.putBoolean(s0, this.B);
        bundle.putStringArray(w0, (String[]) this.z.toArray(new String[0]));
        bundle.putInt(k0, this.C);
        bundle.putBoolean(P, this.D);
        lyl lylVar = this.w;
        bundle.putInt(l0, lylVar.a);
        boolean z = lylVar.b;
        bundle.putBoolean(m0, z);
        boolean z2 = lylVar.c;
        bundle.putBoolean(n0, z2);
        Bundle bundle2 = new Bundle();
        bundle2.putInt(lyl.e, lylVar.a);
        bundle2.putBoolean(lyl.f, z);
        bundle2.putBoolean(lyl.g, z2);
        bundle.putBundle(o0, bundle2);
        bundle.putBoolean(p0, this.E);
        bundle.putBoolean(f0, this.F);
        bundle.putBoolean(g0, this.G);
        x0b<kyl> x0bVarL = this.H.l();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(x0bVarL.size());
        for (kyl kylVar : x0bVarL) {
            kylVar.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putBundle(kyl.c, kylVar.a.d());
            bundle3.putIntArray(kyl.d, sgb.b0(kylVar.b));
            arrayList.add(bundle3);
        }
        bundle.putParcelableArrayList(h0, arrayList);
        bundle.putIntArray(i0, sgb.b0(this.I));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        nyl nylVar = (nyl) obj;
        return this.a == nylVar.a && this.b == nylVar.b && this.c == nylVar.c && this.d == nylVar.d && this.e == nylVar.e && this.f == nylVar.f && this.g == nylVar.g && this.h == nylVar.h && this.l == nylVar.l && this.i == nylVar.i && this.j == nylVar.j && this.k == nylVar.k && this.m.equals(nylVar.m) && this.n.equals(nylVar.n) && this.o.equals(nylVar.o) && this.p == nylVar.p && this.q.equals(nylVar.q) && this.s == nylVar.s && this.t == nylVar.t && this.r.equals(nylVar.r) && this.u == nylVar.u && this.v.equals(nylVar.v) && this.w.equals(nylVar.w) && this.x == nylVar.x && this.z.equals(nylVar.z) && this.y.equals(nylVar.y) && this.A == nylVar.A && this.B == nylVar.B && this.C == nylVar.C && this.D == nylVar.D && this.E == nylVar.E && this.F == nylVar.F && this.G == nylVar.G && na2.s(this.H, nylVar.H) && this.I.equals(nylVar.I);
    }

    public int hashCode() {
        return this.I.hashCode() + ((this.H.hashCode() + ((((((((((((this.z.hashCode() + ((((((this.y.hashCode() + ((((this.w.hashCode() + ((this.v.hashCode() + ((((this.r.hashCode() + ((((((this.q.hashCode() + ((((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + (this.l ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31) + (this.k ? 1 : 0)) * 31)) * 31)) * 31)) * 31) + this.p) * 31)) * 31) + this.s) * 31) + this.t) * 31)) * 31) + this.u) * 31)) * 31)) * 31) + (this.x ? 1 : 0)) * 31)) * 31) + this.A) * 31) + (this.B ? 1 : 0)) * 31)) * 31) + this.C) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31)) * 31);
    }
}
