package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class oq0 extends nt5 {
    public xq0 a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ xq0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq0(xq0 xq0Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = xq0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return xq0.c(this.d, this);
    }
}
