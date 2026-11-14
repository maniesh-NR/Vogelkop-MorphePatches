package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.pqh;
import java.util.Map;

/* loaded from: classes.dex */
public final class k11 extends nt5 {
    public Object a;
    public Object b;
    public pqh c;
    public boolean d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ q11 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k11(q11 q11Var, mt5 mt5Var) {
        super(mt5Var);
        this.g = q11Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= LinearLayoutManager.INVALID_OFFSET;
        return this.g.a((h21) null, (pn7) null, (Map) null, false, false, (mt5) this);
    }
}
