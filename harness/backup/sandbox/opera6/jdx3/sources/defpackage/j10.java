package defpackage;

import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class j10 implements jhb {
    public final yl a;

    public j10(yl ylVar) {
        this.a = ylVar;
    }

    @Override // defpackage.jhb
    public final boolean a(BrowserActivity browserActivity, yz yzVar) {
        h10 h10Var = yzVar instanceof h10 ? (h10) yzVar : null;
        if (h10Var == null) {
            return false;
        }
        chb chbVar = h10Var.u;
        qb7 qb7Var = new qb7(h10Var, this, yzVar);
        chbVar.p = qb7Var;
        ioo iooVar = chbVar.o;
        if (iooVar != null) {
            iooVar.p(qb7Var);
        }
        ioo iooVar2 = chbVar.o;
        if (iooVar2 == null || !iooVar2.a()) {
            return false;
        }
        ioo iooVar3 = chbVar.o;
        if (iooVar3 == null || iooVar3.b() != null) {
            return true;
        }
        chbVar.o.v(browserActivity);
        return true;
    }
}
