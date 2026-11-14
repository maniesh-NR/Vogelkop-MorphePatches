package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class qj4 extends nt5 {
    public u0i t;
    public /* synthetic */ Object u;
    public final /* synthetic */ rj4 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj4(rj4 rj4Var, nt5 nt5Var) {
        super(nt5Var);
        this.v = rj4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.r(0L, null, this);
    }
}
