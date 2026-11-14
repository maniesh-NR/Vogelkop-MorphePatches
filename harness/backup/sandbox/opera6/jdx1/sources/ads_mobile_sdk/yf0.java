package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class yf0 extends nt5 {
    public cg0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ cg0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf0(cg0 cg0Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = cg0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.a(false, null, null, false, this);
    }
}
