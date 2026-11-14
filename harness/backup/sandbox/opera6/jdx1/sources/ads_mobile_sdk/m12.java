package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class m12 extends nt5 {
    public n12 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ n12 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m12(n12 n12Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = n12Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.a((defpackage.r83) null, (mt5) this);
    }
}
