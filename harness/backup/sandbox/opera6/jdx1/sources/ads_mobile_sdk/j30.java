package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class j30 extends nt5 {
    public p30 a;
    public Object b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ p30 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j30(p30 p30Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = p30Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a(null, this);
    }
}
