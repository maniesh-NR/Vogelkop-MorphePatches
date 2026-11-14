package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class sf4 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public /* synthetic */ Object u;
    public final /* synthetic */ pqh v;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sf4(pqh pqhVar, String str, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = pqhVar;
        this.w = str;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        String str = this.w;
        pqh pqhVar = this.v;
        switch (b) {
            case 0:
                sf4 sf4Var = new sf4(pqhVar, str, mt5Var, (byte) 0);
                sf4Var.u = obj;
                return sf4Var;
            default:
                sf4 sf4Var2 = new sf4(pqhVar, str, mt5Var, (byte) 1);
                sf4Var2.u = obj;
                return sf4Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        agf agfVar = (agf) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(agfVar, mt5Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        pqh pqhVar = this.v;
        String str = this.w;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                agf agfVar = (agf) this.u;
                sd4.b(str);
                pqhVar.a = null;
                return agfVar;
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                agf agfVar2 = (agf) this.u;
                sd4.b(str);
                pqhVar.a = null;
                return agfVar2;
        }
    }
}
