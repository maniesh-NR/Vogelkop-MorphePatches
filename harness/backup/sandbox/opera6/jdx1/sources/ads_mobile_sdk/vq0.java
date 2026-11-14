package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class vq0 extends nt5 {
    public xq0 a;
    public jq0 b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ xq0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq0(xq0 xq0Var, mt5 mt5Var) {
        super(mt5Var);
        this.e = xq0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return xq0.a(this.e, null, null, false, this);
    }
}
