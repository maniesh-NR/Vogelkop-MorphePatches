package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ga extends nt5 {
    public ja a;
    public nn3 b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ja e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(ja jaVar, nt5 nt5Var) {
        super(nt5Var);
        this.e = jaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a(null, this);
    }
}
