package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d2d extends kuk implements Function1 {
    public final /* synthetic */ e2d t;
    public final /* synthetic */ p2d u;
    public final /* synthetic */ float v;
    public final /* synthetic */ int w;
    public final /* synthetic */ boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2d(e2d e2dVar, p2d p2dVar, float f, int i, boolean z, mt5 mt5Var) {
        super(1, mt5Var);
        this.t = e2dVar;
        this.u = p2dVar;
        this.v = f;
        this.w = i;
        this.x = z;
    }

    public final mt5 create(mt5 mt5Var) {
        return new d2d(this.t, this.u, this.v, this.w, this.x, mt5Var);
    }

    public final Object invoke(Object obj) {
        return create((mt5) obj).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        ybh.y(obj);
        p2d p2dVar = this.u;
        e2d e2dVar = this.t;
        e2dVar.i.setValue(p2dVar);
        e2dVar.g(this.v);
        e2dVar.d(this.w);
        e2dVar.f(false);
        if (this.x) {
            e2dVar.l.setValue(Long.MIN_VALUE);
        }
        return Unit.a;
    }
}
