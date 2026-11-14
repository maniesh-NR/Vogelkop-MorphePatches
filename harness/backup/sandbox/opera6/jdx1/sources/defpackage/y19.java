package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class y19 extends nt5 {
    public Object t;
    public Object u;
    public v29 v;
    public /* synthetic */ Object w;
    public final /* synthetic */ z19 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y19(z19 z19Var, nt5 nt5Var) {
        super(nt5Var);
        this.x = z19Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= LinearLayoutManager.INVALID_OFFSET;
        return this.x.c(null, this);
    }
}
