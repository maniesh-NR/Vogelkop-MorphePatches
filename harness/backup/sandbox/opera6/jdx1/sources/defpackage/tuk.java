package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class tuk extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ uuk u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tuk(uuk uukVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = uukVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= LinearLayoutManager.INVALID_OFFSET;
        return this.u.l(0L, null, this);
    }
}
