package ads_mobile_sdk;

import defpackage.ybh;
import defpackage.zbf;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o81 extends kuk implements Function2 {
    public final /* synthetic */ zbf a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o81(mt5 mt5Var, zbf zbfVar, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.a = zbfVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new o81(mt5Var, this.a, (byte) 0);
            case 1:
                return new o81(mt5Var, this.a, (byte) 1);
            case 2:
                return new o81(mt5Var, this.a, (byte) 2);
            case 3:
                return new o81(mt5Var, this.a, (byte) 3);
            default:
                return new o81(mt5Var, this.a, (byte) 4);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return new o81((mt5) obj2, this.a, (byte) 0).invokeSuspend(Unit.a);
            case 1:
                return new o81((mt5) obj2, this.a, (byte) 1).invokeSuspend(Unit.a);
            case 2:
                return new o81((mt5) obj2, this.a, (byte) 2).invokeSuspend(Unit.a);
            case 3:
                return new o81((mt5) obj2, this.a, (byte) 3).invokeSuspend(Unit.a);
            default:
                return new o81((mt5) obj2, this.a, (byte) 4).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        zbf zbfVar = this.a;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                zbfVar.a(d91.R);
                break;
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                zbfVar.a(d91.Q);
                break;
            case 2:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                zbfVar.a(d91.P);
                break;
            case 3:
                px5 px5Var4 = px5.a;
                ybh.y(obj);
                zbfVar.a(d91.N);
                break;
            default:
                px5 px5Var5 = px5.a;
                ybh.y(obj);
                zbfVar.a(d91.O);
                break;
        }
        return Unit.a;
    }
}
