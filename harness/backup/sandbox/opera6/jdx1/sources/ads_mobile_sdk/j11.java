package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class j11 extends nt5 {
    public q11 a;
    public fvh b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ q11 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j11(q11 q11Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = q11Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a(null, this);
    }
}
