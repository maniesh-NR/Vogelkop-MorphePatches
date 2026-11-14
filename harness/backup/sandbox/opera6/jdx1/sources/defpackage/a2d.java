package defpackage;

import kotlin.Unit;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class a2d extends kuk implements Function1 {
    public final /* synthetic */ float A;
    public boolean t;
    public final /* synthetic */ e2d u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ float y;
    public final /* synthetic */ p2d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2d(e2d e2dVar, int i, int i2, boolean z, float f, p2d p2dVar, float f2, mt5 mt5Var) {
        super(1, mt5Var);
        o2d[] o2dVarArr = o2d.a;
        this.u = e2dVar;
        this.v = i;
        this.w = i2;
        this.x = z;
        this.y = f;
        this.z = p2dVar;
        this.A = f2;
    }

    public final mt5 create(mt5 mt5Var) {
        o2d[] o2dVarArr = o2d.a;
        return new a2d(this.u, this.v, this.w, this.x, this.y, this.z, this.A, mt5Var);
    }

    public final Object invoke(Object obj) {
        return create((mt5) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Finally extract failed */
    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        boolean z = this.t;
        e2d e2dVar = this.u;
        try {
            if (!z) {
                ybh.y(obj);
                e2dVar.d(this.v);
                t0g t0gVar = e2dVar.c;
                int i = this.w;
                t0gVar.setValue(Integer.valueOf(i));
                e2dVar.d.setValue(Boolean.valueOf(this.x));
                t0g t0gVar2 = e2dVar.f;
                float f = this.y;
                t0gVar2.setValue(Float.valueOf(f));
                e2dVar.e.setValue(null);
                t0g t0gVar3 = e2dVar.i;
                p2d p2dVar = this.z;
                t0gVar3.setValue(p2dVar);
                e2dVar.g(this.A);
                e2dVar.g.setValue(Boolean.FALSE);
                e2dVar.l.setValue(Long.MIN_VALUE);
                if (p2dVar == null) {
                    e2dVar.f(false);
                    return Unit.a;
                }
                if (Float.isInfinite(f)) {
                    e2dVar.g(((Number) e2dVar.m.getValue()).floatValue());
                    e2dVar.f(false);
                    e2dVar.d(i);
                    return Unit.a;
                }
                e2dVar.f(true);
                o2d[] o2dVarArr = o2d.a;
                h hVar = h.a;
                z1d z1dVar = new z1d(o0g.U(getContext()), this.w, this.v, this.u, null);
                this.t = true;
                if (na2.Z(hVar, z1dVar, this) == px5Var) {
                    return px5Var;
                }
            } else {
                if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
            }
            o0g.H(getContext());
            e2dVar.f(false);
            return Unit.a;
        } catch (Throwable th) {
            e2dVar.f(false);
            throw th;
        }
    }
}
