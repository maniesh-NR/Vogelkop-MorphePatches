package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class h71 extends nt5 {
    public j71 a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ j71 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h71(j71 j71Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = j71Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a((mt5) this);
    }
}
