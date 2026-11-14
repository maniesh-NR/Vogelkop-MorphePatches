package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class l38 extends nt5 {
    public final /* synthetic */ n38 A;
    public int B;
    public ke5 t;
    public bza u;
    public Object v;
    public vrf w;
    public y55 x;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l38(n38 n38Var, nt5 nt5Var) {
        super(nt5Var);
        this.A = n38Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= LinearLayoutManager.INVALID_OFFSET;
        return this.A.c(null, null, null, null, null, this);
    }
}
