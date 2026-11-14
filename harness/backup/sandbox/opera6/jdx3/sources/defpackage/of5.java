package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class of5 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pf5 b;
    public final /* synthetic */ wf5 c;

    public /* synthetic */ of5(pf5 pf5Var, wf5 wf5Var, byte b) {
        this.a = b;
        this.b = pf5Var;
        this.c = wf5Var;
    }

    public /* synthetic */ of5(pf5 pf5Var, wf5 wf5Var, int i) {
        this.a = (byte) 1;
        this.b = pf5Var;
        this.c = wf5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = hh5.a;
        wf5 wf5Var = this.c;
        pf5 pf5Var = this.b;
        byte b2 = 2;
        byte b3 = 3;
        switch (b) {
            case 0:
                vt9 vt9Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var2 = vt9Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j14.h((c8e) null, (dif) null, mzg.q(vt9Var2, pf5Var.d), mzg.q(vt9Var2, pf5Var.e), gyg.P(-326278239, new of5(pf5Var, wf5Var, b2), vt9Var2), gyg.P(-562896064, new of5(pf5Var, wf5Var, b3), vt9Var2), 0L, 0L, 0, 0, 0, false, vt9Var2, 221184, 4035);
                } else {
                    vt9Var2.Q();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                pf5Var.content(wf5Var, (ih5) obj, aoh.m(1));
                break;
            case 2:
                vt9 vt9Var3 = (ih5) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                vt9 vt9Var4 = vt9Var3;
                if (vt9Var4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zH = vt9Var4.h(pf5Var) | vt9Var4.h(wf5Var);
                    Object objK = vt9Var4.K();
                    if (zH || objK == obj3) {
                        objK = new nf5(pf5Var, wf5Var, (byte) 1);
                        vt9Var4.g0(objK);
                    }
                    yi4.k((Function0) objK, (c8e) null, false, (paj) null, (z14) null, (zvf) null, gyg.P(-2143485628, new lf5(pf5Var), vt9Var4), vt9Var4, 805306368, 510);
                } else {
                    vt9Var4.Q();
                }
                break;
            default:
                vt9 vt9Var5 = (ih5) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                vt9 vt9Var6 = vt9Var5;
                if (vt9Var6.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zH2 = vt9Var6.h(pf5Var) | vt9Var6.h(wf5Var);
                    Object objK2 = vt9Var6.K();
                    if (zH2 || objK2 == obj3) {
                        objK2 = new nf5(pf5Var, wf5Var, (byte) 2);
                        vt9Var6.g0(objK2);
                    }
                    yi4.k((Function0) objK2, (c8e) null, false, (paj) null, (z14) null, (zvf) null, gyg.P(1914863843, new j04(pf5Var, b3), vt9Var6), vt9Var6, 805306368, 510);
                } else {
                    vt9Var6.Q();
                }
                break;
        }
        return Unit.a;
    }
}
