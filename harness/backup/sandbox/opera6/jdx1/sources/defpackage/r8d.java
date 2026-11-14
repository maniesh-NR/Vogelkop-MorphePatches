package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class r8d implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ r8d(int i, String str, int i2) {
        this.a = (byte) 0;
        this.c = i;
        this.b = str;
    }

    public /* synthetic */ r8d(String str, int i, byte b) {
        this.a = b;
        this.b = str;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                sfe.h(this.c, this.b, (ih5) obj, aoh.m(1));
                break;
            case 1:
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ijl.b(this.b, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, this.c, 0, null, vt9Var, 0, 384, 241662);
                } else {
                    vt9Var.Q();
                }
                break;
            default:
                ih5 ih5Var2 = (ih5) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ijl.b(this.b, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, this.c, 0, null, vt9Var2, 0, 384, 241662);
                } else {
                    vt9Var2.Q();
                }
                break;
        }
        return Unit.a;
    }
}
