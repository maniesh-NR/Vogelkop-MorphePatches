package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class vjf implements Function2 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ ue5 b;
    public final /* synthetic */ ue5 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vjf(float f, d2c d2cVar, ue5 ue5Var, ue5 ue5Var2) {
        this.d = f;
        this.e = d2cVar;
        this.b = ue5Var;
        this.c = ue5Var2;
    }

    public /* synthetic */ vjf(ue5 ue5Var, c8e c8eVar, ue5 ue5Var2, float f, int i) {
        this.b = ue5Var;
        this.e = c8eVar;
        this.c = ue5Var2;
        this.d = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                d2c d2cVar = (d2c) obj3;
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p37.d(null, new x62(this.d, true, new t40((byte) 19)), new x62(0.0f, true, new t40((byte) 19)), null, 0, 0, gyg.P(-1083567606, new f23(d2cVar, this.b, this.c, (byte) 12), vt9Var), vt9Var, 1572864, 57);
                } else {
                    vt9Var.Q();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                lcp.e(this.b, (c8e) obj3, this.c, this.d, (ih5) obj, aoh.m(7));
                break;
        }
        return Unit.a;
    }
}
