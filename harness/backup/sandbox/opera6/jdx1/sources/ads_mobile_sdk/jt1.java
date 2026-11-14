package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.prb;

/* loaded from: classes.dex */
public final class jt1 extends nt5 {
    public rg3 a;
    public rg3 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wt1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt1(wt1 wt1Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = wt1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a((a2) null, (prb) null, (ve2) null, this);
    }
}
