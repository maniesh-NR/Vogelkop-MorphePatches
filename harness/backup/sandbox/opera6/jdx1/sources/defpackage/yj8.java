package defpackage;

import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class yj8 {
    public final /* synthetic */ kg9 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ afe c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ r17 g;
    public final /* synthetic */ afe h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ q0g j;
    public final /* synthetic */ q0g k;

    public yj8(kg9 kg9Var, boolean z, afe afeVar, String str, String str2, String str3, r17 r17Var, afe afeVar2, Function1 function1, q0g q0gVar, q0g q0gVar2) {
        this.a = kg9Var;
        this.b = z;
        this.c = afeVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = r17Var;
        this.h = afeVar2;
        this.i = function1;
        this.j = q0gVar;
        this.k = q0gVar2;
    }

    public final void a(final boolean z, final Function0 function0, c8e c8eVar, voi voiVar, boolean z2, paj pajVar, long j, float f, final ue5 ue5Var, ih5 ih5Var, final int i, final int i2) {
        int i3;
        vt9 vt9Var;
        final c8e c8eVar2;
        final voi voiVar2;
        final boolean z3;
        final paj pajVar2;
        final long j2;
        final float f2;
        voi voiVarQ0;
        c8e c8eVar3;
        boolean z4;
        voi voiVar3;
        boolean z5;
        voi voiVar4;
        c8e c8eVar4;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-126848451);
        int i4 = i | (vt9Var2.g(z) ? 4 : 2) | 919168384;
        if ((i2 & 6) == 0) {
            i3 = i2 | (vt9Var2.h(ue5Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var2.f(this) ? 32 : 16;
        }
        if (vt9Var2.N(i4 & 1, ((306783379 & i4) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            vt9Var2.S();
            if ((i & 1) == 0 || vt9Var2.x()) {
                voiVarQ0 = oup.q0(vt9Var2);
                float f3 = jtd.a;
                paj pajVarB = ccj.b(oud.c, vt9Var2);
                long jD = ua5.d(oud.a, vt9Var2);
                f2 = jtd.a;
                pajVar2 = pajVarB;
                c8eVar3 = z7e.b;
                j2 = jD;
                z4 = true;
            } else {
                vt9Var2.Q();
                c8eVar3 = c8eVar;
                voiVarQ0 = voiVar;
                z4 = z2;
                pajVar2 = pajVar;
                j2 = j;
                f2 = f;
            }
            vt9Var2.q();
            Object objK = vt9Var2.K();
            zpa zpaVar = hh5.a;
            if (objK == zpaVar) {
                t0g t0gVar = new t0g(Unit.a, qs7.g);
                vt9Var2.g0(t0gVar);
                objK = t0gVar;
            }
            afe afeVar = (afe) objK;
            n27 n27Var = (n27) vt9Var2.j(mi5.h);
            WeakHashMap weakHashMap = k3o.x;
            int i5 = fac.m(vt9Var2).f.e().b;
            if (z) {
                vt9Var2.W(629991660);
                Object objK2 = vt9Var2.K();
                if (objK2 == zpaVar) {
                    voiVar3 = voiVarQ0;
                    objK2 = new ox0(afeVar, (byte) 10);
                    vt9Var2.g0(objK2);
                } else {
                    voiVar3 = voiVarQ0;
                }
                yi4.e((Function0) objK2, vt9Var2, 6);
                vt9Var2.p(false);
            } else {
                voiVar3 = voiVarQ0;
                vt9Var2.W(630077189);
                vt9Var2.p(false);
            }
            Object objK3 = vt9Var2.K();
            if (objK3 == zpaVar) {
                objK3 = new cfe(Boolean.FALSE);
                vt9Var2.g0(objK3);
            }
            cfe cfeVar = (cfe) objK3;
            c8e c8eVar5 = c8eVar3;
            cfeVar.c.setValue(Boolean.valueOf(z));
            if (((Boolean) cfeVar.b.getValue()).booleanValue() || ((Boolean) cfeVar.c.getValue()).booleanValue()) {
                vt9Var2.W(630396489);
                Object objK4 = vt9Var2.K();
                paj pajVar3 = pajVar2;
                long j3 = j2;
                if (objK4 == zpaVar) {
                    objK4 = hyg.k(new a2m(a2m.b));
                    vt9Var2.g0(objK4);
                }
                afe afeVar2 = (afe) objK4;
                boolean zF = vt9Var2.f(n27Var) | vt9Var2.d(i5);
                Object objK5 = vt9Var2.K();
                if (zF || objK5 == zpaVar) {
                    objK5 = new zj8(n27Var, i5, afeVar, new g51(afeVar2, (byte) 2));
                    vt9Var2.g0(objK5);
                }
                zj8 zj8Var = (zj8) objK5;
                ((tj8) this.h.getValue()).getClass();
                ((Boolean) this.c.getValue()).getClass();
                z5 = z4;
                voiVar4 = voiVar3;
                pajVar2 = pajVar3;
                j2 = j3;
                c8eVar4 = c8eVar5;
                w91.a(zj8Var, function0, new gog(!((Boolean) fr3.W(0, vt9Var2, 7).getValue()).booleanValue() ? 393248 : 393216, true), gyg.P(2063119149, new vj8(this, c8eVar4, z5, cfeVar, afeVar2, voiVar4, pajVar2, j2, f2, ue5Var), vt9Var2), vt9Var2, 3120, 0);
                vt9Var = vt9Var2;
                vt9Var.p(false);
            } else {
                vt9Var2.W(631807237);
                vt9Var2.p(false);
                voiVar4 = voiVar3;
                c8eVar4 = c8eVar5;
                z5 = z4;
                vt9Var = vt9Var2;
            }
            c8eVar2 = c8eVar4;
            voiVar2 = voiVar4;
            z3 = z5;
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
            c8eVar2 = c8eVar;
            voiVar2 = voiVar;
            z3 = z2;
            pajVar2 = pajVar;
            j2 = j;
            f2 = f;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2(z, function0, c8eVar2, voiVar2, z3, pajVar2, j2, f2, ue5Var, i, i2) { // from class: uj8
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ c8e d;
                public final /* synthetic */ voi e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ paj g;
                public final /* synthetic */ long h;
                public final /* synthetic */ float i;
                public final /* synthetic */ ue5 j;
                public final /* synthetic */ int k;

                {
                    this.k = i2;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = aoh.m(49);
                    int iM2 = aoh.m(this.k);
                    this.a.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (ih5) obj, iM, iM2);
                    return Unit.a;
                }
            };
        }
    }
}
