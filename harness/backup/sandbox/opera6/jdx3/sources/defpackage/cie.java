package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.leanplum.utils.SizeUtil;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class cie extends bzo {
    public ArrayList A;
    public HashMap B;
    public ArrayList C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public ArrayList I;
    public boolean J;
    public String K;
    public ArrayList L;
    public String M;
    public ArrayList N;
    public String O;
    public jsd P;
    public ArrayList Q;
    public View R;
    public TextView S;
    public y55 T;
    public boolean U;
    public int V;
    public float W;
    public mgh X;
    public oam Y;
    public lxo Z;
    public String a0;
    public String b0;
    public String c0;
    public String d0;
    public String e0;
    public String f0;
    public String g0;
    public String h0;
    public String i0;
    public String j0;
    public String k0;
    public String l0;
    public String m0;
    public String n0;
    public String o;
    public boolean o0;
    public String p;
    public String p0;
    public String q;
    public boolean q0;
    public String r;
    public String r0;
    public boolean s;
    public String s0;
    public String t;
    public int t0;
    public xho u;
    public String u0;
    public String v;
    public String v0;
    public String w;
    public aoo w0;
    public String x;
    public int x0;
    public String y;
    public int y0;
    public String z;
    public int z0;

    @Override // defpackage.bzo
    public final l0p a() {
        return new a36();
    }

    @Override // defpackage.bzo
    public final boolean b(vho vhoVar, pqo pqoVar) {
        if (vhoVar.b.isEmpty()) {
            return false;
        }
        if (vhoVar.c()) {
            this.z0 = vhoVar.h;
        }
        return f(pqoVar, vhoVar.a, vhoVar.a(), vhoVar.g);
    }

    @Override // defpackage.bzo
    public final qyo c(pqo pqoVar) {
        return super.c(pqoVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean f(pqo pqoVar, w06 w06Var, lho lhoVar, fio fioVar) {
        String str;
        rbe rbeVar = rbe.B;
        xho xhoVar = lhoVar.a;
        ArrayList arrayList = lhoVar.d;
        this.d = w06Var;
        String str2 = xhoVar.d;
        String str3 = xhoVar.l;
        ArrayList arrayList2 = xhoVar.o;
        String str4 = xhoVar.r;
        String str5 = xhoVar.c;
        ArrayList arrayList3 = xhoVar.p;
        String str6 = xhoVar.n;
        String str7 = xhoVar.g;
        boolean z = xhoVar.f;
        String str8 = xhoVar.b;
        this.q = str2;
        this.r = xhoVar.e;
        this.f = fioVar;
        switch (aie.a[w06Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.p = str8;
                this.o = str5;
                this.s = z;
                this.t = str7;
                this.O = xhoVar.B;
                this.r0 = xhoVar.W;
                this.s0 = xhoVar.X;
                this.t0 = xhoVar.Y;
                this.L = arrayList;
                str = lhoVar.b;
                try {
                    f1p.a().getClass();
                    this.M = f1p.g(str);
                } catch (Exception e) {
                    e.printStackTrace();
                    this.M = str;
                }
                this.p0 = lhoVar.c;
                this.y0 = lhoVar.e;
                this.e = lhoVar.h;
                this.Y = lhoVar.i;
                this.u0 = lhoVar.k;
                this.v0 = lhoVar.l;
                this.u = xhoVar;
                this.j = lhoVar.g;
                return true;
            case 4:
                bn bnVar = this.b;
                this.b = rbeVar;
                lxo lxoVar = new lxo(this.a, this, new w6j(lhoVar.a.h, w06Var, this.c, arrayList, lhoVar.i), new isd(this, bnVar), this.T, this.f);
                this.Z = lxoVar;
                lxoVar.a = new yhe(this, bnVar);
                this.L = arrayList;
                str = lhoVar.b;
                f1p.a().getClass();
                this.M = f1p.g(str);
                this.p0 = lhoVar.c;
                this.y0 = lhoVar.e;
                this.e = lhoVar.h;
                this.Y = lhoVar.i;
                this.u0 = lhoVar.k;
                this.v0 = lhoVar.l;
                this.u = xhoVar;
                this.j = lhoVar.g;
                return true;
            case 5:
                this.p = str8;
                this.o = str5;
                this.v = str3;
                this.s = z;
                this.t = str7;
                this.L = arrayList;
                str = lhoVar.b;
                f1p.a().getClass();
                this.M = f1p.g(str);
                this.p0 = lhoVar.c;
                this.y0 = lhoVar.e;
                this.e = lhoVar.h;
                this.Y = lhoVar.i;
                this.u0 = lhoVar.k;
                this.v0 = lhoVar.l;
                this.u = xhoVar;
                this.j = lhoVar.g;
                return true;
            case 6:
                this.p = str8;
                this.w = xhoVar.i;
                this.x = xhoVar.j;
                this.y = xhoVar.k;
                this.v = str3;
                this.s = z;
                this.t = str7;
                this.L = arrayList;
                str = lhoVar.b;
                f1p.a().getClass();
                this.M = f1p.g(str);
                this.p0 = lhoVar.c;
                this.y0 = lhoVar.e;
                this.e = lhoVar.h;
                this.Y = lhoVar.i;
                this.u0 = lhoVar.k;
                this.v0 = lhoVar.l;
                this.u = xhoVar;
                this.j = lhoVar.g;
                return true;
            case 7:
                this.a0 = xhoVar.H;
                this.b0 = xhoVar.I;
                this.c0 = xhoVar.J;
                this.d0 = xhoVar.K;
                this.i0 = xhoVar.P;
                this.j0 = xhoVar.Q;
                this.e0 = xhoVar.L;
                this.f0 = xhoVar.M;
                this.g0 = xhoVar.N;
                this.h0 = xhoVar.O;
                this.s = z;
                this.t = str7;
                this.k0 = xhoVar.R;
                this.l0 = xhoVar.S;
                this.m0 = xhoVar.T;
                this.n0 = xhoVar.U;
                this.o0 = xhoVar.V;
                this.L = arrayList;
                str = lhoVar.b;
                f1p.a().getClass();
                this.M = f1p.g(str);
                this.p0 = lhoVar.c;
                this.y0 = lhoVar.e;
                this.e = lhoVar.h;
                this.Y = lhoVar.i;
                this.u0 = lhoVar.k;
                this.v0 = lhoVar.l;
                this.u = xhoVar;
                this.j = lhoVar.g;
                return true;
            case 8:
                this.p = str8;
                this.o = str5;
                this.s = z;
                this.t = str7;
                this.L = arrayList;
                str = lhoVar.b;
                f1p.a().getClass();
                this.M = f1p.g(str);
                this.p0 = lhoVar.c;
                this.y0 = lhoVar.e;
                this.e = lhoVar.h;
                this.Y = lhoVar.i;
                this.u0 = lhoVar.k;
                this.v0 = lhoVar.l;
                this.u = xhoVar;
                this.j = lhoVar.g;
                return true;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                this.p = str8;
                this.z = str6;
                this.A = arrayList2;
                this.s = z;
                this.t = str7;
                this.B = xhoVar.t;
                this.N = arrayList3;
                this.L = arrayList;
                str = lhoVar.b;
                f1p.a().getClass();
                this.M = f1p.g(str);
                this.p0 = lhoVar.c;
                this.y0 = lhoVar.e;
                this.e = lhoVar.h;
                this.Y = lhoVar.i;
                this.u0 = lhoVar.k;
                this.v0 = lhoVar.l;
                this.u = xhoVar;
                this.j = lhoVar.g;
                return true;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                this.x0 = xhoVar.Z;
                this.p = str8;
                this.o = str5;
                this.z = str6;
                this.E = xhoVar.u;
                this.F = xhoVar.v;
                this.G = xhoVar.w;
                this.H = xhoVar.q;
                this.I = xhoVar.x;
                this.J = xhoVar.E;
                this.K = xhoVar.y;
                this.D = str4;
                this.N = arrayList3;
                this.L = arrayList;
                str = lhoVar.b;
                f1p.a().getClass();
                this.M = f1p.g(str);
                this.p0 = lhoVar.c;
                this.y0 = lhoVar.e;
                this.e = lhoVar.h;
                this.Y = lhoVar.i;
                this.u0 = lhoVar.k;
                this.v0 = lhoVar.l;
                this.u = xhoVar;
                this.j = lhoVar.g;
                return true;
            case 11:
            case 12:
                this.p = str8;
                this.z = str6;
                this.A = arrayList2;
                this.D = str4;
                this.s = z;
                this.t = str7;
                this.N = arrayList3;
                this.L = arrayList;
                str = lhoVar.b;
                f1p.a().getClass();
                this.M = f1p.g(str);
                this.p0 = lhoVar.c;
                this.y0 = lhoVar.e;
                this.e = lhoVar.h;
                this.Y = lhoVar.i;
                this.u0 = lhoVar.k;
                this.v0 = lhoVar.l;
                this.u = xhoVar;
                this.j = lhoVar.g;
                return true;
            case 13:
                this.p = str8;
                this.z = str6;
                this.D = str4;
                this.s = z;
                this.t = str7;
                this.C = xhoVar.z;
                this.N = arrayList3;
                this.L = arrayList;
                str = lhoVar.b;
                f1p.a().getClass();
                this.M = f1p.g(str);
                this.p0 = lhoVar.c;
                this.y0 = lhoVar.e;
                this.e = lhoVar.h;
                this.Y = lhoVar.i;
                this.u0 = lhoVar.k;
                this.v0 = lhoVar.l;
                this.u = xhoVar;
                this.j = lhoVar.g;
                return true;
            case 14:
            case 15:
            case 16:
                this.L = arrayList;
                str = lhoVar.b;
                f1p.a().getClass();
                this.M = f1p.g(str);
                this.p0 = lhoVar.c;
                this.y0 = lhoVar.e;
                this.e = lhoVar.h;
                this.Y = lhoVar.i;
                this.u0 = lhoVar.k;
                this.v0 = lhoVar.l;
                this.u = xhoVar;
                this.j = lhoVar.g;
                return true;
            case 17:
            case SizeUtil.textSize0_1 /* 18 */:
            case 19:
                eyi eyiVar = xhoVar.G;
                mgh mghVar = eyiVar != null ? new mgh(this.a, eyiVar) : null;
                this.X = mghVar;
                if (mghVar != null) {
                    if (w06Var == w06.t) {
                        xho xhoVar2 = (xho) ((eyi) mghVar.b).d;
                        this.p = xhoVar2 != null ? xhoVar2.b : null;
                        this.o = xhoVar2 != null ? xhoVar2.c : null;
                        this.q = xhoVar2 != null ? xhoVar2.d : null;
                        this.r = xhoVar2 != null ? xhoVar2.e : null;
                        this.s = xhoVar2 != null && xhoVar2.f;
                        this.t = xhoVar2 != null ? xhoVar2.g : null;
                    }
                    bn bnVar2 = this.b;
                    this.b = rbeVar;
                    fzo fzoVar = new fzo(new isd(this, bnVar2));
                    fzoVar.a = new yhe(this, bnVar2);
                    ((nxo) mghVar.c).c(fzoVar);
                }
                this.L = arrayList;
                str = lhoVar.b;
                f1p.a().getClass();
                this.M = f1p.g(str);
                this.p0 = lhoVar.c;
                this.y0 = lhoVar.e;
                this.e = lhoVar.h;
                this.Y = lhoVar.i;
                this.u0 = lhoVar.k;
                this.v0 = lhoVar.l;
                this.u = xhoVar;
                this.j = lhoVar.g;
                return true;
            default:
                return false;
        }
    }

    public final void g(int i) {
        w06 w06Var;
        if (TextUtils.isEmpty(this.j)) {
            return;
        }
        phj.t(w8h.b(this.j, String.valueOf((int) vep.f(i))), 25);
        if (i == 5 && (w06Var = this.d) != null && (w06Var instanceof n06)) {
            gxo.a(new et2(this.g, (byte) 6));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [jsd] */
    /* JADX WARN: Type inference failed for: r3v1, types: [jsd] */
    /* JADX WARN: Type inference failed for: r3v3, types: [jsd] */
    /* JADX WARN: Type inference failed for: r3v4, types: [czo, jsd] */
    public final void h(jsd jsdVar) {
        jsd jsdVar2 = this.P;
        if (jsdVar2 != null) {
            jsdVar2.e(this);
            this.P.removeAllViews();
        }
        if (jsdVar == 0) {
            if (this.R != null) {
                View view = this.R;
                jsdVar = new czo(view.getContext());
                jsdVar.c = view;
            } else {
                jsdVar = new czo(this.a);
            }
        }
        this.P = jsdVar;
        jsdVar.b(this, this.d);
    }

    public final void i() {
        pqo pqoVar = new pqo(this.h);
        phj.s(this.a, pqoVar, new vhe(this, new kqo((byte) 1), pqoVar));
    }

    @Override // defpackage.mro
    public final void unregister() {
        jsd jsdVar = this.P;
        if (jsdVar != null) {
            jsdVar.e(this);
        }
        this.U = true;
    }
}
