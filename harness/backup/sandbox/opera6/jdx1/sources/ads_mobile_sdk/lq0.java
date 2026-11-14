package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class lq0 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ xq0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq0(xq0 xq0Var, nt5 nt5Var) {
        super(nt5Var);
        this.b = xq0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return this.b.a(this);
    }
}
