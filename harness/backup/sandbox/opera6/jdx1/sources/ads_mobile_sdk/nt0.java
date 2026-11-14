package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class nt0 extends nt5 {
    public st0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ st0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt0(st0 st0Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = st0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return st0.a(this.c, (nt5) this);
    }
}
