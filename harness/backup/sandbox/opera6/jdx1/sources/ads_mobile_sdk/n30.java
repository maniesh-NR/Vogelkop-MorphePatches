package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class n30 extends nt5 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ p30 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n30(p30 p30Var, nt5 nt5Var) {
        super(nt5Var);
        this.k = p30Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= LinearLayoutManager.INVALID_OFFSET;
        return this.k.a(null, null, false, false, this);
    }
}
