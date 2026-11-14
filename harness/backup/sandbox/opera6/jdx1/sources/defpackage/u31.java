package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class u31 extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ v31 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u31(v31 v31Var, nt5 nt5Var) {
        super(nt5Var);
        this.u = v31Var;
    }

    public final Object invokeSuspend(Object obj) throws pxb {
        this.t = obj;
        this.v |= LinearLayoutManager.INVALID_OFFSET;
        this.u.R(null, this);
        return px5.a;
    }
}
