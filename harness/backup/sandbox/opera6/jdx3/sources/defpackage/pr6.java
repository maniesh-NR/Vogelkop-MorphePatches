package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class pr6 extends kuk implements cr9 {
    public final /* synthetic */ byte t;
    public /* synthetic */ boolean u;
    public /* synthetic */ boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pr6(int i, mt5 mt5Var, byte b) {
        super(i, mt5Var);
        this.t = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        Boolean bool = (Boolean) obj;
        switch (this.t) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                pr6 pr6Var = new pr6(i, (mt5) obj3, (byte) 0);
                pr6Var.u = zBooleanValue;
                pr6Var.v = zBooleanValue2;
                return pr6Var.invokeSuspend(Unit.a);
            case 1:
                boolean zBooleanValue3 = bool.booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                pr6 pr6Var2 = new pr6(i, (mt5) obj3, (byte) 1);
                pr6Var2.u = zBooleanValue3;
                pr6Var2.v = zBooleanValue4;
                return pr6Var2.invokeSuspend(Unit.a);
            default:
                boolean zBooleanValue5 = bool.booleanValue();
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                pr6 pr6Var3 = new pr6(i, (mt5) obj3, (byte) 2);
                pr6Var3.u = zBooleanValue5;
                pr6Var3.v = zBooleanValue6;
                return pr6Var3.invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = false;
        switch (this.t) {
            case 0:
                boolean z2 = this.u;
                boolean z3 = this.v;
                px5 px5Var = px5.a;
                ybh.y(obj);
                if (z2 && z3) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                boolean z4 = this.u;
                boolean z5 = this.v;
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                if (z4 && z5) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                boolean z6 = this.u;
                boolean z7 = this.v;
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                return new n2f(z6, z7);
        }
    }
}
