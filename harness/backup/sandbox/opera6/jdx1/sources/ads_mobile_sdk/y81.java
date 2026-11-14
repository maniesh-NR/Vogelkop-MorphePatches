package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.prb;

/* loaded from: classes.dex */
public final class y81 extends nt5 {
    public d91 a;
    public Object b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ d91 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y81(d91 d91Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = d91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return d91.a(this.e, (prb) null, this);
    }
}
