package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class i1 extends nt5 {
    public rg3 a;
    public rg3 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ k1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(k1 k1Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = k1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a(null, this);
    }
}
