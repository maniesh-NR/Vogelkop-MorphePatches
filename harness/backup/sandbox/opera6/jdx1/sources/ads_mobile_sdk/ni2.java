package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ni2 extends nt5 {
    public xj2 a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ xj2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni2(xj2 xj2Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = xj2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return xj2.b(this.d, this);
    }
}
