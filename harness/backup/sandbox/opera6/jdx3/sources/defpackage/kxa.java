package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class kxa extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public /* synthetic */ Object u;
    public final /* synthetic */ gki v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kxa(gki gkiVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = gkiVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        gki gkiVar = this.v;
        switch (b) {
            case 0:
                kxa kxaVar = new kxa(gkiVar, mt5Var, (byte) 0);
                kxaVar.u = obj;
                return kxaVar;
            default:
                kxa kxaVar2 = new kxa(gkiVar, mt5Var, (byte) 1);
                kxaVar2.u = obj;
                return kxaVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((s5h) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((nsl) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        gki gkiVar = this.v;
        Object obj2 = this.u;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                gkiVar.b((s5h) obj2, "properties");
                break;
            default:
                nsl nslVar = (nsl) obj2;
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                gkiVar.b(nslVar != null ? new Integer(nslVar.ordinal()) : null, "tool");
                break;
        }
        return Unit.a;
    }
}
