package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class mj7 extends nt5 {
    public zi7 t;
    public qj7 u;
    public /* synthetic */ Object v;
    public final /* synthetic */ oj7 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj7(oj7 oj7Var, nt5 nt5Var) {
        super(nt5Var);
        this.w = oj7Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= LinearLayoutManager.INVALID_OFFSET;
        return this.w.f1(null, this);
    }
}
