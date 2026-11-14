package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m22 implements as6 {
    public final /* synthetic */ x22 a;

    public m22(x22 x22Var) {
        this.a = x22Var;
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        x22 x22Var = this.a;
        k6l k6lVar = x22Var.b;
        k6lVar.w.a(x22Var.q);
        k6lVar.F(x22Var.r);
        x22Var.d.F(x22Var.s);
        b2l b2lVar = k6lVar.o;
        if (b2lVar != null) {
            v22 v22VarG = x22Var.g(b2lVar);
            if (v22VarG != null) {
                v22VarG.b = true;
                v22VarG.b();
            } else {
                d7l d7lVar = (d7l) b2lVar;
                if (x22Var.j(d7lVar.i0())) {
                    v22 v22VarE = x22Var.e(d7lVar);
                    v22VarE.a();
                    v22VarE.c = true;
                    v22VarE.b();
                }
            }
        }
        x22Var.i.a = x22Var;
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        x22 x22Var = this.a;
        k6l k6lVar = x22Var.b;
        y22 y22Var = x22Var.i;
        if (Intrinsics.a(y22Var.a, x22Var)) {
            y22Var.a = null;
        }
        x22Var.d.H(x22Var.s);
        k6lVar.w.b(x22Var.q);
        k6lVar.H(x22Var.r);
        ndcVar.getLifecycle().b(this);
        x22Var.t.clear();
    }

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        v22 v22VarG;
        x22 x22Var = this.a;
        b2l b2lVar = x22Var.b.o;
        if (b2lVar == null || (v22VarG = x22Var.g(b2lVar)) == null) {
            return;
        }
        v22VarG.b();
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        v22 v22VarG;
        x22 x22Var = this.a;
        b2l b2lVar = x22Var.b.o;
        if (b2lVar == null || (v22VarG = x22Var.g(b2lVar)) == null) {
            return;
        }
        v22VarG.b();
    }
}
