package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class po9 extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ pad u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po9(pad padVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = padVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= LinearLayoutManager.INVALID_OFFSET;
        Object objF = this.u.f(this);
        return objF == px5.a ? objF : new t0i(objF);
    }
}
