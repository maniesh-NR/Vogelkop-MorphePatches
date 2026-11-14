package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class mof {
    public static final long a;
    public static final long b;

    static {
        on7 on7Var = pn7.b;
        un7 un7Var = un7.d;
        a = cs5.x0(250, un7Var);
        b = cs5.x0(100, un7Var);
    }

    public static final void a(final boolean z, c8e c8eVar, final Function1 function1, boolean z2, ih5 ih5Var, final int i) {
        final c8e c8eVar2;
        final boolean z3;
        long jC;
        long jW;
        c8e c8eVarH0;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-230342971);
        int i2 = i | (vt9Var.g(z) ? 4 : 2) | 48 | (vt9Var.h(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | 224256;
        if (vt9Var.N(i2 & 1, (74899 & i2) != 74898)) {
            vt9Var.W(1210576854);
            Object objK = vt9Var.K();
            Object obj = hh5.a;
            if (objK == obj) {
                objK = new lde();
                vt9Var.g0(objK);
            }
            lde ldeVar = (lde) objK;
            vt9Var.p(false);
            Object objK2 = vt9Var.K();
            if (objK2 == obj) {
                objK2 = hyg.k(Boolean.FALSE);
                vt9Var.g0(objK2);
            }
            afe afeVar = (afe) objK2;
            boolean zF = vt9Var.f(ldeVar);
            Object objK3 = vt9Var.K();
            if (zF || objK3 == obj) {
                objK3 = new zf9(ldeVar, afeVar, null, (byte) 1);
                vt9Var.g0(objK3);
            }
            rm5.e(vt9Var, ldeVar, (Function2) objK3);
            if (z) {
                vt9Var.W(1978722092);
                unf unfVar = pof.a;
                jC = pof.a(vt9Var).a.j();
                vt9Var.p(false);
            } else {
                vt9Var.W(1978723740);
                unf unfVar2 = pof.a;
                jC = pof.a(vt9Var).a.C();
                vt9Var.p(false);
            }
            long j = a;
            iak iakVarA = gmj.a(jC, rm5.X((int) pn7.f(j), 6, null), "OperaSwitchTrackColor", vt9Var, 384, 8);
            if (z) {
                vt9Var.W(1978736494);
                jW = pof.a(vt9Var).a.r();
                vt9Var.p(false);
            } else {
                vt9Var.W(1978738197);
                jW = pof.a(vt9Var).a.w();
                vt9Var.p(false);
            }
            iak iakVarA2 = gmj.a(jW, rm5.X((int) pn7.f(j), 6, null), "OperaSwitchThumbColor", vt9Var, 384, 8);
            iak iakVarA3 = md1.a(((Boolean) afeVar.getValue()).booleanValue() ? 20.0f : 16.0f, rm5.X((int) pn7.f(b), 6, null), vt9Var, 384, 8);
            iak iakVarB = md1.b(z ? 1.0f : 0.0f, rm5.X((int) pn7.f(j), 6, null), "OperaSwitchThumbPosition", vt9Var, 3072, 20);
            vt9Var = vt9Var;
            float fFloatValue = (((Number) iakVarB.getValue()).floatValue() * 24.0f) + 12.0f;
            z7e z7eVar = z7e.b;
            if (function1 != null) {
                mga mgaVar = xdb.a;
                c8eVarH0 = fr3.h0(z, ldeVar, new q5i(2), function1);
            } else {
                c8eVarH0 = z7eVar;
            }
            c8e c8eVarC = sfe.C(mpj.o(c8eVarH0, 2).d(new lpj(48.0f, 24.0f, 48.0f, 24.0f, false, (Function1) uup.d)), ((u95) iakVarA.getValue()).a, v8i.a(12.0f));
            tfd tfdVarC = nr3.c(rbe.b, false);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarC);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVarC, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            nr3.a(sfe.C(mpj.h(i41.V(as3.a.a(z7eVar, rbe.e), fFloatValue - (((gh7) iakVarA3.getValue()).a / 2.0f), 0.0f, 2), ((gh7) iakVarA3.getValue()).a), ((u95) iakVarA2.getValue()).a, v8i.a).d(z7eVar), vt9Var, 0);
            vt9Var.p(true);
            z3 = true;
            c8eVar2 = z7eVar;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
            z3 = z2;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2(z, c8eVar2, function1, z3, i) { // from class: lof
                public final /* synthetic */ boolean a;
                public final /* synthetic */ c8e b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ boolean d;

                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM = aoh.m(1);
                    mof.a(this.a, this.b, this.c, this.d, (ih5) obj2, iM);
                    return Unit.a;
                }
            };
        }
    }
}
