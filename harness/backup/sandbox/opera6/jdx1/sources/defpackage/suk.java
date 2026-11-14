package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class suk extends nt5 {
    public d3k t;
    public /* synthetic */ Object u;
    public final /* synthetic */ uuk v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public suk(uuk uukVar, z53 z53Var) {
        super(z53Var);
        this.v = uukVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.h(0L, null, this);
    }
}
