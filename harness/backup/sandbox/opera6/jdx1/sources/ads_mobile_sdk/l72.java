package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class l72 extends nt5 {
    public b82 a;
    public String b;
    public z31 c;
    public pfe d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ b82 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l72(b82 b82Var, nt5 nt5Var) {
        super(nt5Var);
        this.g = b82Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= LinearLayoutManager.INVALID_OFFSET;
        return this.g.a(null, false, null, this);
    }
}
