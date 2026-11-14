package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class y71 extends nt5 {
    public d91 a;
    public String b;
    public j71 c;
    public pfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ d91 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y71(d91 d91Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = d91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.a((String) null, (j71) null, this);
    }
}
