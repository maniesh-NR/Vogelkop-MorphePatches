package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class sd9 implements f99 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xd6 b;
    public final /* synthetic */ dx5 c;

    public /* synthetic */ sd9(xd6 xd6Var, dx5 dx5Var, byte b) {
        this.a = b;
        this.b = xd6Var;
        this.c = dx5Var;
    }

    public final Object collect(l99 l99Var, mt5 mt5Var) {
        byte b = this.a;
        dx5 dx5Var = this.c;
        xd6 xd6Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = xd6Var.collect(new rd9(l99Var, dx5Var, (byte) 0), mt5Var);
                if (objCollect != px5.a) {
                    break;
                }
                break;
            default:
                Object objCollect2 = xd6Var.collect(new rd9(l99Var, dx5Var, (byte) 1), mt5Var);
                if (objCollect2 != px5.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
