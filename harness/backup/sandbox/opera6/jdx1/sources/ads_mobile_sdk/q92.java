package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.klp;

/* loaded from: classes.dex */
public final class q92 extends nt5 {
    public u92 a;
    public klp b;
    public w92 c;
    public qn2 d;
    public pfe e;
    public /* synthetic */ Object f;
    public final /* synthetic */ u92 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q92(u92 u92Var, mt5 mt5Var) {
        super(mt5Var);
        this.g = u92Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= LinearLayoutManager.INVALID_OFFSET;
        return this.g.a((klp) null, (w92) null, (mt5) this);
    }
}
