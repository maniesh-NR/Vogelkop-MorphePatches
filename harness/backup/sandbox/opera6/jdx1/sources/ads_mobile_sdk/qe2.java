package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.jbp;

/* loaded from: classes.dex */
public final class qe2 extends nt5 {
    public se2 a;
    public Object b;
    public jbp c;
    public pfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ se2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe2(se2 se2Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = se2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return se2.a(this.f, null, null, this);
    }
}
