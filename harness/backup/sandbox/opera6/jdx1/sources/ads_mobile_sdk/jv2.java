package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class jv2 extends nt5 {
    public kv2 a;
    public String b;
    public cd5 c;
    public pfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ kv2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv2(kv2 kv2Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = kv2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.a((String) null, (cd5) null, this);
    }
}
