package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class uh2 extends nt5 {
    public xj2 a;
    public Object b;
    public pfe c;
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ xj2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh2(xj2 xj2Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = xj2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return xj2.a(this.f, 0L, this);
    }
}
