package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class hs1 extends nt5 {
    public js1 a;
    public nn3 b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ js1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs1(js1 js1Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = js1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return js1.a(this.e, null, this);
    }
}
