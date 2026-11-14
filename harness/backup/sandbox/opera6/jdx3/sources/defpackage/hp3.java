package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class hp3 extends kuk implements cr9 {
    public final /* synthetic */ dw A;
    public final /* synthetic */ c37 B;
    public final /* synthetic */ c37 C;
    public final /* synthetic */ c37 D;
    public final /* synthetic */ b49 E;
    public final /* synthetic */ dw F;
    public final /* synthetic */ xm5 G;
    public final /* synthetic */ qo3 H;
    public final /* synthetic */ nv6 I;
    public final /* synthetic */ qo3 J;
    public final /* synthetic */ qo3 K;
    public boolean t;
    public /* synthetic */ l99 u;
    public /* synthetic */ Object[] v;
    public final /* synthetic */ jp3 w;
    public final /* synthetic */ wth x;
    public final /* synthetic */ b49 y;
    public final /* synthetic */ eq6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp3(mt5 mt5Var, jp3 jp3Var, wth wthVar, b49 b49Var, eq6 eq6Var, dw dwVar, c37 c37Var, c37 c37Var2, c37 c37Var3, b49 b49Var2, dw dwVar2, xm5 xm5Var, qo3 qo3Var, nv6 nv6Var, qo3 qo3Var2, qo3 qo3Var3) {
        super(3, mt5Var);
        this.w = jp3Var;
        this.x = wthVar;
        this.y = b49Var;
        this.z = eq6Var;
        this.A = dwVar;
        this.B = c37Var;
        this.C = c37Var2;
        this.D = c37Var3;
        this.E = b49Var2;
        this.F = dwVar2;
        this.G = xm5Var;
        this.H = qo3Var;
        this.I = nv6Var;
        this.J = qo3Var2;
        this.K = qo3Var3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        hp3 hp3Var = new hp3((mt5) obj3, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K);
        hp3Var.u = (l99) obj;
        hp3Var.v = (Object[]) obj2;
        return hp3Var.invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        rlh rlhVar = (rlh) this.z.a;
        rlh rlhVar2 = this.y.b;
        l99 l99Var = this.u;
        px5 px5Var = px5.a;
        boolean z = this.t;
        if (!z) {
            ybh.y(obj);
            kp3 kp3VarL = fsp.l(((r22) this.w.b).d(new rsg(((q8l) ((rlh) this.x.b).a.getValue()).a, ((Boolean) rlhVar2.a.getValue()).booleanValue(), ((Boolean) rlhVar.a.getValue()).booleanValue())), ((Boolean) rlhVar.a.getValue()).booleanValue(), ((Boolean) this.A.b.a.getValue()).booleanValue(), ((Boolean) ((nak) this.B.b).getValue()).booleanValue(), ((Boolean) ((nak) this.C.b).getValue()).booleanValue(), ((Boolean) ((nak) this.D.b).getValue()).booleanValue(), ((Boolean) this.E.b.a.getValue()).booleanValue(), ((Boolean) this.F.b.a.getValue()).booleanValue(), ((Boolean) rlhVar2.a.getValue()).booleanValue(), ((Boolean) ((rlh) this.G.a).a.getValue()).booleanValue(), ((Boolean) this.H.m().getValue()).booleanValue(), ((Boolean) ((rlh) this.I.a).a.getValue()).booleanValue(), ((Boolean) this.J.m().getValue()).booleanValue(), ((Boolean) this.K.m().getValue()).booleanValue());
            this.u = null;
            this.v = null;
            this.t = true;
            if (l99Var.emit(kp3VarL, this) == px5Var) {
                return px5Var;
            }
        } else {
            if (!z) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ybh.y(obj);
        }
        return Unit.a;
    }
}
