package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.prb;

/* loaded from: classes.dex */
public final class hf0 extends nt5 {
    public cg0 a;
    public rg3 b;
    public rg3 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ cg0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf0(cg0 cg0Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = cg0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return cg0.a(this.e, (String) null, (String) null, (prb) null, (kh3) null, this);
    }
}
