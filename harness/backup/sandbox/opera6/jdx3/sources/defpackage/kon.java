package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class kon extends kuk implements dr9 {
    public /* synthetic */ boolean t;
    public /* synthetic */ boolean u;
    public /* synthetic */ boolean v;

    public final Object invokeSuspend(Object obj) {
        boolean z = this.t;
        boolean z2 = this.u;
        boolean z3 = this.v;
        px5 px5Var = px5.a;
        ybh.y(obj);
        return new d2g(Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
    }

    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        kon konVar = new kon(4, (mt5) obj4);
        konVar.t = zBooleanValue;
        konVar.u = zBooleanValue2;
        konVar.v = zBooleanValue3;
        return konVar.invokeSuspend(Unit.a);
    }
}
