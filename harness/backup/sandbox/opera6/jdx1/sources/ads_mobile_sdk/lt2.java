package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class lt2 extends nt5 {
    public mt2 a;
    public a2 b;
    public pfe c;
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ mt2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt2(mt2 mt2Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = mt2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.a(0L, (a2) null, this);
    }
}
