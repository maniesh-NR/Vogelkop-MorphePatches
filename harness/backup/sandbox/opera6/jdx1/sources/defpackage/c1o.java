package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class c1o extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ m91 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1o(m91 m91Var, mt5 mt5Var) {
        super(mt5Var);
        this.u = m91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= LinearLayoutManager.INVALID_OFFSET;
        return this.u.a(this);
    }
}
