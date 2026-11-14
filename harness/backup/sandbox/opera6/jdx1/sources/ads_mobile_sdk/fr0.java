package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class fr0 extends nt5 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public t70 f;
    public yz g;
    public /* synthetic */ Object h;
    public final /* synthetic */ gr0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr0(gr0 gr0Var, mt5 mt5Var) {
        super(mt5Var);
        this.i = gr0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= LinearLayoutManager.INVALID_OFFSET;
        return gr0.a(this.i, null, null, this);
    }
}
