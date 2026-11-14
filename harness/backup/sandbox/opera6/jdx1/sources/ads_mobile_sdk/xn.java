package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class xn extends nt5 {
    public eo a;
    public Object b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ eo e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn(eo eoVar, mt5 mt5Var) {
        super(mt5Var);
        this.e = eoVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a((t70) null, (mt5) this);
    }
}
