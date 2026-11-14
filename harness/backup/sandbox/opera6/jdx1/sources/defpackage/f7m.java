package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class f7m extends nt5 {
    public qb7 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ g7m v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7m(g7m g7mVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = g7mVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.n(this);
    }
}
