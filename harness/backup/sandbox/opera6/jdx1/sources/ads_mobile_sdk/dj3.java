package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class dj3 extends nt5 {
    public nj3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ nj3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj3(nj3 nj3Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = nj3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return nj3.a(this.c, (nt5) this);
    }
}
