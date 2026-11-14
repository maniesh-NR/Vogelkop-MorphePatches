package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class kt1 extends nt5 {
    public it1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wt1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt1(wt1 wt1Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = wt1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.b(null, null, null, this);
    }
}
