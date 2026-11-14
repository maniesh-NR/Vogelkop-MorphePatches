package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class x9 extends nt5 {
    public z9 a;
    public nn3 b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ z9 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(z9 z9Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = z9Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return z9.a(this.e, null, this);
    }
}
