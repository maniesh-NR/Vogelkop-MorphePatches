package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class bme extends nt5 {
    public pqh t;
    public pqh u;
    public /* synthetic */ Object v;
    public final /* synthetic */ fme w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bme(fme fmeVar, mt5 mt5Var) {
        super(mt5Var);
        this.w = fmeVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= LinearLayoutManager.INVALID_OFFSET;
        return this.w.b(this);
    }
}
