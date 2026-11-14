package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class xhl extends kuk implements Function1 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ dil u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xhl(dil dilVar, mt5 mt5Var, byte b) {
        super(1, mt5Var);
        this.t = b;
        this.u = dilVar;
    }

    public final mt5 create(mt5 mt5Var) {
        byte b = this.t;
        dil dilVar = this.u;
        switch (b) {
            case 0:
                return new xhl(dilVar, mt5Var, (byte) 0);
            case 1:
                return new xhl(dilVar, mt5Var, (byte) 1);
            case 2:
                return new xhl(dilVar, mt5Var, (byte) 2);
            default:
                return new xhl(dilVar, mt5Var, (byte) 3);
        }
    }

    public final Object invoke(Object obj) {
        mt5 mt5Var = (mt5) obj;
        switch (this.t) {
        }
        return create(mt5Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        dil dilVar = this.u;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                dilVar.A = false;
                break;
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                dilVar.c();
                break;
            case 2:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                dilVar.a(dilVar.A);
                break;
            default:
                px5 px5Var4 = px5.a;
                ybh.y(obj);
                dilVar.o();
                break;
        }
        return Unit.a;
    }
}
