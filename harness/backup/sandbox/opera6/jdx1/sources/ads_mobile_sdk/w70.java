package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class w70 extends nt5 {
    public a80 a;
    public t70 b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ a80 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w70(a80 a80Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = a80Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a(this);
    }
}
