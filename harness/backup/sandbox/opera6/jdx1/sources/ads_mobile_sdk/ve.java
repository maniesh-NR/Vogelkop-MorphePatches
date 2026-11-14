package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ve extends nt5 {
    public we a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public vv0 f;
    public vv0 g;
    public vv0 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ we j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(we weVar, nt5 nt5Var) {
        super(nt5Var);
        this.j = weVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= LinearLayoutManager.INVALID_OFFSET;
        return this.j.a(this);
    }
}
