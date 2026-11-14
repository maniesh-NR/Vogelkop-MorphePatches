package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class czl extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ dzl u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czl(dzl dzlVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = dzlVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= LinearLayoutManager.INVALID_OFFSET;
        return this.u.f(null, null, this);
    }
}
