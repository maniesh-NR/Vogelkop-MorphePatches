package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class fj4 extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ rj4 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj4(rj4 rj4Var, nt5 nt5Var) {
        super(nt5Var);
        this.u = rj4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= LinearLayoutManager.INVALID_OFFSET;
        return this.u.k(0, this);
    }
}
