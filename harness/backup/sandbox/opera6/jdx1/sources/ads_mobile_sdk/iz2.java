package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class iz2 extends nt5 {
    public jz2 a;
    public String b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ jz2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz2(jz2 jz2Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = jz2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return jz2.a(this.e, null, this);
    }
}
