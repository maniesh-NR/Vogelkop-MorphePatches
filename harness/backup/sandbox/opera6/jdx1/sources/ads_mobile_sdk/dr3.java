package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class dr3 extends nt5 {
    public fr3 a;
    public nn3 b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ fr3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr3(fr3 fr3Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = fr3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return fr3.a(this.e, null, this);
    }
}
