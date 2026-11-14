package defpackage;

import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class bqc extends kuk implements fr9 {
    public /* synthetic */ Boolean t;
    public /* synthetic */ boolean u;
    public /* synthetic */ boolean v;
    public /* synthetic */ List w;
    public /* synthetic */ boolean x;
    public final /* synthetic */ dqc y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqc(dqc dqcVar, mt5 mt5Var) {
        super(6, mt5Var);
        this.y = dqcVar;
    }

    public final Object invokeSuspend(Object obj) {
        Boolean bool = this.t;
        boolean z = this.u;
        boolean z2 = this.v;
        List list = this.w;
        boolean z3 = this.x;
        px5 px5Var = px5.a;
        ybh.y(obj);
        return (!((Boolean) this.y.a.d.g()).booleanValue() || z3 || list.isEmpty()) ? eqc.a : new fqc(list, z, z2, bool.booleanValue());
    }

    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
        bqc bqcVar = new bqc(this.y, (mt5) obj6);
        bqcVar.t = (Boolean) obj;
        bqcVar.u = zBooleanValue;
        bqcVar.v = zBooleanValue2;
        bqcVar.w = (List) obj4;
        bqcVar.x = zBooleanValue3;
        return bqcVar.invokeSuspend(Unit.a);
    }
}
