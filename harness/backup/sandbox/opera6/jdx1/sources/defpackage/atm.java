package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class atm extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ btm u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atm(btm btmVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = btmVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= LinearLayoutManager.INVALID_OFFSET;
        return this.u.b(null, 0L, this);
    }
}
