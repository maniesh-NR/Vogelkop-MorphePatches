package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class k70 extends nt5 {
    public q70 a;
    public String b;
    public wf3 c;
    public wf3 d;
    public pfe e;
    public /* synthetic */ Object f;
    public final /* synthetic */ q70 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k70(q70 q70Var, nt5 nt5Var) {
        super(nt5Var);
        this.g = q70Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= LinearLayoutManager.INVALID_OFFSET;
        return q70.a(this.g, null, this);
    }
}
