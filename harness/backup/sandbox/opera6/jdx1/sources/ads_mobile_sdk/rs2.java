package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class rs2 extends nt5 {
    public vs2 a;
    public pfe b;
    public long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ vs2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs2(vs2 vs2Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = vs2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return vs2.a(0L, this.e, this);
    }
}
