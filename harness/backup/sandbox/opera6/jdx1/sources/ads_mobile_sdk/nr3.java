package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class nr3 extends nt5 {
    public qr3 a;
    public nn3 b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ qr3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr3(qr3 qr3Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = qr3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.b(null, this);
    }
}
