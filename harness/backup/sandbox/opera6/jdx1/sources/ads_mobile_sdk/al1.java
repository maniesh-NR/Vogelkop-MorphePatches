package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class al1 extends nt5 {
    public String a;
    public cd5 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bl1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al1(bl1 bl1Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = bl1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return bl1.a(this.d, (String) null, (cd5) null, this);
    }
}
