package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class m38 extends nt5 {
    public bl9 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ n38 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m38(n38 n38Var, nt5 nt5Var) {
        super(nt5Var);
        this.v = n38Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.d(null, this);
    }
}
