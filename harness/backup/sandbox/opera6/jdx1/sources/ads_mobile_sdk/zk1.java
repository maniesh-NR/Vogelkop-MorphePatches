package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.ato;

/* loaded from: classes.dex */
public final class zk1 extends nt5 {
    public bl1 a;
    public String b;
    public ato c;
    public Object d;
    public pfe e;
    public /* synthetic */ Object f;
    public final /* synthetic */ bl1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk1(bl1 bl1Var, mt5 mt5Var) {
        super(mt5Var);
        this.g = bl1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= LinearLayoutManager.INVALID_OFFSET;
        return bl1.a(this.g, (String) null, (ato) null, (mt5) this);
    }
}
