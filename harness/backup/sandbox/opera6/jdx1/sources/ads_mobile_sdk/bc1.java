package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class bc1 extends nt5 {
    public cc1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ cc1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc1(cc1 cc1Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = cc1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return cc1.a(this.c, this);
    }
}
