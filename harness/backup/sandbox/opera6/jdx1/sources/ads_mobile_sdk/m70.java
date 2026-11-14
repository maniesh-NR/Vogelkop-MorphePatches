package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class m70 extends nt5 {
    public q70 a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ q70 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m70(q70 q70Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = q70Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a(this);
    }
}
