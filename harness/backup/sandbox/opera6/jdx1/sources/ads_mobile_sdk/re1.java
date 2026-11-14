package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class re1 extends nt5 {
    public ue1 a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ue1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re1(ue1 ue1Var, mt5 mt5Var) {
        super(mt5Var);
        this.d = ue1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.d(this);
    }
}
