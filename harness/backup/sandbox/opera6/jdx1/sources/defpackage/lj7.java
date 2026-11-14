package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class lj7 extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ oj7 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj7(oj7 oj7Var, nt5 nt5Var) {
        super(nt5Var);
        this.u = oj7Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= LinearLayoutManager.INVALID_OFFSET;
        return this.u.e1(this);
    }
}
