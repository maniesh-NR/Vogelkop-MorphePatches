package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class f71 extends nt5 {
    public j71 a;
    public n13 b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ j71 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f71(j71 j71Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = j71Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return j71.a(this.e, (n13) null, this);
    }
}
