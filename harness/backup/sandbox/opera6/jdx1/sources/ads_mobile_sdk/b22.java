package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class b22 extends nt5 {
    public p22 a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ p22 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b22(p22 p22Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = p22Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a(this);
    }
}
