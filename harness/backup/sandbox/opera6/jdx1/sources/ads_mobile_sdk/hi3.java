package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class hi3 extends nt5 {
    public rg3 a;
    public rg3 b;
    public li3 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ li3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi3(li3 li3Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = li3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.j(this);
    }
}
