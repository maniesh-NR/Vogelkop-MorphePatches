package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.xzh;

/* loaded from: classes.dex */
public final class e71 extends nt5 {
    public j71 a;
    public xzh b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ j71 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e71(j71 j71Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = j71Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return j71.a(this.e, (xzh) null, this);
    }
}
