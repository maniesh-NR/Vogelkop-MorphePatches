package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class mv6 extends nt5 {
    public yxc t;
    public /* synthetic */ Object u;
    public final /* synthetic */ nv6 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv6(nv6 nv6Var, nt5 nt5Var) {
        super(nt5Var);
        this.v = nv6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.B(null, this);
    }
}
