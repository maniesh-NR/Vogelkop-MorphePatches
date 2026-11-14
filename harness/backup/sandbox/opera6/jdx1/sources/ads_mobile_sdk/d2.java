package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class d2 extends nt5 {
    public f2 a;
    public rg3 b;
    public rg3 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ f2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(f2 f2Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = f2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return f2.a(this.e, null, 0, this);
    }
}
