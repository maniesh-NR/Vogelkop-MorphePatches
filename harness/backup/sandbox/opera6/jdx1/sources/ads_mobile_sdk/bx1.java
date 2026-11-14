package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.prb;

/* loaded from: classes.dex */
public final class bx1 extends nt5 {
    public jx1 a;
    public prb b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jx1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx1(jx1 jx1Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = jx1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a((prb) null, (String) null, this);
    }
}
