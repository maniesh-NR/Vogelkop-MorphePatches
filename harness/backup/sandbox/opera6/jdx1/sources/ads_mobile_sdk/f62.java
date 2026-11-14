package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class f62 extends nt5 {
    public Object a;
    public sy0 b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ r62 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f62(r62 r62Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = r62Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a((sy0) null, this);
    }
}
