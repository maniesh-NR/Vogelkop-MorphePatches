package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class xtf implements Function2 {
    public final /* synthetic */ c8e a;
    public final /* synthetic */ ue5 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ sgl d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ ikl i;
    public final /* synthetic */ rvb j;
    public final /* synthetic */ ovb k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ int m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ uac o;
    public final /* synthetic */ lde p;
    public final /* synthetic */ ue5 q;
    public final /* synthetic */ ue5 r;
    public final /* synthetic */ ue5 s;
    public final /* synthetic */ ue5 t;
    public final /* synthetic */ ue5 u;
    public final /* synthetic */ ue5 v;
    public final /* synthetic */ paj w;

    /* JADX WARN: Multi-variable type inference failed */
    public xtf(c8e c8eVar, ue5 ue5Var, boolean z, sgl sglVar, String str, Function1 function1, boolean z2, boolean z3, ikl iklVar, rvb rvbVar, ovb ovbVar, boolean z4, int i, int i2, uac uacVar, lde ldeVar, ue5 ue5Var2, ue5 ue5Var3, ue5 ue5Var4, ue5 ue5Var5, ue5 ue5Var6, ue5 ue5Var7, paj pajVar) {
        this.a = c8eVar;
        this.b = ue5Var;
        this.c = z;
        this.d = sglVar;
        this.e = str;
        this.f = function1;
        this.g = z2;
        this.h = z3;
        this.i = iklVar;
        this.j = rvbVar;
        this.k = ovbVar;
        this.l = z4;
        this.m = i;
        this.n = i2;
        this.o = uacVar;
        this.p = ldeVar;
        this.q = ue5Var2;
        this.r = ue5Var3;
        this.s = ue5Var4;
        this.t = ue5Var5;
        this.u = ue5Var6;
        this.v = ue5Var7;
        this.w = pajVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        ih5 ih5Var = (ih5) obj;
        int iIntValue = ((Number) obj2).intValue();
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            ue5 ue5Var = this.b;
            c8e c8eVarB0 = z7e.b;
            if (ue5Var != null) {
                vt9Var.W(-903490605);
                Object objK = vt9Var.K();
                if (objK == hh5.a) {
                    objK = new w5f((byte) 13);
                    vt9Var.g0(objK);
                }
                c8eVarB0 = a26.b0(h0j.a(c8eVarB0, true, (Function1) objK), 0.0f, hn9.p(vt9Var), 0.0f, 0.0f, 13);
                vt9Var.p(false);
            } else {
                vt9Var.W(-903106918);
                vt9Var.p(false);
            }
            c8e c8eVarD = this.a.d(c8eVarB0);
            String strG = a4h.g(vt9Var, 2132018526);
            boolean z = this.c;
            if (z) {
                c8eVarD = h0j.a(c8eVarD, false, new u5f(strG, (byte) 13));
            }
            c8e c8eVarA = mpj.a(c8eVarD, 280.0f, 56.0f);
            sgl sglVar = this.d;
            nvj nvjVar = new nvj(z ? sglVar.j : sglVar.i);
            ue5 ue5Var2 = this.v;
            paj pajVar = this.w;
            String str = this.e;
            boolean z2 = this.g;
            boolean z3 = this.l;
            uac uacVar = this.o;
            lde ldeVar = this.p;
            x7d.a(str, this.f, c8eVarA, z2, this.h, this.i, this.j, this.k, z3, this.m, this.n ? 1 : 0, uacVar, null, ldeVar, nvjVar, gyg.P(-1189274459, new wtf(str, z2, z3, uacVar, ldeVar, this.c, this.b, this.q, this.r, this.s, this.t, this.u, ue5Var2, sglVar, pajVar), vt9Var), vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
