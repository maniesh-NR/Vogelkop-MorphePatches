package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class rn0 extends nt5 {
    public xn0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xn0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn0(xn0 xn0Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = xn0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.b(this);
    }
}
