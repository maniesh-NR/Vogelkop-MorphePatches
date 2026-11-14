package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class pb extends nt5 {
    public sb a;
    public jl6 b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ sb e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(sb sbVar, nt5 nt5Var) {
        super(nt5Var);
        this.e = sbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return sb.a(this.e, (jl6) null, this);
    }
}
