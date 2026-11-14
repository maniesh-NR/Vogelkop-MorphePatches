package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class n41 extends nt5 {
    public k04 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ o41 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n41(o41 o41Var, nt5 nt5Var) {
        super(nt5Var);
        this.v = o41Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.a(this);
    }
}
