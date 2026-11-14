package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class zi3 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bj3 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi3(bj3 bj3Var, nt5 nt5Var) {
        super(nt5Var);
        this.b = bj3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return this.b.d(this);
    }
}
