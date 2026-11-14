package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class q72 extends nt5 {
    public Object a;
    public Object b;
    public cr9 c;
    public pfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ b82 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q72(b82 b82Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = b82Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.a((String) null, (cr9) null, this);
    }
}
