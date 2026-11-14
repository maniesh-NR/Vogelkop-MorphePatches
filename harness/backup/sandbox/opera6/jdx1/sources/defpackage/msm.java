package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class msm extends nt5 {
    public pqh t;
    public /* synthetic */ Object u;
    public final /* synthetic */ nsm v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msm(nsm nsmVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = nsmVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.c(null, null, null, null, null, this);
    }
}
