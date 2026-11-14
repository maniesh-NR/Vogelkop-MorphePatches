package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class rr extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ sr b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr(sr srVar, nt5 nt5Var) {
        super(nt5Var);
        this.b = srVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return sr.c(this.b, this);
    }
}
