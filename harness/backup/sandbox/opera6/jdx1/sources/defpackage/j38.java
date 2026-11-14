package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class j38 extends nt5 {
    public /* synthetic */ Object A;
    public final /* synthetic */ n38 B;
    public int C;
    public hwj t;
    public ke5 u;
    public bza v;
    public Object w;
    public vrf x;
    public y55 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j38(n38 n38Var, nt5 nt5Var) {
        super(nt5Var);
        this.B = n38Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= LinearLayoutManager.INVALID_OFFSET;
        return this.B.a(null, null, null, null, null, null, this);
    }
}
