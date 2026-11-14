package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class zlh extends nt5 {
    public n38 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ bl9 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlh(bl9 bl9Var, nt5 nt5Var) {
        super(nt5Var);
        this.v = bl9Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.c(this);
    }
}
