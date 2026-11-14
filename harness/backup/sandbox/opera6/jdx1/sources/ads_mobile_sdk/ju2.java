package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ju2 extends nt5 {
    public lu2 a;
    public String b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ lu2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju2(lu2 lu2Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = lu2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return lu2.b(this.e, null, this);
    }
}
