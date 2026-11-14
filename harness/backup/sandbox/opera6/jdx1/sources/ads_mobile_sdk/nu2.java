package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class nu2 extends nt5 {
    public su2 a;
    public String b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ su2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu2(su2 su2Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = su2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return su2.b(this.e, null, null, this);
    }
}
