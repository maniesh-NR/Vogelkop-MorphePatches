package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class zbc implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n7i b;

    public /* synthetic */ zbc(n7i n7iVar, byte b) {
        this.a = b;
        this.b = n7iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        byte b2 = 1;
        ih5 ih5Var = (ih5) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    na2.c(cs5.e, gyg.P(-434212338, new zbc(this.b, b2), vt9Var), null, null, vt9Var, 54, 12);
                } else {
                    vt9Var.Q();
                }
                break;
            default:
                vt9 vt9Var2 = (vt9) ih5Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    f03.a(this.b, (c8e) null, false, (pta) null, (paj) null, cs5.f, vt9Var2, 1572864, 62);
                } else {
                    vt9Var2.Q();
                }
                break;
        }
        return Unit.a;
    }
}
