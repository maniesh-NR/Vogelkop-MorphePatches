package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class mx0 extends nt5 {
    public cy0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ cy0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx0(cy0 cy0Var, mt5 mt5Var) {
        super(mt5Var);
        this.c = cy0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.a((mt5) this);
    }
}
