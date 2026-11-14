package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class s07 extends kuk implements Function2 {
    public final /* synthetic */ long A;
    public boolean t;
    public final /* synthetic */ u07 u;
    public final /* synthetic */ List v;
    public final /* synthetic */ List w;
    public final /* synthetic */ List x;
    public final /* synthetic */ jyc y;
    public final /* synthetic */ y10 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s07(u07 u07Var, mt5 mt5Var, List list, List list2, List list3, jyc jycVar, y10 y10Var, long j) {
        super(2, mt5Var);
        this.u = u07Var;
        this.v = list;
        this.w = list2;
        this.x = list3;
        this.y = jycVar;
        this.z = y10Var;
        this.A = j;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new s07(this.u, mt5Var, this.v, this.w, this.x, this.y, this.z, this.A);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        boolean z = this.t;
        if (z) {
            if (z) {
                ybh.y(obj);
                return obj;
            }
            qp2.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ybh.y(obj);
        cd5 cd5VarA = this.u.n().a(this.v, this.w, this.x, this.y, this.z, this.A);
        this.t = true;
        Object objA = cd5VarA.A(this);
        return objA == px5Var ? px5Var : objA;
    }
}
