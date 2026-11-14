package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.prb;

/* loaded from: classes.dex */
public final class hx1 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ jx1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx1(jx1 jx1Var, nt5 nt5Var) {
        super(nt5Var);
        this.b = jx1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return this.b.a((prb) null, (ve2) null, this);
    }
}
