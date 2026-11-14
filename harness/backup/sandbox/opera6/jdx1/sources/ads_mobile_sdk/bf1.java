package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.on;

/* loaded from: classes.dex */
public final class bf1 extends nt5 {
    public Object a;
    public Object b;
    public lqh c;
    public pfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ rf1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf1(rf1 rf1Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = rf1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.a((on) null, this);
    }
}
