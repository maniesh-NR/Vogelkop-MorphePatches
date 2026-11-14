package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class dqc extends lim {
    public final fs6 a;
    public final j4c b;
    public final j4c c;
    public final js6 d;
    public final jze e;
    public final rlh f;
    public final rlh g;
    public final cw h;
    public boolean i;

    public dqc(fs6 fs6Var, j4c j4cVar, j4c j4cVar2, js6 js6Var, ndc ndcVar, kze kzeVar, w6o w6oVar, j4c j4cVar3) {
        this.a = fs6Var;
        this.b = j4cVar;
        this.c = j4cVar2;
        this.d = js6Var;
        jze jzeVar = fs6Var.d;
        this.e = jzeVar;
        this.f = a26.o0(ma9.b(xf8.t(jzeVar), new zp6((byte) 10, null, this)), cqp.V(ndcVar.getLifecycle()), new f9k(5000L), eqc.a);
        this.g = ((cs6) j4cVar3.get()).b;
        aqc aqcVar = new aqc((cq6) j4cVar.get());
        this.h = new cw(new f99[]{xf8.t(fs6Var.f), xf8.t((kze) ((vs6) j4cVar2.get()).e.d.b), xf8.t(kzeVar), (f99) aqcVar.f.getValue(), w6oVar.k}, new bqc(this, null), (byte) 9);
        ndcVar.getLifecycle().a(this);
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        ddc ddcVarV = cqp.V(ndcVar.getLifecycle());
        mt5 mt5Var = null;
        na2.B(ddcVarV, (CoroutineContext) null, (rx5) null, new cqc(this, mt5Var, (byte) 0), 3);
        na2.B(ddcVarV, (CoroutineContext) null, (rx5) null, new cqc(this, mt5Var, (byte) 1), 3);
    }

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        if (this.i) {
            this.d.c(1);
        }
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        if (this.i) {
            this.d.c(0);
        }
    }
}
