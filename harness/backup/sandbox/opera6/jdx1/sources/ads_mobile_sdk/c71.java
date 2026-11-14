package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class c71 extends nt5 {
    public j71 a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ j71 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c71(j71 j71Var, mt5 mt5Var) {
        super(mt5Var);
        this.d = j71Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return j71.a(this.d, (mt5) this);
    }
}
