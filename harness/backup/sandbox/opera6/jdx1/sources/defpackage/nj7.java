package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class nj7 extends nt5 {
    public aj7 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ oj7 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj7(oj7 oj7Var, nt5 nt5Var) {
        super(nt5Var);
        this.v = oj7Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.g1(null, this);
    }
}
