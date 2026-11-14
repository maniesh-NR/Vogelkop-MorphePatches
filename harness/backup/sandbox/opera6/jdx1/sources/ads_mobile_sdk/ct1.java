package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ct1 extends nt5 {
    public ft1 a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ft1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct1(ft1 ft1Var, mt5 mt5Var) {
        super(mt5Var);
        this.d = ft1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a(this);
    }
}
