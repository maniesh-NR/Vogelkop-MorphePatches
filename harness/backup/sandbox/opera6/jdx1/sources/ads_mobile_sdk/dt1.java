package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class dt1 extends nt5 {
    public ft1 a;
    public Object b;
    public Object c;
    public pfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ft1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt1(ft1 ft1Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = ft1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.a(null, null, this);
    }
}
