package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class c3 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ e3 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(e3 e3Var, nt5 nt5Var) {
        super(nt5Var);
        this.b = e3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return e3.a(this.b, (nt5) this);
    }
}
