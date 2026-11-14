package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class gv1 extends nt5 {
    public iv1 a;
    public zu1 b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ iv1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv1(iv1 iv1Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = iv1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a(this, null, false);
    }
}
