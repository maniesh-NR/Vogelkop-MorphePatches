package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class et1 extends nt5 {
    public ft1 a;
    public Object b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ft1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et1(ft1 ft1Var, mt5 mt5Var) {
        super(mt5Var);
        this.e = ft1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a(this, null);
    }
}
