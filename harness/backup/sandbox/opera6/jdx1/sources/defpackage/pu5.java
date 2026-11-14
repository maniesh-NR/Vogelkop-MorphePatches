package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class pu5 extends nt5 {
    public int A;
    public y10 t;
    public Long u;
    public pqh v;
    public s0i w;
    public byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ qu5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu5(qu5 qu5Var, nt5 nt5Var) {
        super(nt5Var);
        this.z = qu5Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= LinearLayoutManager.INVALID_OFFSET;
        return this.z.a(null, null, null, null, null, null, 0, null, null, this);
    }
}
