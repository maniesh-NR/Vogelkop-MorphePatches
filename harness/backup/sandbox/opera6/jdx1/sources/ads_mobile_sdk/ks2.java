package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ks2 extends nt5 {
    public vs2 a;
    public s23 b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ vs2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks2(vs2 vs2Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = vs2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a((s23) null, this);
    }
}
