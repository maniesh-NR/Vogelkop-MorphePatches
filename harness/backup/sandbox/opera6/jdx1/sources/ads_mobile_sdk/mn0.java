package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class mn0 extends nt5 {
    public nn0 a;
    public String b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ nn0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn0(nn0 nn0Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = nn0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.d(this);
    }
}
