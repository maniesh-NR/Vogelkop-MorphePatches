package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.xzh;

/* loaded from: classes.dex */
public final class bs2 extends nt5 {
    public vs2 a;
    public Object b;
    public xzh c;
    public pfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ vs2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs2(vs2 vs2Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = vs2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return vs2.a(this.f, this);
    }
}
