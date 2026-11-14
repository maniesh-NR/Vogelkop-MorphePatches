package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class m79 extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ n79 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m79(n79 n79Var, nt5 nt5Var) {
        super(nt5Var);
        this.u = n79Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= LinearLayoutManager.INVALID_OFFSET;
        return this.u.f(this);
    }
}
