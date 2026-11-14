package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class aj3 extends nt5 {
    public bj3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bj3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj3(bj3 bj3Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = bj3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.k(this);
    }
}
