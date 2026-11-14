package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class k38 extends nt5 {
    public /* synthetic */ Object A;
    public final /* synthetic */ n38 B;
    public int C;
    public bza t;
    public Object u;
    public y55 v;
    public pqh w;
    public pqh x;
    public pqh y;
    public pqh z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k38(n38 n38Var, nt5 nt5Var) {
        super(nt5Var);
        this.B = n38Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= LinearLayoutManager.INVALID_OFFSET;
        return this.B.b(null, null, null, null, this);
    }
}
