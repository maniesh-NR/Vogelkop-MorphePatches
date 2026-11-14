package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class qbl extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ lwg u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qbl(lwg lwgVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.u = lwgVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        lwg lwgVar = this.u;
        switch (b) {
            case 0:
                return new qbl(lwgVar, mt5Var, (byte) 0);
            case 1:
                return new qbl(lwgVar, mt5Var, (byte) 1);
            case 2:
                return new qbl(lwgVar, mt5Var, (byte) 2);
            case 3:
                return new qbl(lwgVar, mt5Var, (byte) 3);
            case 4:
                return new qbl(lwgVar, mt5Var, (byte) 4);
            case 5:
                return new qbl(lwgVar, mt5Var, (byte) 5);
            case 6:
                return new qbl(lwgVar, mt5Var, (byte) 6);
            default:
                return new qbl(lwgVar, mt5Var, (byte) 7);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        lwg lwgVar = this.u;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                lwgVar.a();
                break;
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                lwgVar.c();
                break;
            case 2:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                lwgVar.c();
                break;
            case 3:
                px5 px5Var4 = px5.a;
                ybh.y(obj);
                lwgVar.a();
                break;
            case 4:
                px5 px5Var5 = px5.a;
                ybh.y(obj);
                lwgVar.c();
                break;
            case 5:
                px5 px5Var6 = px5.a;
                ybh.y(obj);
                lwgVar.c();
                break;
            case 6:
                px5 px5Var7 = px5.a;
                ybh.y(obj);
                lwgVar.a();
                break;
            default:
                px5 px5Var8 = px5.a;
                ybh.y(obj);
                lwgVar.c();
                break;
        }
        return Unit.a;
    }
}
