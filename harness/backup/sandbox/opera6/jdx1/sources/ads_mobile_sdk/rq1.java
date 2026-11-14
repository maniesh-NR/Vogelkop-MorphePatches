package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class rq1 extends nt5 {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ sq1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq1(sq1 sq1Var, mt5 mt5Var) {
        super(mt5Var);
        this.c = sq1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.a(null, null, this);
    }
}
