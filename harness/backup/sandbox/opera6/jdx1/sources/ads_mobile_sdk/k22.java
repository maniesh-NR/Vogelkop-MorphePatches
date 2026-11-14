package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class k22 extends nt5 {
    public p22 a;
    public Object b;
    public Object c;
    public pfe d;
    public long e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ p22 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k22(p22 p22Var, nt5 nt5Var) {
        super(nt5Var);
        this.h = p22Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= LinearLayoutManager.INVALID_OFFSET;
        return this.h.a(0L, null, null, false, this);
    }
}
