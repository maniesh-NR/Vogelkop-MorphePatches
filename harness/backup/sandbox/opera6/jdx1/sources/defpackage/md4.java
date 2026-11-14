package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class md4 extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ nd4 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md4(nd4 nd4Var, mt5 mt5Var) {
        super(mt5Var);
        this.u = nd4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= LinearLayoutManager.INVALID_OFFSET;
        return this.u.k(this);
    }
}
