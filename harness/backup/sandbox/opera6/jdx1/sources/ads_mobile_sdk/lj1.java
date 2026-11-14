package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class lj1 extends nt5 {
    public Object a;
    public ue1 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bk1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj1(bk1 bk1Var, mt5 mt5Var) {
        super(mt5Var);
        this.d = bk1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a((ue1) null, (mt5) this);
    }
}
