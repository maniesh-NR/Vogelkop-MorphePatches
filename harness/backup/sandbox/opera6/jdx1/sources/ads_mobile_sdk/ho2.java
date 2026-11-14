package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ho2 extends nt5 {
    public uo2 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uo2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho2(uo2 uo2Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = uo2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return uo2.a(this.c, this);
    }
}
