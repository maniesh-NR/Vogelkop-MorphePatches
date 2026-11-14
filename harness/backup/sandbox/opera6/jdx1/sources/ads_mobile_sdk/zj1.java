package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class zj1 extends nt5 {
    public bk1 a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bk1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj1(bk1 bk1Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = bk1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return bk1.a(this.d, this);
    }
}
