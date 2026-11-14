package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class td6 extends nt5 {
    public int A;
    public Object t;
    public Object u;
    public Object v;
    public pqh w;
    public ie6 x;
    public /* synthetic */ Object y;
    public final /* synthetic */ ud6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(ud6 ud6Var, nt5 nt5Var) {
        super(nt5Var);
        this.z = ud6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= LinearLayoutManager.INVALID_OFFSET;
        return this.z.a(null, this);
    }
}
