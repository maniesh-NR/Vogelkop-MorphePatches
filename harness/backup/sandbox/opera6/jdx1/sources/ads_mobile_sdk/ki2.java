package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ki2 extends nt5 {
    public Object a;
    public Object b;
    public Object c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ xj2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki2(xj2 xj2Var, nt5 nt5Var) {
        super(nt5Var);
        this.g = xj2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= LinearLayoutManager.INVALID_OFFSET;
        return xj2.a(this.g, this);
    }
}
