package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class pv2 extends nt5 {
    public hv0 a;
    public rg3 b;
    public rg3 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ tv2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv2(tv2 tv2Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = tv2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a((hv0) null, (z2) null, this);
    }
}
