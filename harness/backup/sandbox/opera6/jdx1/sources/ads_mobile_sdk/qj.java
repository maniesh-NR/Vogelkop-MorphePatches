package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class qj extends nt5 {
    public ek a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ek d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj(ek ekVar, nt5 nt5Var) {
        super(nt5Var);
        this.d = ekVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return ek.a(this.d, this);
    }
}
