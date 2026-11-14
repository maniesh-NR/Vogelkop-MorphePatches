package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ck4 extends nt5 {
    public pqh t;
    public pqh u;
    public /* synthetic */ Object v;
    public final /* synthetic */ dk4 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck4(dk4 dk4Var, nt5 nt5Var) {
        super(nt5Var);
        this.w = dk4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= LinearLayoutManager.INVALID_OFFSET;
        return this.w.l(this);
    }
}
