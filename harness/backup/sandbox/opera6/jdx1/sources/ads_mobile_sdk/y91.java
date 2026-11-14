package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class y91 extends nt5 {
    public z91 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ z91 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y91(z91 z91Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = z91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.g(this);
    }
}
