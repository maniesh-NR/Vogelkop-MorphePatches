package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class l91 extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ n91 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l91(n91 n91Var, nt5 nt5Var) {
        super(nt5Var);
        this.u = n91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= LinearLayoutManager.INVALID_OFFSET;
        this.u.a(null, this);
        return px5.a;
    }
}
