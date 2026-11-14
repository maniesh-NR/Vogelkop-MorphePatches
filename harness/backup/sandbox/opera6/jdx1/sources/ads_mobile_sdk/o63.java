package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.wdp;

/* loaded from: classes.dex */
public final class o63 extends nt5 {
    public rg3 a;
    public rg3 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wdp d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o63(wdp wdpVar, nt5 nt5Var) {
        super(nt5Var);
        this.d = wdpVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return wdp.p(this.d, this);
    }
}
