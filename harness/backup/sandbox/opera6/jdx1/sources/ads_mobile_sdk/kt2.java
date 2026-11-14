package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class kt2 extends nt5 {
    public mt2 a;
    public a2 b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ mt2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt2(mt2 mt2Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = mt2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a((a2) null, this);
    }
}
