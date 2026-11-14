package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class fpi extends nt5 {
    public long t;
    public /* synthetic */ Object u;
    public final /* synthetic */ gpi v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpi(gpi gpiVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = gpiVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.B0(0L, 0L, this);
    }
}
