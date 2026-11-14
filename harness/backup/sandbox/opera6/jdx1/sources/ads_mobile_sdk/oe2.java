package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class oe2 extends nt5 {
    public se2 a;
    public yu0 b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ se2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe2(se2 se2Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = se2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        se2.a(this.e, this);
        return px5.a;
    }
}
