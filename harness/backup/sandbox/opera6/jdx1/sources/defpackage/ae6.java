package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ae6 extends nt5 {
    public pfe t;
    public /* synthetic */ Object u;
    public final /* synthetic */ ie6 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae6(ie6 ie6Var, nt5 nt5Var) {
        super(nt5Var);
        this.v = ie6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.e(this);
    }
}
