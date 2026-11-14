package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class jf0 extends nt5 {
    public cg0 a;
    public ax0 b;
    public cg0 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ cg0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf0(cg0 cg0Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = cg0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.c(this);
    }
}
