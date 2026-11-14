package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class nq0 extends nt5 {
    public xq0 a;
    public Object b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ xq0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq0(xq0 xq0Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = xq0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return xq0.b(this.e, this);
    }
}
