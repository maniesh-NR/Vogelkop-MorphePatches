package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class z31 extends nt5 {
    public kde t;
    public k04 u;
    public /* synthetic */ Object v;
    public final /* synthetic */ b41 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z31(b41 b41Var, nt5 nt5Var) {
        super(nt5Var);
        this.w = b41Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= LinearLayoutManager.INVALID_OFFSET;
        return this.w.l(this);
    }
}
