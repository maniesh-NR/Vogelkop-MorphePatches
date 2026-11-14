package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class sv6 {
    public static final sv6 a = new sv6();

    public final void a(amj amjVar, ih5 ih5Var, int i) {
        z7e z7eVar;
        c8e c8eVarA;
        tul state;
        c8e c8eVarB0;
        float f = amjVar.h;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(2137486921);
        int i2 = i | (vt9Var.f(amjVar) ? 4 : 2);
        byte b = 0;
        if (vt9Var.N(i2 & 1, (i2 & 3) != 2)) {
            nul nulVar = amjVar.j;
            rul rulVar = amjVar.k;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) >= 2139095040) {
                qp2.o("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean zF = vt9Var.f(nulVar) | vt9Var.f(rulVar);
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (zF || objK == zpaVar) {
                objK = luj.b(new t2(amjVar, (byte) 18));
                vt9Var.g0(objK);
            }
            iak iakVarA = gmj.a(((u95) ((iak) objK).getValue()).a, nb6.Y(jae.c, vt9Var), null, vt9Var, 0, 12);
            ue5 ue5VarP = gyg.P(-1658896622, new o31(amjVar, (byte) 3), vt9Var);
            z7e z7eVar2 = z7e.b;
            if (rulVar == null || rulVar.b()) {
                z7eVar = z7eVar2;
                vt9Var.W(690108113);
                vt9Var.p(false);
                c8eVarA = z7eVar;
            } else {
                vt9Var.W(689467622);
                fsf fsfVar = fsf.a;
                int i3 = i2 & 14;
                boolean z = i3 == 4;
                Object objK2 = vt9Var.K();
                if (z || objK2 == zpaVar) {
                    objK2 = new wg5(amjVar, (byte) 16);
                    vt9Var.g0(objK2);
                }
                gk7 gk7VarB = ek7.b((Function1) objK2, vt9Var);
                boolean z2 = i3 == 4;
                Object objK3 = vt9Var.K();
                if (z2 || objK3 == zpaVar) {
                    objK3 = new rv6(b, null, amjVar);
                    vt9Var.g0(objK3);
                }
                c8eVarA = ek7.a(z7eVar2, gk7VarB, false, false, (cr9) objK3, 188);
                z7eVar = z7eVar2;
                vt9Var.p(false);
            }
            c8e c8eVarD = amjVar.a.d(c8eVarA);
            boolean zF2 = vt9Var.f(iakVarA);
            Object objK4 = vt9Var.K();
            if (zF2 || objK4 == zpaVar) {
                objK4 = new wg5(iakVarA, (byte) 17);
                vt9Var.g0(objK4);
            }
            c8e c8eVarD2 = fr3.D(c8eVarD, (Function1) objK4);
            Object objK5 = vt9Var.K();
            if (objK5 == zpaVar) {
                objK5 = new tb6((byte) 24);
                vt9Var.g0(objK5);
            }
            c8e c8eVarA2 = h0j.a(c8eVarD2, false, (Function1) objK5);
            Unit unit = Unit.a;
            Object objK6 = vt9Var.K();
            if (objK6 == zpaVar) {
                objK6 = qv6.b;
                vt9Var.g0(objK6);
            }
            c8e c8eVarA3 = ruk.a(c8eVarA2, unit, (PointerInputEventHandler) objK6);
            tfd tfdVarC = nr3.c(rbe.b, false);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarA3);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVarC, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            ah5 ah5Var = ujp.g;
            if (vt9Var.S || !Intrinsics.a(vt9Var.K(), Integer.valueOf(iHashCode))) {
                vep.x(iHashCode, vt9Var, iHashCode, ah5Var);
            }
            y4h.o(vt9Var, c8eVarP, ujp.d);
            c8e c8eVarM = x1p.m(ipe.h0(z7eVar, amjVar.i));
            hp7 hp7Var = so1.a;
            if (rulVar != null && (state = rulVar.getState()) != null && (c8eVarB0 = scd.b0(c8eVarM, new po1(state, (byte) 0))) != null) {
                c8eVarM = c8eVarB0;
            }
            boolean z3 = (i2 & 14) == 4;
            Object objK7 = vt9Var.K();
            if (z3 || objK7 == zpaVar) {
                objK7 = new pv6(amjVar, (byte) 0);
                vt9Var.g0(objK7);
            }
            u89 u89Var = (u89) objK7;
            long j = nulVar.c;
            long j2 = nulVar.d;
            long j3 = nulVar.e;
            long j4 = nulVar.f;
            ue5 ue5Var = amjVar.b;
            ikl iklVar = amjVar.c;
            ikl iklVar2 = amjVar.d;
            rd3 rd3Var = amjVar.e;
            c8e c8eVar = c8eVarM;
            ue5 ue5Var2 = amjVar.f;
            float f2 = amjVar.h;
            Object objK8 = vt9Var.K();
            if (objK8 == zpaVar) {
                objK8 = new ki5((byte) 14);
                vt9Var.g0(objK8);
            }
            so1.f(c8eVar, u89Var, j, j2, j4, j3, ue5Var, iklVar, iklVar2, (Function0) objK8, b72.e, rd3Var, 0, false, ue5Var2, ue5VarP, f2, vt9Var, 0, 1600566);
            vt9Var = vt9Var;
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fx0(this, amjVar, i, (byte) 22);
        }
    }
}
