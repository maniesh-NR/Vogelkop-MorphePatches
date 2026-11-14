package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class xq1 extends nt5 {
    public zq1 a;
    public cy0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ zq1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq1(zq1 zq1Var, mt5 mt5Var) {
        super(mt5Var);
        this.d = zq1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a(null, null, this);
    }
}
