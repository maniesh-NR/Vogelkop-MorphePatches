package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.prb;

/* loaded from: classes.dex */
public final class cx1 extends nt5 {
    public jx1 a;
    public prb b;
    public String c;
    public double d;
    public int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ jx1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx1(jx1 jx1Var, nt5 nt5Var) {
        super(nt5Var);
        this.h = jx1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= LinearLayoutManager.INVALID_OFFSET;
        return this.h.a((prb) null, false, (nt5) this);
    }
}
