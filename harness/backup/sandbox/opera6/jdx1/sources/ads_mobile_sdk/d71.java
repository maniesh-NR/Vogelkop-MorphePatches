package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.xzh;

/* loaded from: classes.dex */
public final class d71 extends nt5 {
    public j71 a;
    public av0 b;
    public xzh c;
    public pfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ j71 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d71(j71 j71Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = j71Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return j71.a(this.f, (av0) null, (xzh) null, this);
    }
}
