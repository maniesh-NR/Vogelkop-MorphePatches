package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class v23 extends nt5 {
    public a33 a;
    public Object b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ a33 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v23(a33 a33Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = a33Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return a33.a(this.e, this);
    }
}
