package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class r82 extends nt5 {
    public v82 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ v82 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r82(v82 v82Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = v82Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return v82.a(this.c, (nt5) this);
    }
}
