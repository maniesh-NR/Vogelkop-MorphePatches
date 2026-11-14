package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class kf1 extends nt5 {
    public rf1 a;
    public pfe b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ rf1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf1(rf1 rf1Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = rf1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a(false, (nt5) this);
    }
}
