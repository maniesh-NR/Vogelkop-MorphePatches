package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.prb;

/* loaded from: classes.dex */
public final class ru2 extends nt5 {
    public su2 a;
    public prb b;
    public String c;
    public pfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ su2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru2(su2 su2Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = su2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return su2.a(this.f, null, null, null, this);
    }
}
