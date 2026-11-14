package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.qcp;
import defpackage.s6h;

/* loaded from: classes.dex */
public final class dg1 extends nt5 {
    public s6h a;
    public /* synthetic */ Object b;
    public final /* synthetic */ eg1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg1(eg1 eg1Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = eg1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.a((qcp) null, this);
    }
}
