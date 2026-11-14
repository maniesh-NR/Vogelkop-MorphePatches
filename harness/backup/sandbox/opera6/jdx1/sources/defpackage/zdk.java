package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class zdk implements cr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ zdk(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        z7e z7eVar = z7e.b;
        boolean z = this.b;
        switch (b) {
            case 0:
                ih5 ih5Var = (ih5) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    kfo.s(uyg.q((shk) dhk.u.getValue(), vt9Var), vt9Var, 0);
                    v4h.a(mpj.h(z7eVar, 48.0f), 0L, 0.0f, 0L, 0, 0.0f, vt9Var, 6, 62);
                    if (z) {
                        vt9Var.W(1485848457);
                        ijl.b(uyg.q((shk) dhk.r.getValue(), vt9Var), mpj.a, ((sa5) vt9Var.j(ua5.a)).s, 0L, null, 0L, null, new pel(3), 0L, 0, false, 0, 0, ((wam) vt9Var.j(abm.a)).k, vt9Var, 48, 0, 130040);
                        c26.a(null, null, null, null, wyh.b, vt9Var, 196608, 31);
                        vt9Var.p(false);
                    } else {
                        vt9Var.W(1486403915);
                        vt9Var.p(false);
                    }
                } else {
                    vt9Var.Q();
                }
                break;
            default:
                ih5 ih5Var2 = (ih5) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (!vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    vt9Var2.Q();
                } else if (z) {
                    vt9Var2.W(1494396278);
                    v4h.a(mpj.h(z7eVar, 16.0f), ((u95) vt9Var2.j(aq5.a)).a, 2.0f, 0L, 0, 0.0f, vt9Var2, 390, 56);
                    vt9Var2.p(false);
                } else {
                    vt9Var2.W(1494662010);
                    ijl.b(uyg.q((shk) ahk.F.getValue(), vt9Var2), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, vt9Var2, 0, 0, 262142);
                    vt9Var2.p(false);
                }
                break;
        }
        return Unit.a;
    }
}
