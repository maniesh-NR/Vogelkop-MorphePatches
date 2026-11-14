package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ysh extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ nga u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysh(nga ngaVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = ngaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= LinearLayoutManager.INVALID_OFFSET;
        return this.u.b(0.0f, this);
    }
}
