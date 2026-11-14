package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class nc2 extends nt5 {
    public sc2 a;
    public defpackage.hp b;
    public Object c;
    public Object d;
    public Object e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ sc2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc2(sc2 sc2Var, nt5 nt5Var) {
        super(nt5Var);
        this.h = sc2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= LinearLayoutManager.INVALID_OFFSET;
        return this.h.a((defpackage.hp) null, (av2) null, (String) null, 0, (jc2) null, this);
    }
}
