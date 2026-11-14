package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class vz9 extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ k5o u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz9(k5o k5oVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = k5oVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= LinearLayoutManager.INVALID_OFFSET;
        Object objF = this.u.f(this);
        return objF == px5.a ? objF : new t0i(objF);
    }
}
