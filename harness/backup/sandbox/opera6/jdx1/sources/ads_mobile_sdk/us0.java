package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class us0 extends nt5 {
    public mt0 a;
    public cy0 b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ mt0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us0(mt0 mt0Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = mt0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a((cy0) null, this);
    }
}
