package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class wqc extends q59 {
    public final /* synthetic */ akc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqc(akc akcVar, hx5 hx5Var, ve9 ve9Var) {
        super((ekc) hx5Var, (Callback) ve9Var);
        this.e = akcVar;
    }

    @Override // defpackage.q59
    public final boolean a(Object obj) {
        akc akcVar = (akc) obj;
        return (akcVar == null || akcVar.equals(this.e)) ? false : true;
    }
}
