package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class fma extends nt5 {
    public cma t;
    public /* synthetic */ Object u;
    public final /* synthetic */ ima v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fma(ima imaVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = imaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.T0(this);
    }
}
