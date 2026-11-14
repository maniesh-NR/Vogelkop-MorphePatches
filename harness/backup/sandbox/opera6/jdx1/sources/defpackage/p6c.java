package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class p6c extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ u6c u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6c(u6c u6cVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = u6cVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= LinearLayoutManager.INVALID_OFFSET;
        return this.u.f(0, this);
    }
}
