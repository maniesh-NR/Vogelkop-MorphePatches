package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class k30 extends nt5 {
    public p30 a;
    public Object b;
    public Object c;
    public Object d;
    public String e;
    public boolean f;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ p30 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k30(p30 p30Var, mt5 mt5Var) {
        super(mt5Var);
        this.i = p30Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= LinearLayoutManager.INVALID_OFFSET;
        return this.i.a(null, null, null, false, false, this);
    }
}
