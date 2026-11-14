package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class du9 extends nt5 {
    public zum t;
    public /* synthetic */ Object u;
    public final /* synthetic */ j06 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du9(j06 j06Var, nt5 nt5Var) {
        super(nt5Var);
        this.v = j06Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.r(null, this);
    }
}
