package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class n22 implements j6l {
    public final /* synthetic */ x22 a;

    public n22(x22 x22Var) {
        this.a = x22Var;
    }

    @Override // defpackage.j6l
    public final void H(b2l b2lVar, b2l b2lVar2, int i) {
        v22 v22VarG;
        x22 x22Var = this.a;
        if (b2lVar != null && (v22VarG = x22Var.g(b2lVar)) != null) {
            v22VarG.b = false;
            v22VarG.b();
        }
        v22 v22VarG2 = x22Var.g(b2lVar2);
        if (v22VarG2 != null) {
            v22VarG2.b = true;
            v22VarG2.b();
            return;
        }
        d7l d7lVar = (d7l) b2lVar2;
        if (x22Var.j(d7lVar.i0())) {
            v22 v22VarE = x22Var.e(d7lVar);
            v22VarE.a();
            v22VarE.c = true;
            v22VarE.b();
        }
    }

    @Override // defpackage.j6l
    public final void L(b2l b2lVar, boolean z) {
        SparseArray sparseArray = this.a.t;
        v22 v22Var = (v22) sparseArray.get(((d7l) b2lVar).j.getId());
        if (v22Var != null) {
            sparseArray.remove(((d7l) b2lVar).j.getId());
        } else {
            v22Var = null;
        }
        if (v22Var != null) {
            v22Var.e.g(qcc.a);
        }
    }
}
