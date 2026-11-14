package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class v22 extends nt5 {
    public x22 a;
    public Object b;
    public Object c;
    public rg3 d;
    public rg3 e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ x22 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v22(x22 x22Var, nt5 nt5Var) {
        super(nt5Var);
        this.h = x22Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= LinearLayoutManager.INVALID_OFFSET;
        return this.h.a(null, null, this);
    }
}
