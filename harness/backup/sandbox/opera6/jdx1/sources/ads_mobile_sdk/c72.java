package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class c72 extends nt5 {
    public f72 a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ f72 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c72(f72 f72Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = f72Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return f72.a(this.d, this);
    }
}
