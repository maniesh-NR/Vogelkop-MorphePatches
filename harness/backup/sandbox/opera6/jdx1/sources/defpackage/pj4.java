package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class pj4 extends nt5 {
    public int t;
    public AutoCloseable u;
    public /* synthetic */ Object v;
    public final /* synthetic */ rj4 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj4(rj4 rj4Var, nt5 nt5Var) {
        super(nt5Var);
        this.w = rj4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= LinearLayoutManager.INVALID_OFFSET;
        return this.w.q(0L, this);
    }
}
