package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.rap;
import defpackage.xzh;

/* loaded from: classes.dex */
public final class ko2 extends nt5 {
    public uo2 a;
    public rap b;
    public /* synthetic */ Object c;
    public final /* synthetic */ uo2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko2(uo2 uo2Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = uo2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a((rap) null, (xzh) null, this);
    }
}
