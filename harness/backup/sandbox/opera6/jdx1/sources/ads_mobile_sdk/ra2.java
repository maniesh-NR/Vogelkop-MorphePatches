package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ra2 extends nt5 {
    public xa2 a;
    public Object b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ xa2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra2(xa2 xa2Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = xa2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.b(this);
    }
}
