package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class s51 extends nt5 {
    public long t;
    public /* synthetic */ Object u;
    public final /* synthetic */ v51 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s51(v51 v51Var, nt5 nt5Var) {
        super(nt5Var);
        this.v = v51Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.b(0L, null, this);
    }
}
