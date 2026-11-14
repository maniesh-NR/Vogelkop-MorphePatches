package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class mza extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ z8b u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mza(z8b z8bVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = z8bVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= LinearLayoutManager.INVALID_OFFSET;
        return this.u.J(null, this);
    }
}
