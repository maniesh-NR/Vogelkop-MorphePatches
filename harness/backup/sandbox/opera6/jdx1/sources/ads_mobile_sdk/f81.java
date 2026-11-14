package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.prb;

/* loaded from: classes.dex */
public final class f81 extends nt5 {
    public d91 a;
    public prb b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public String j;
    public prb k;
    public m5a l;
    public boolean m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ d91 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f81(d91 d91Var, mt5 mt5Var) {
        super(mt5Var);
        this.p = d91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= LinearLayoutManager.INVALID_OFFSET;
        return this.p.t(this);
    }
}
