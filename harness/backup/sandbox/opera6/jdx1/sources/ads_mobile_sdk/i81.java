package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class i81 extends nt5 {
    public Object a;
    public pfe b;
    public d91 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ d91 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i81(d91 d91Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = d91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.u(this);
    }
}
