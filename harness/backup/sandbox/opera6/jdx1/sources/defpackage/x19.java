package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class x19 extends nt5 {
    public boolean t;
    public v19 u;
    public /* synthetic */ Object v;
    public final /* synthetic */ z19 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x19(z19 z19Var, nt5 nt5Var) {
        super(nt5Var);
        this.w = z19Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= LinearLayoutManager.INVALID_OFFSET;
        return this.w.b(null, this);
    }
}
