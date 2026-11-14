package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class kb extends nt5 {
    public sb a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public pfe g;
    public long h;
    public /* synthetic */ Object i;
    public final /* synthetic */ sb j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(sb sbVar, nt5 nt5Var) {
        super(nt5Var);
        this.j = sbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= LinearLayoutManager.INVALID_OFFSET;
        return this.j.a((ejp) null, (String) null, (oa) null, this);
    }
}
