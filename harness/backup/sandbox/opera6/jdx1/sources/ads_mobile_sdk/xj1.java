package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class xj1 extends nt5 {
    public bk1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bk1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj1(bk1 bk1Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = bk1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return bk1.a(this.c, (String) null, this);
    }
}
