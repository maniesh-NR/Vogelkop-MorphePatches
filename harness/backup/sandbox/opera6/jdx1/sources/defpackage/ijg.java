package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ijg {
    public static final ijg H;
    public static final String I;
    public static final String J;
    public static final String K;
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
    public final int A;
    public final vjd B;
    public final long C;
    public final long D;
    public final long E;
    public final fzl F;
    public final nyl G;
    public final rhg a;
    public final int b;
    public final c4j c;
    public final fig d;
    public final fig e;
    public final int f;
    public final thg g;
    public final int h;
    public final boolean i;
    public final gql j;
    public final int k;
    public final r4n l;
    public final vjd m;
    public final float n;
    public final float o;
    public final int p;
    public final pf2 q;
    public final y36 r;
    public final u67 s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final int z;

    static {
        c4j c4jVar = c4j.l;
        fig figVar = c4j.k;
        thg thgVar = thg.d;
        r4n r4nVar = r4n.d;
        cql cqlVar = gql.a;
        vjd vjdVar = vjd.K;
        H = new ijg(null, 0, c4jVar, figVar, figVar, 0, thgVar, 0, false, r4nVar, cqlVar, 0, vjdVar, 1.0f, 1.0f, pf2.i, 0, y36.d, u67.e, 0, false, false, 1, 0, 1, false, false, vjdVar, 5000L, 15000L, 3000L, fzl.b, nyl.J);
        String str = tym.a;
        I = "1";
        J = "2";
        K = "3";
        L = "4";
        M = "5";
        N = "6";
        O = "7";
        P = "x";
        Q = "8";
        R = "9";
        S = "a";
        T = "b";
        U = "c";
        V = "d";
        W = "e";
        X = "f";
        Y = "g";
        Z = "h";
        a0 = "i";
        b0 = "j";
        c0 = "k";
        d0 = "l";
        e0 = "m";
        f0 = "n";
        g0 = "o";
        h0 = "p";
        i0 = "q";
        j0 = "r";
        k0 = "s";
        l0 = "t";
        m0 = "u";
        n0 = "v";
        o0 = "w";
        p0 = "y";
    }

    public ijg(rhg rhgVar, int i, c4j c4jVar, fig figVar, fig figVar2, int i2, thg thgVar, int i3, boolean z, r4n r4nVar, gql gqlVar, int i4, vjd vjdVar, float f, float f2, pf2 pf2Var, int i5, y36 y36Var, u67 u67Var, int i6, boolean z2, boolean z3, int i7, int i8, int i9, boolean z4, boolean z5, vjd vjdVar2, long j, long j2, long j3, fzl fzlVar, nyl nylVar) {
        this.a = rhgVar;
        this.b = i;
        this.c = c4jVar;
        this.d = figVar;
        this.e = figVar2;
        this.f = i2;
        this.g = thgVar;
        this.h = i3;
        this.i = z;
        this.l = r4nVar;
        this.j = gqlVar;
        this.k = i4;
        this.m = vjdVar;
        this.n = f;
        this.o = f2;
        this.p = i5;
        this.q = pf2Var;
        this.r = y36Var;
        this.s = u67Var;
        this.t = i6;
        this.u = z2;
        this.v = z3;
        this.w = i7;
        this.z = i8;
        this.A = i9;
        this.x = z4;
        this.y = z5;
        this.B = vjdVar2;
        this.C = j;
        this.D = j2;
        this.E = j3;
        this.F = fzlVar;
        this.G = nylVar;
    }

    public static ijg p(int i, Bundle bundle) {
        rhg rhgVar;
        csh cshVarH;
        csh cshVarH2;
        gql eqlVar;
        gql gqlVar;
        int i2;
        r4n r4nVar;
        vjd vjdVar;
        float f;
        r4n r4nVar2;
        csh cshVarG;
        y36 y36Var;
        y36 y36Var2;
        u67 u67VarT;
        rhg rhgVar2;
        long j;
        csh cshVarH3;
        fzl fzlVar;
        IBinder binder = bundle.getBinder(o0);
        if (binder instanceof hjg) {
            return ((hjg) binder).a;
        }
        Bundle bundle2 = bundle.getBundle(a0);
        if (bundle2 == null) {
            rhgVar = null;
        } else {
            String string = bundle2.getString(rhg.f);
            String string2 = bundle2.getString(rhg.g);
            String string3 = bundle2.getString(rhg.h);
            if (!TextUtils.isEmpty(string2)) {
                try {
                    Class<?> cls = Class.forName(string2, true, rhg.class.getClassLoader());
                    remoteException = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string3) : null;
                    if (remoteException == null) {
                        remoteException = new RemoteException(string3);
                    }
                } catch (Throwable unused) {
                    remoteException = new RemoteException(string3);
                }
            }
            Throwable th = remoteException;
            int i3 = bundle2.getInt(rhg.d, 1000);
            Bundle bundle3 = bundle2.getBundle(rhg.i);
            if (bundle3 == null) {
                bundle3 = Bundle.EMPTY;
            }
            rhgVar = new rhg(string, th, i3, bundle3, bundle2.getLong(rhg.e, SystemClock.elapsedRealtime()));
        }
        byte b = 0;
        int i4 = bundle.getInt(c0, 0);
        Bundle bundle4 = bundle.getBundle(b0);
        c4j c4jVarB = bundle4 == null ? c4j.l : c4j.b(bundle4);
        Bundle bundle5 = bundle.getBundle(d0);
        fig figVarC = bundle5 == null ? c4j.k : fig.c(bundle5);
        Bundle bundle6 = bundle.getBundle(e0);
        fig figVarC2 = bundle6 == null ? c4j.k : fig.c(bundle6);
        int i5 = bundle.getInt(f0, 0);
        Bundle bundle7 = bundle.getBundle(I);
        thg thgVar = bundle7 == null ? thg.d : new thg(bundle7.getFloat(thg.e, 1.0f), bundle7.getFloat(thg.f, 1.0f));
        int i6 = bundle.getInt(J, 0);
        boolean z = bundle.getBoolean(K, false);
        Bundle bundle8 = bundle.getBundle(L);
        if (bundle8 == null) {
            eqlVar = gql.a;
        } else {
            b10 b10Var = new b10((byte) 29);
            IBinder binder2 = bundle8.getBinder(gql.b);
            if (binder2 == null) {
                a1b a1bVar = h1b.b;
                cshVarH = csh.e;
            } else {
                cshVarH = j14.H(b10Var, k14.a(binder2));
            }
            bql bqlVar = new bql(b);
            IBinder binder3 = bundle8.getBinder(gql.c);
            if (binder3 == null) {
                a1b a1bVar2 = h1b.b;
                cshVarH2 = csh.e;
            } else {
                cshVarH2 = j14.H(bqlVar, k14.a(binder3));
            }
            int[] intArray = bundle8.getIntArray(gql.d);
            if (intArray == null) {
                int i7 = cshVarH.d;
                int[] iArr = new int[i7];
                for (int i8 = 0; i8 < i7; i8++) {
                    iArr[i8] = i8;
                }
                intArray = iArr;
            }
            eqlVar = new eql(cshVarH, cshVarH2, intArray);
        }
        int i9 = bundle.getInt(n0, 0);
        Bundle bundle9 = bundle.getBundle(M);
        if (bundle9 == null) {
            r4nVar = r4n.d;
            gqlVar = eqlVar;
            i2 = i9;
        } else {
            gqlVar = eqlVar;
            i2 = i9;
            r4nVar = new r4n(bundle9.getInt(r4n.e, 0), bundle9.getInt(r4n.f, 0), bundle9.getFloat(r4n.g, 1.0f));
        }
        Bundle bundle10 = bundle.getBundle(N);
        vjd vjdVarB = bundle10 == null ? vjd.K : vjd.b(bundle10);
        float f2 = bundle.getFloat(O, 1.0f);
        float f3 = bundle.getFloat(P, 1.0f);
        int i10 = bundle.getInt(p0, 0);
        Bundle bundle11 = bundle.getBundle(Q);
        pf2 pf2VarA = bundle11 == null ? pf2.i : pf2.a(bundle11);
        Bundle bundle12 = bundle.getBundle(g0);
        if (bundle12 == null) {
            y36Var = y36.d;
            vjdVar = vjdVarB;
            f = f2;
            r4nVar2 = r4nVar;
        } else {
            ArrayList parcelableArrayList = bundle12.getParcelableArrayList(y36.e);
            if (parcelableArrayList == null) {
                a1b a1bVar3 = h1b.b;
                cshVarG = csh.e;
                vjdVar = vjdVarB;
                f = f2;
                r4nVar2 = r4nVar;
            } else {
                vjdVar = vjdVarB;
                z0b z0bVarP = h1b.p();
                f = f2;
                r4nVar2 = r4nVar;
                for (int i11 = 0; i11 < parcelableArrayList.size(); i11++) {
                    Bundle bundle13 = (Bundle) parcelableArrayList.get(i11);
                    bundle13.getClass();
                    z0bVarP.c(x36.b(bundle13));
                }
                cshVarG = z0bVarP.g();
            }
            y36Var = new y36(bundle12.getLong(y36.f), cshVarG);
        }
        Bundle bundle14 = bundle.getBundle(R);
        if (bundle14 == null) {
            u67VarT = u67.e;
            y36Var2 = y36Var;
        } else {
            int i12 = bundle14.getInt(u67.f, 0);
            int i13 = bundle14.getInt(u67.g, 0);
            y36Var2 = y36Var;
            int i14 = bundle14.getInt(u67.h, 0);
            String string4 = bundle14.getString(u67.i);
            r05 r05Var = new r05(i12);
            r05Var.c = i13;
            r05Var.d = i14;
            z4o.w(i12 != 0 || string4 == null);
            r05Var.e = string4;
            u67VarT = r05Var.t();
        }
        int i15 = bundle.getInt(S, 0);
        boolean z2 = bundle.getBoolean(T, false);
        boolean z3 = bundle.getBoolean(U, false);
        int i16 = bundle.getInt(V, 1);
        int i17 = bundle.getInt(W, 0);
        int i18 = bundle.getInt(X, 1);
        boolean z4 = bundle.getBoolean(Y, false);
        boolean z5 = bundle.getBoolean(Z, false);
        Bundle bundle15 = bundle.getBundle(h0);
        vjd vjdVarB2 = bundle15 == null ? vjd.K : vjd.b(bundle15);
        u67 u67Var = u67VarT;
        long j2 = bundle.getLong(i0, i < 4 ? 0L : 5000L);
        long j3 = bundle.getLong(j0, i < 4 ? 0L : 15000L);
        if (i < 4) {
            rhgVar2 = rhgVar;
            j = 0;
        } else {
            rhgVar2 = rhgVar;
            j = 3000;
        }
        long j4 = bundle.getLong(k0, j);
        Bundle bundle16 = bundle.getBundle(m0);
        if (bundle16 == null) {
            fzlVar = fzl.b;
        } else {
            ArrayList parcelableArrayList2 = bundle16.getParcelableArrayList(fzl.c);
            if (parcelableArrayList2 == null) {
                a1b a1bVar4 = h1b.b;
                cshVarH3 = csh.e;
            } else {
                cshVarH3 = j14.H(new bql((byte) 4), parcelableArrayList2);
            }
            fzlVar = new fzl(cshVarH3);
        }
        Bundle bundle17 = bundle.getBundle(l0);
        return new ijg(rhgVar2, i4, c4jVarB, figVarC, figVarC2, i5, thgVar, i6, z, r4nVar2, gqlVar, i2, vjdVar, f, f3, pf2VarA, i10, y36Var2, u67Var, i15, z2, z3, i16, i17, i18, z4, z5, vjdVarB2, j2, j3, j4, fzlVar, bundle17 == null ? nyl.J : nyl.b(bundle17));
    }

    public final ijg a(pf2 pf2Var) {
        gql gqlVar = this.j;
        boolean zP = gqlVar.p();
        c4j c4jVar = this.c;
        z4o.H(zP || c4jVar.a.b < gqlVar.o());
        return new ijg(this.a, this.b, c4jVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, gqlVar, this.k, this.m, this.n, this.o, pf2Var, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final ijg b(fzl fzlVar) {
        gql gqlVar = this.j;
        boolean zP = gqlVar.p();
        c4j c4jVar = this.c;
        z4o.H(zP || c4jVar.a.b < gqlVar.o());
        return new ijg(this.a, this.b, c4jVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, gqlVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, fzlVar, this.G);
    }

    public final ijg c(int i, boolean z) {
        gql gqlVar = this.j;
        boolean zP = gqlVar.p();
        c4j c4jVar = this.c;
        z4o.H(zP || c4jVar.a.b < gqlVar.o());
        return new ijg(this.a, this.b, c4jVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, gqlVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, i, z, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final ijg d(int i, int i2, boolean z) {
        int i3 = this.A;
        boolean z2 = i3 == 3 && z && i2 == 0;
        gql gqlVar = this.j;
        boolean zP = gqlVar.p();
        c4j c4jVar = this.c;
        z4o.H(zP || c4jVar.a.b < gqlVar.o());
        return new ijg(this.a, this.b, c4jVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, gqlVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, z, i, i2, i3, z2, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final ijg e(thg thgVar) {
        gql gqlVar = this.j;
        boolean zP = gqlVar.p();
        c4j c4jVar = this.c;
        z4o.H(zP || c4jVar.a.b < gqlVar.o());
        return new ijg(this.a, this.b, c4jVar, this.d, this.e, this.f, thgVar, this.h, this.i, this.l, gqlVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final ijg f(int i, rhg rhgVar) {
        boolean z = this.v;
        int i2 = this.z;
        boolean z2 = i == 3 && z && i2 == 0;
        gql gqlVar = this.j;
        boolean zP = gqlVar.p();
        c4j c4jVar = this.c;
        z4o.H(zP || c4jVar.a.b < gqlVar.o());
        return new ijg(rhgVar, this.b, c4jVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, gqlVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, z, this.w, i2, i, z2, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final ijg g(vjd vjdVar) {
        gql gqlVar = this.j;
        boolean zP = gqlVar.p();
        c4j c4jVar = this.c;
        z4o.H(zP || c4jVar.a.b < gqlVar.o());
        return new ijg(this.a, this.b, c4jVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, gqlVar, this.k, vjdVar, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final ijg h(int i, fig figVar, fig figVar2) {
        gql gqlVar = this.j;
        boolean zP = gqlVar.p();
        c4j c4jVar = this.c;
        z4o.H(zP || c4jVar.a.b < gqlVar.o());
        return new ijg(this.a, this.b, c4jVar, figVar, figVar2, i, this.g, this.h, this.i, this.l, gqlVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final ijg i(int i) {
        gql gqlVar = this.j;
        boolean zP = gqlVar.p();
        c4j c4jVar = this.c;
        z4o.H(zP || c4jVar.a.b < gqlVar.o());
        return new ijg(this.a, this.b, c4jVar, this.d, this.e, this.f, this.g, i, this.i, this.l, gqlVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final ijg j(c4j c4jVar) {
        gql gqlVar = this.j;
        z4o.H(gqlVar.p() || c4jVar.a.b < gqlVar.o());
        return new ijg(this.a, this.b, c4jVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, gqlVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final ijg k(boolean z) {
        gql gqlVar = this.j;
        boolean zP = gqlVar.p();
        c4j c4jVar = this.c;
        z4o.H(zP || c4jVar.a.b < gqlVar.o());
        return new ijg(this.a, this.b, c4jVar, this.d, this.e, this.f, this.g, this.h, z, this.l, gqlVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final ijg l(gql gqlVar, c4j c4jVar, int i) {
        z4o.H(gqlVar.p() || c4jVar.a.b < gqlVar.o());
        return new ijg(this.a, this.b, c4jVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, gqlVar, i, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final ijg m(nyl nylVar) {
        gql gqlVar = this.j;
        boolean zP = gqlVar.p();
        c4j c4jVar = this.c;
        z4o.H(zP || c4jVar.a.b < gqlVar.o());
        return new ijg(this.a, this.b, c4jVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, gqlVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, nylVar);
    }

    public final ijg n(float f) {
        float f2 = f != 0.0f ? f : this.n;
        gql gqlVar = this.j;
        boolean zP = gqlVar.p();
        c4j c4jVar = this.c;
        z4o.H(zP || c4jVar.a.b < gqlVar.o());
        return new ijg(this.a, this.b, c4jVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, gqlVar, this.k, this.m, f, f2, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final ijg o(cig cigVar, boolean z, boolean z2) {
        float f;
        float f2;
        int i;
        boolean z3;
        int i2;
        boolean zA = cigVar.a(16);
        boolean zA2 = cigVar.a(17);
        c4j c4jVar = this.c;
        c4j c4jVarA = c4jVar.a(zA, zA2);
        fig figVarB = this.d.b(zA, zA2);
        fig figVarB2 = this.e.b(zA, zA2);
        boolean z4 = true;
        gql eqlVar = this.j;
        if (!zA2 && zA && !eqlVar.p()) {
            int i3 = c4jVar.a.b;
            if (eqlVar.o() != 1) {
                fql fqlVarM = eqlVar.m(i3, new fql(), 0L);
                z0b z0bVarP = h1b.p();
                int i4 = fqlVarM.m;
                while (true) {
                    i2 = fqlVarM.n;
                    if (i4 > i2) {
                        break;
                    }
                    dql dqlVarF = eqlVar.f(i4, new dql(), true);
                    dqlVarF.c = 0;
                    z0bVarP.c(dqlVarF);
                    i4++;
                }
                fqlVarM.n = i2 - fqlVarM.m;
                fqlVarM.m = 0;
                eqlVar = new eql(h1b.v(fqlVarM), z0bVarP.g(), new int[]{0});
            }
        } else if (z || !zA2) {
            eqlVar = gql.a;
        }
        gql gqlVar = eqlVar;
        vjd vjdVar = !cigVar.a(18) ? vjd.K : this.m;
        if (cigVar.a(22)) {
            f = this.n;
            f2 = this.o;
        } else {
            f = 1.0f;
            f2 = 1.0f;
        }
        pf2 pf2Var = !cigVar.a(21) ? pf2.i : this.q;
        y36 y36Var = !cigVar.a(28) ? y36.d : this.r;
        if (cigVar.a(23)) {
            i = this.t;
            z3 = this.u;
        } else {
            i = 0;
            z3 = false;
        }
        vjd vjdVar2 = !cigVar.a(18) ? vjd.K : this.B;
        fzl fzlVar = (z2 || !cigVar.a(30)) ? fzl.b : this.F;
        if (!gqlVar.p() && c4jVarA.a.b >= gqlVar.o()) {
            z4 = false;
        }
        z4o.H(z4);
        return new ijg(this.a, this.b, c4jVarA, figVarB, figVarB2, this.f, this.g, this.h, this.i, this.l, gqlVar, this.k, vjdVar, f, f2, pf2Var, this.p, y36Var, this.s, i, z3, this.v, this.w, this.z, this.A, this.x, this.y, vjdVar2, this.C, this.D, this.E, fzlVar, this.G);
    }

    public final qjd q() {
        gql gqlVar = this.j;
        if (gqlVar.p()) {
            return null;
        }
        return gqlVar.m(this.c.a.b, new fql(), 0L).b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v57 */
    public final Bundle r(int i) {
        Bundle bundle;
        long j;
        boolean z;
        Bundle bundle2;
        ArrayList arrayList;
        gql gqlVar;
        int i2;
        dql dqlVar;
        int i3;
        Bundle bundle3;
        Bundle bundle4;
        int i4;
        ArrayList arrayList2;
        String str;
        gql gqlVar2;
        Bundle bundle5 = new Bundle();
        rhg rhgVar = this.a;
        if (rhgVar != null) {
            Bundle bundle6 = new Bundle();
            bundle6.putInt(rhg.d, rhgVar.a);
            bundle6.putLong(rhg.e, rhgVar.b);
            bundle6.putString(rhg.f, rhgVar.getMessage());
            bundle6.putBundle(rhg.i, rhgVar.c);
            Throwable cause = rhgVar.getCause();
            if (cause != null) {
                bundle6.putString(rhg.g, cause.getClass().getName());
                bundle6.putString(rhg.h, cause.getMessage());
            }
            bundle5.putBundle(a0, bundle6);
        }
        int i5 = this.b;
        if (i5 != 0) {
            bundle5.putInt(c0, i5);
        }
        c4j c4jVar = this.c;
        if (i < 3 || !c4jVar.equals(c4j.l)) {
            bundle5.putBundle(b0, c4jVar.c(i));
        }
        fig figVar = this.d;
        if (i < 3 || !c4j.k.a(figVar)) {
            bundle5.putBundle(d0, figVar.d(i));
        }
        fig figVar2 = this.e;
        if (i < 3 || !c4j.k.a(figVar2)) {
            bundle5.putBundle(e0, figVar2.d(i));
        }
        int i6 = this.f;
        if (i6 != 0) {
            bundle5.putInt(f0, i6);
        }
        thg thgVar = thg.d;
        thg thgVar2 = this.g;
        if (!thgVar2.equals(thgVar)) {
            Bundle bundle7 = new Bundle();
            bundle7.putFloat(thg.e, thgVar2.a);
            bundle7.putFloat(thg.f, thgVar2.b);
            bundle5.putBundle(I, bundle7);
        }
        int i7 = this.h;
        if (i7 != 0) {
            bundle5.putInt(J, i7);
        }
        boolean z2 = this.i;
        if (z2) {
            bundle5.putBoolean(K, z2);
        }
        cql cqlVar = gql.a;
        gql gqlVar3 = this.j;
        boolean z3 = false;
        long j2 = 0;
        if (gqlVar3.equals(cqlVar)) {
            bundle = bundle5;
            j = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            int iO = gqlVar3.o();
            fql fqlVar = new fql();
            int i8 = 0;
            while (i8 < iO) {
                fql fqlVarM = gqlVar3.m(i8, fqlVar, j2);
                fqlVarM.getClass();
                long j3 = j2;
                Bundle bundle8 = new Bundle();
                if (!qjd.h.equals(fqlVarM.b)) {
                    bundle8.putBundle(fql.s, fqlVarM.b.c(false));
                }
                long j4 = fqlVarM.d;
                if (j4 != -9223372036854775807L) {
                    bundle8.putLong(fql.t, j4);
                }
                long j5 = fqlVarM.e;
                if (j5 != -9223372036854775807L) {
                    bundle8.putLong(fql.u, j5);
                }
                long j6 = fqlVarM.f;
                if (j6 != -9223372036854775807L) {
                    bundle8.putLong(fql.v, j6);
                }
                boolean z4 = fqlVarM.g;
                if (z4) {
                    bundle8.putBoolean(fql.w, z4);
                }
                boolean z5 = fqlVarM.h;
                if (z5) {
                    bundle8.putBoolean(fql.x, z5);
                }
                ljd ljdVar = fqlVarM.i;
                if (ljdVar != null) {
                    bundle8.putBundle(fql.y, ljdVar.c());
                }
                boolean z6 = fqlVarM.j;
                if (z6) {
                    bundle8.putBoolean(fql.z, z6);
                }
                long j7 = fqlVarM.k;
                if (j7 != j3) {
                    bundle8.putLong(fql.A, j7);
                }
                long j8 = fqlVarM.l;
                if (j8 != -9223372036854775807L) {
                    bundle8.putLong(fql.B, j8);
                }
                int i9 = fqlVarM.m;
                if (i9 != 0) {
                    bundle8.putInt(fql.C, i9);
                }
                int i10 = fqlVarM.n;
                if (i10 != 0) {
                    bundle8.putInt(fql.D, i10);
                }
                long j9 = fqlVarM.o;
                if (j9 != j3) {
                    bundle8.putLong(fql.E, j9);
                }
                arrayList3.add(bundle8);
                i8++;
                j2 = j3;
            }
            j = j2;
            ArrayList arrayList4 = new ArrayList();
            int iH = gqlVar3.h();
            dql dqlVar2 = new dql();
            int i11 = 0;
            while (i11 < iH) {
                dql dqlVarF = gqlVar3.f(i11, dqlVar2, z3);
                dqlVarF.getClass();
                Bundle bundle9 = new Bundle();
                int i12 = dqlVarF.c;
                if (i12 != 0) {
                    bundle9.putInt(dql.h, i12);
                }
                boolean z7 = z3;
                long j10 = dqlVarF.d;
                if (j10 != -9223372036854775807L) {
                    z = z7;
                    bundle9.putLong(dql.i, j10);
                } else {
                    z = z7;
                }
                long j11 = dqlVarF.e;
                if (j11 != j) {
                    bundle9.putLong(dql.j, j11);
                }
                boolean z8 = dqlVarF.f;
                if (z8) {
                    bundle9.putBoolean(dql.k, z8);
                }
                if (dqlVarF.g.equals(to.f)) {
                    bundle2 = bundle5;
                    arrayList = arrayList3;
                    gqlVar = gqlVar3;
                    i2 = iH;
                    dqlVar = dqlVar2;
                    i3 = i11;
                } else {
                    String str2 = dql.l;
                    to toVar = dqlVarF.g;
                    Bundle bundle10 = new Bundle();
                    ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                    ro[] roVarArr = toVar.e;
                    i2 = iH;
                    int length = roVarArr.length;
                    dqlVar = dqlVar2;
                    ?? r11 = z;
                    while (r11 < length) {
                        int i13 = length;
                        ro roVar = roVarArr[r11];
                        roVar.getClass();
                        int i14 = r11;
                        Bundle bundle11 = new Bundle();
                        int i15 = i11;
                        bundle11.putLong(ro.m, roVar.a);
                        bundle11.putInt(ro.n, roVar.b);
                        bundle11.putInt(ro.t, roVar.c);
                        bundle11.putParcelableArrayList(ro.o, new ArrayList<>(Arrays.asList(roVar.d)));
                        String str3 = ro.u;
                        ArrayList<? extends Parcelable> arrayList6 = new ArrayList<>();
                        qjd[] qjdVarArr = roVar.e;
                        ro[] roVarArr2 = roVarArr;
                        int length2 = qjdVarArr.length;
                        ?? r12 = z;
                        while (true) {
                            if (r12 >= length2) {
                                break;
                            }
                            int i16 = r12;
                            qjd qjdVar = qjdVarArr[i16];
                            int i17 = length2;
                            arrayList6.add(qjdVar != null ? qjdVar.c(true) : null);
                            length2 = i17;
                            r12 = i16 + 1;
                        }
                        bundle11.putParcelableArrayList(str3, arrayList6);
                        bundle11.putIntArray(ro.p, roVar.f);
                        bundle11.putLongArray(ro.q, roVar.g);
                        Bundle bundle12 = bundle5;
                        bundle11.putLong(ro.r, roVar.j);
                        bundle11.putBoolean(ro.s, roVar.k);
                        bundle11.putStringArrayList(ro.v, new ArrayList<>(Arrays.asList(roVar.h)));
                        String str4 = ro.x;
                        ArrayList<? extends Parcelable> arrayList7 = new ArrayList<>();
                        so[] soVarArr = roVar.i;
                        int length3 = soVarArr.length;
                        ?? r2 = z;
                        while (r2 < length3) {
                            int i18 = r2;
                            so soVar = soVarArr[i18];
                            if (soVar == null) {
                                arrayList2 = arrayList3;
                                str = str2;
                                gqlVar2 = gqlVar3;
                                bundle3 = bundle12;
                                i4 = length3;
                                bundle4 = null;
                            } else {
                                bundle3 = bundle12;
                                bundle4 = new Bundle();
                                i4 = length3;
                                arrayList2 = arrayList3;
                                str = str2;
                                bundle4.putLong(so.d, soVar.a);
                                gqlVar2 = gqlVar3;
                                bundle4.putLong(so.e, soVar.b);
                                bundle4.putString(so.f, soVar.c);
                            }
                            arrayList7.add(bundle4);
                            bundle12 = bundle3;
                            length3 = i4;
                            arrayList3 = arrayList2;
                            str2 = str;
                            gqlVar3 = gqlVar2;
                            r2 = i18 + 1;
                        }
                        Bundle bundle13 = bundle12;
                        bundle11.putParcelableArrayList(str4, arrayList7);
                        bundle11.putBoolean(ro.w, roVar.l);
                        arrayList5.add(bundle11);
                        length = i13;
                        i11 = i15;
                        roVarArr = roVarArr2;
                        bundle5 = bundle13;
                        r11 = i14 + 1;
                    }
                    bundle2 = bundle5;
                    arrayList = arrayList3;
                    String str5 = str2;
                    gqlVar = gqlVar3;
                    i3 = i11;
                    if (!arrayList5.isEmpty()) {
                        bundle10.putParcelableArrayList(to.h, arrayList5);
                    }
                    long j12 = toVar.b;
                    if (j12 != j) {
                        bundle10.putLong(to.i, j12);
                    }
                    long j13 = toVar.c;
                    if (j13 != -9223372036854775807L) {
                        bundle10.putLong(to.j, j13);
                    }
                    int i19 = toVar.d;
                    if (i19 != 0) {
                        bundle10.putInt(to.k, i19);
                    }
                    bundle9.putBundle(str5, bundle10);
                }
                arrayList4.add(bundle9);
                i11 = i3 + 1;
                z3 = z;
                iH = i2;
                dqlVar2 = dqlVar;
                bundle5 = bundle2;
                arrayList3 = arrayList;
                gqlVar3 = gqlVar;
            }
            Bundle bundle14 = bundle5;
            ArrayList arrayList8 = arrayList3;
            gql gqlVar4 = gqlVar3;
            int i20 = z3;
            int[] iArr = new int[iO];
            boolean z9 = true;
            if (iO > 0) {
                iArr[i20] = gqlVar4.a(true);
            }
            int i21 = 1;
            while (i21 < iO) {
                iArr[i21] = gqlVar4.e(iArr[i21 - 1], i20, z9);
                i21++;
                z9 = true;
                i20 = 0;
            }
            Bundle bundle15 = new Bundle();
            bundle15.putBinder(gql.b, new k14(arrayList8));
            bundle15.putBinder(gql.c, new k14(arrayList4));
            bundle15.putIntArray(gql.d, iArr);
            bundle = bundle14;
            bundle.putBundle(L, bundle15);
        }
        int i22 = this.k;
        if (i22 != 0) {
            bundle.putInt(n0, i22);
        }
        r4n r4nVar = r4n.d;
        r4n r4nVar2 = this.l;
        if (!r4nVar2.equals(r4nVar)) {
            Bundle bundle16 = new Bundle();
            int i23 = r4nVar2.a;
            if (i23 != 0) {
                bundle16.putInt(r4n.e, i23);
            }
            int i24 = r4nVar2.b;
            if (i24 != 0) {
                bundle16.putInt(r4n.f, i24);
            }
            float f = r4nVar2.c;
            if (f != 1.0f) {
                bundle16.putFloat(r4n.g, f);
            }
            bundle.putBundle(M, bundle16);
        }
        vjd vjdVar = vjd.K;
        vjd vjdVar2 = this.m;
        if (!vjdVar2.equals(vjdVar)) {
            bundle.putBundle(N, vjdVar2.c());
        }
        float f2 = this.n;
        if (f2 != 1.0f) {
            bundle.putFloat(O, f2);
        }
        float f3 = this.o;
        if (f3 != 1.0f) {
            bundle.putFloat(P, f3);
        }
        int i25 = this.p;
        if (i25 != 0) {
            bundle.putInt(p0, i25);
        }
        pf2 pf2Var = pf2.i;
        pf2 pf2Var2 = this.q;
        if (!pf2Var2.equals(pf2Var)) {
            bundle.putBundle(Q, pf2Var2.c());
        }
        y36 y36Var = y36.d;
        y36 y36Var2 = this.r;
        if (!y36Var2.equals(y36Var)) {
            Bundle bundle17 = new Bundle();
            String str6 = y36.e;
            csh cshVar = y36Var2.a;
            z0b z0bVarP = h1b.p();
            for (int i26 = 0; i26 < cshVar.d; i26++) {
                if (((x36) cshVar.get(i26)).d == null) {
                    z0bVarP.c((x36) cshVar.get(i26));
                }
            }
            csh cshVarG = z0bVarP.g();
            ArrayList<? extends Parcelable> arrayList9 = new ArrayList<>(cshVarG.d);
            a1b a1bVarU = cshVarG.u(0);
            while (a1bVarU.hasNext()) {
                x36 x36Var = (x36) a1bVarU.next();
                Bundle bundleC = x36Var.c();
                Bitmap bitmap = x36Var.d;
                if (bitmap != null) {
                    bundleC.putParcelable(x36.w, bitmap);
                }
                arrayList9.add(bundleC);
            }
            bundle17.putParcelableArrayList(str6, arrayList9);
            bundle17.putLong(y36.f, y36Var2.b);
            bundle.putBundle(g0, bundle17);
        }
        u67 u67Var = u67.e;
        u67 u67Var2 = this.s;
        if (!u67Var2.equals(u67Var)) {
            Bundle bundle18 = new Bundle();
            int i27 = u67Var2.a;
            if (i27 != 0) {
                bundle18.putInt(u67.f, i27);
            }
            int i28 = u67Var2.b;
            if (i28 != 0) {
                bundle18.putInt(u67.g, i28);
            }
            int i29 = u67Var2.c;
            if (i29 != 0) {
                bundle18.putInt(u67.h, i29);
            }
            String str7 = u67Var2.d;
            if (str7 != null) {
                bundle18.putString(u67.i, str7);
            }
            bundle.putBundle(R, bundle18);
        }
        int i30 = this.t;
        if (i30 != 0) {
            bundle.putInt(S, i30);
        }
        boolean z10 = this.u;
        if (z10) {
            bundle.putBoolean(T, z10);
        }
        boolean z11 = this.v;
        if (z11) {
            bundle.putBoolean(U, z11);
        }
        int i31 = this.w;
        if (i31 != 1) {
            bundle.putInt(V, i31);
        }
        int i32 = this.z;
        if (i32 != 0) {
            bundle.putInt(W, i32);
        }
        int i33 = this.A;
        if (i33 != 1) {
            bundle.putInt(X, i33);
        }
        boolean z12 = this.x;
        if (z12) {
            bundle.putBoolean(Y, z12);
        }
        boolean z13 = this.y;
        if (z13) {
            bundle.putBoolean(Z, z13);
        }
        vjd vjdVar3 = vjd.K;
        vjd vjdVar4 = this.B;
        if (!vjdVar4.equals(vjdVar3)) {
            bundle.putBundle(h0, vjdVar4.c());
        }
        long j14 = i < 6 ? j : 5000L;
        long j15 = this.C;
        if (j15 != j14) {
            bundle.putLong(i0, j15);
        }
        long j16 = i < 6 ? j : 15000L;
        long j17 = this.D;
        if (j17 != j16) {
            bundle.putLong(j0, j17);
        }
        long j18 = i < 6 ? j : 3000L;
        long j19 = this.E;
        if (j19 != j18) {
            bundle.putLong(k0, j19);
        }
        fzl fzlVar = fzl.b;
        fzl fzlVar2 = this.F;
        if (!fzlVar2.equals(fzlVar)) {
            Bundle bundle19 = new Bundle();
            bundle19.putParcelableArrayList(fzl.c, j14.q0(fzlVar2.a, new bql((byte) 3)));
            bundle.putBundle(m0, bundle19);
        }
        nyl nylVar = nyl.J;
        nyl nylVar2 = this.G;
        if (!nylVar2.equals(nylVar)) {
            bundle.putBundle(l0, nylVar2.c());
        }
        return bundle;
    }
}
