package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class oij implements cr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ oij(float f, float f2, byte b) {
        this.a = b;
        this.b = f;
        this.c = f2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iM;
        byte b = this.a;
        final float f = this.c;
        final float f2 = this.b;
        vfd vfdVar = (vfd) obj;
        pfd pfdVar = (pfd) obj2;
        yo5 yo5Var = (yo5) obj3;
        switch (b) {
            case 0:
                int iH = yo5.h(yo5Var.a);
                if (iH == Integer.MAX_VALUE) {
                    ifg ifgVarN = pfdVar.N(yo5Var.a);
                    return vfdVar.b0(ifgVarN.a, ifgVarN.b, n08.a, new f4(ifgVarN, (byte) 12));
                }
                if (gh7.b(f2, Float.POSITIVE_INFINITY) || (iM = (iH - vfdVar.M(f2)) / 2) < 0) {
                    iM = 0;
                }
                int iMax = Math.max(iM, vfdVar.M(f));
                int i = iH / 2;
                if (iMax > i) {
                    iMax = i;
                }
                int i2 = iH - (iMax << 1);
                int i3 = i2 < 0 ? 0 : i2;
                ifg ifgVarN2 = pfdVar.N(yo5.a(i3, i3, 0, 0, 12, yo5Var.a));
                return vfdVar.b0(iH, ifgVarN2.b, n08.a, new gv(ifgVarN2, iH, (byte) 4));
            default:
                final ifg ifgVarN3 = pfdVar.N(yo5.a(0, 0, 0, 0, 10, yo5Var.a));
                int iB = zed.b(f2) + ifgVarN3.b;
                long j = yo5Var.a;
                return vfdVar.b0(yo5.h(j), djh.c(iB, yo5.i(j), yo5.g(j)), n08.a, new Function1() { // from class: rol
                    public final Object invoke(Object obj4) {
                        int iB2 = zed.b(f);
                        ifg ifgVar = ifgVarN3;
                        p1d.f((p1d) obj4, ifgVar, iB2 - (ifgVar.a / 2), zed.b(f2));
                        return Unit.a;
                    }
                });
        }
    }
}
