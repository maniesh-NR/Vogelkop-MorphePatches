package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class a72 extends nt5 {
    public Object a;
    public sy0 b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ f72 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a72(f72 f72Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = f72Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return f72.a(this.e, (sy0) null, this);
    }
}
