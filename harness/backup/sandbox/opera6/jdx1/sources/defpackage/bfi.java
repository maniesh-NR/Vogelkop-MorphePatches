package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bfi implements Cloneable {
    public Float A;
    public kfi B;
    public Float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public long a = 0;
    public kfi b;
    public Float c;
    public kfi d;
    public Float e;
    public nei f;
    public Float g;
    public nei[] h;
    public nei i;
    public Float j;
    public eei k;
    public ArrayList l;
    public nei m;
    public Integer n;
    public Boolean o;
    public i3j p;
    public String q;
    public String r;
    public String s;
    public Boolean t;
    public Boolean u;
    public kfi v;
    public Float w;
    public String x;
    public String y;
    public kfi z;

    public static bfi b() {
        bfi bfiVar = new bfi();
        bfiVar.a = -1L;
        eei eeiVar = eei.b;
        bfiVar.b = eeiVar;
        bfiVar.D = 1;
        Float fValueOf = Float.valueOf(1.0f);
        bfiVar.c = fValueOf;
        bfiVar.d = null;
        bfiVar.e = fValueOf;
        bfiVar.f = new nei(1.0f);
        bfiVar.E = 1;
        bfiVar.F = 1;
        bfiVar.g = Float.valueOf(4.0f);
        bfiVar.h = null;
        bfiVar.i = new nei(0.0f);
        bfiVar.j = fValueOf;
        bfiVar.k = eeiVar;
        bfiVar.l = null;
        bfiVar.m = new nei(12.0f, 7);
        bfiVar.n = 400;
        bfiVar.G = 1;
        bfiVar.H = 1;
        bfiVar.I = 1;
        bfiVar.J = 1;
        Boolean bool = Boolean.TRUE;
        bfiVar.o = bool;
        bfiVar.p = null;
        bfiVar.q = null;
        bfiVar.r = null;
        bfiVar.s = null;
        bfiVar.t = bool;
        bfiVar.u = bool;
        bfiVar.v = eeiVar;
        bfiVar.w = fValueOf;
        bfiVar.x = null;
        bfiVar.K = 1;
        bfiVar.y = null;
        bfiVar.z = null;
        bfiVar.A = fValueOf;
        bfiVar.B = null;
        bfiVar.C = fValueOf;
        bfiVar.L = 1;
        bfiVar.M = 1;
        return bfiVar;
    }

    public final Object clone() {
        bfi bfiVar = (bfi) super.clone();
        nei[] neiVarArr = this.h;
        if (neiVarArr != null) {
            bfiVar.h = (nei[]) neiVarArr.clone();
        }
        return bfiVar;
    }
}
