package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class m03 extends nt5 {
    public o03 a;
    public i03 b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ o03 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m03(o03 o03Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = o03Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return o03.a(this.e, null, this);
    }
}
