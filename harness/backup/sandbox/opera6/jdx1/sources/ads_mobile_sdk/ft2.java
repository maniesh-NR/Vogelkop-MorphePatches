package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ft2 extends nt5 {
    public mt2 a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mt2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft2(mt2 mt2Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = mt2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return mt2.a(this.d, this);
    }
}
