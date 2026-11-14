package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class u72 extends nt5 {
    public b82 a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ b82 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u72(b82 b82Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = b82Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return b82.c(this.d, this);
    }
}
