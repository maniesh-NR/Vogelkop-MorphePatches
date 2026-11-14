package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.prb;

/* loaded from: classes.dex */
public final class iv2 extends nt5 {
    public kv2 a;
    public prb b;
    public String c;
    public String d;
    public prb e;
    public pfe f;
    public /* synthetic */ Object g;
    public final /* synthetic */ kv2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv2(kv2 kv2Var, nt5 nt5Var) {
        super(nt5Var);
        this.h = kv2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= LinearLayoutManager.INVALID_OFFSET;
        return this.h.a(null, this);
    }
}
