package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class mb2 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ nb2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb2(nb2 nb2Var, nt5 nt5Var) {
        super(nt5Var);
        this.b = nb2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return this.b.d(this);
    }
}
