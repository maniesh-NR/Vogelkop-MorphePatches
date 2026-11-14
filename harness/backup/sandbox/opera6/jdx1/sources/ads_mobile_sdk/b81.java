package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class b81 extends nt5 {
    public d91 a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ d91 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b81(d91 d91Var, mt5 mt5Var) {
        super(mt5Var);
        this.d = d91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return d91.a(this.d, (mt5) this);
    }
}
