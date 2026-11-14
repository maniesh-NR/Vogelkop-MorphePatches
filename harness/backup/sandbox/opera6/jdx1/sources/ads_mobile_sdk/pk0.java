package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class pk0 extends nt5 {
    public Object a;
    public ue1 b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ al0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk0(al0 al0Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = al0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.c(null, this);
    }
}
