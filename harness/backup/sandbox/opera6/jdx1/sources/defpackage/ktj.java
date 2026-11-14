package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ktj extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ mtj u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ktj(mtj mtjVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = mtjVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= LinearLayoutManager.INVALID_OFFSET;
        return this.u.c(null, 0.0f, null, this);
    }
}
