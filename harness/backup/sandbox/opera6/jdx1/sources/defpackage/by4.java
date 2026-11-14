package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class by4 implements Function2 {
    public final /* synthetic */ float a;
    public final /* synthetic */ zvf b;
    public final /* synthetic */ ue5 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ue5 e;
    public final /* synthetic */ long f;

    public by4(float f, zvf zvfVar, ue5 ue5Var, long j, ue5 ue5Var2, long j2) {
        this.a = f;
        this.b = zvfVar;
        this.c = ue5Var;
        this.d = j;
        this.e = ue5Var2;
        this.f = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ih5 ih5Var = (ih5) obj;
        int iIntValue = ((Number) obj2).intValue();
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            a2k a2kVarY = nb6.Y(jae.e, vt9Var);
            a2k a2kVarY2 = nb6.Y(jae.d, vt9Var);
            a2k a2kVarY3 = nb6.Y(jae.b, vt9Var);
            a2k a2kVarY4 = nb6.Y(jae.c, vt9Var);
            c8e c8eVarW = a26.W(mpj.b(1, 0.0f, this.a), this.b);
            Object objK = vt9Var.K();
            if (objK == hh5.a) {
                objK = new gy4();
                vt9Var.g0(objK);
            }
            gy4 gy4Var = (gy4) objK;
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarW);
            bh5.To.getClass();
            vt9Var.a0();
            boolean z = vt9Var.S;
            fza fzaVar = m3c.S;
            if (z) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            ah5 ah5Var = ujp.f;
            y4h.o(vt9Var, gy4Var, ah5Var);
            ah5 ah5Var2 = ujp.e;
            y4h.o(vt9Var, oagVarL, ah5Var2);
            ah5 ah5Var3 = ujp.g;
            if (vt9Var.S || !Intrinsics.a(vt9Var.K(), Integer.valueOf(iHashCode))) {
                vep.x(iHashCode, vt9Var, iHashCode, ah5Var3);
            }
            ah5 ah5Var4 = ujp.d;
            y4h.o(vt9Var, c8eVarP, ah5Var4);
            z7e z7eVar = z7e.b;
            c8e c8eVarZ = j14.Z(z7eVar, "leadingIcon");
            ue5 ue5Var = this.c;
            boolean z2 = ue5Var != null;
            rd3 rd3Var = rbe.n;
            xf8.d(z2, c8eVarZ, o48.b(a2kVarY3, rd3Var).a(o48.e(a2kVarY, 2)), o48.g(a2kVarY4, rd3Var).a(o48.f(a2kVarY2, 2)), null, gyg.P(687705959, new ay4(ue5Var, this.d), vt9Var), vt9Var, 196656, 16);
            c8e c8eVarZ2 = j14.Z(z7eVar, "label");
            zvf zvfVar = ey4.a;
            c8e c8eVarZ3 = a26.Z(c8eVarZ2, 8.0f, 0.0f, 2);
            o9i o9iVarA = m9i.a(b72.a, rbe.l, vt9Var, 54);
            int iHashCode2 = Long.hashCode(vt9Var.T);
            oag oagVarL2 = vt9Var.l();
            c8e c8eVarP2 = qyn.P(vt9Var, c8eVarZ3);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ah5Var);
            y4h.o(vt9Var, oagVarL2, ah5Var2);
            if (vt9Var.S || !Intrinsics.a(vt9Var.K(), Integer.valueOf(iHashCode2))) {
                vep.x(iHashCode2, vt9Var, iHashCode2, ah5Var3);
            }
            y4h.o(vt9Var, c8eVarP2, ah5Var4);
            o18.r(0, this.e, vt9Var, true);
            c8e c8eVarZ4 = j14.Z(z7eVar, "trailingIcon");
            rd3 rd3Var2 = rbe.p;
            xf8.d(false, c8eVarZ4, o48.b(a2kVarY3, rd3Var2).a(o48.e(a2kVarY, 2)), o48.g(a2kVarY4, rd3Var2).a(o48.f(a2kVarY2, 2)), null, gyg.P(1905252304, new xe5(this.f), vt9Var), vt9Var, 196656, 16);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
