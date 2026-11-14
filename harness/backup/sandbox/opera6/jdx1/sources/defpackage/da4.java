package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class da4 extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ fa4 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da4(fa4 fa4Var, nt5 nt5Var) {
        super(nt5Var);
        this.u = fa4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= LinearLayoutManager.INVALID_OFFSET;
        return this.u.a(this);
    }
}
