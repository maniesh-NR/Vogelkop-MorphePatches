package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o07 extends kuk implements Function2 {
    public final /* synthetic */ u07 t;
    public final /* synthetic */ ArrayList u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o07(u07 u07Var, mt5 mt5Var, ArrayList arrayList, int i, int i2, int i3) {
        super(2, mt5Var);
        this.t = u07Var;
        this.u = arrayList;
        this.v = i;
        this.w = i2;
        this.x = i3;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new o07(this.t, mt5Var, this.u, this.v, this.w, this.x);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        ybh.y(obj);
        return this.t.n().c(this.u, this.v, this.w, this.x);
    }
}
