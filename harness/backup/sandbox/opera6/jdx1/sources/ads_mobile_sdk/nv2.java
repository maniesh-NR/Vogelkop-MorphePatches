package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class nv2 extends nt5 {
    public tv2 a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ tv2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv2(tv2 tv2Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = tv2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a((z2) null, (String) null, this);
    }
}
