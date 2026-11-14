package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class w22 extends nt5 {
    public x22 a;
    public uq b;
    public String c;
    public g21 d;
    public String e;
    public g21 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ x22 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w22(x22 x22Var, nt5 nt5Var) {
        super(nt5Var);
        this.h = x22Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= LinearLayoutManager.INVALID_OFFSET;
        return this.h.a(null, this);
    }
}
