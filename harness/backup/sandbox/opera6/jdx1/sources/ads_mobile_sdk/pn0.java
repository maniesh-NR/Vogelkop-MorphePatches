package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.bfp;

/* loaded from: classes.dex */
public final class pn0 extends nt5 {
    public sy0 a;
    public a2 b;
    public hg0 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ bfp e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn0(bfp bfpVar, nt5 nt5Var) {
        super(nt5Var);
        this.e = bfpVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return bfp.c(this.e, null, null, null, this);
    }
}
