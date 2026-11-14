package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class k79 extends nt5 {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ n79 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k79(n79 n79Var, nt5 nt5Var) {
        super(nt5Var);
        this.v = n79Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.c(this);
    }
}
