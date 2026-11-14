package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.pqh;

/* loaded from: classes.dex */
public final class pj1 extends nt5 {
    public bk1 a;
    public pqh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bk1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj1(bk1 bk1Var, mt5 mt5Var) {
        super(mt5Var);
        this.d = bk1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.b((String) null, (mt5) this);
    }
}
