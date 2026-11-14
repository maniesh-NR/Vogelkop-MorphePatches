package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.rap;

/* loaded from: classes.dex */
public final class jt2 extends nt5 {
    public mt2 a;
    public rap b;
    public a2 c;
    public rm0 d;
    public Integer e;
    public pfe f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ mt2 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt2(mt2 mt2Var, nt5 nt5Var) {
        super(nt5Var);
        this.i = mt2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= LinearLayoutManager.INVALID_OFFSET;
        return this.i.a(null, null, 0L, this);
    }
}
