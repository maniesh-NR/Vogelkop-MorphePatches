package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class c22 extends nt5 {
    public p22 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ p22 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c22(p22 p22Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = p22Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.b(this);
    }
}
