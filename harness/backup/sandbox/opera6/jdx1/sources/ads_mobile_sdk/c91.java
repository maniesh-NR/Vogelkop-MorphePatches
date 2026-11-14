package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class c91 extends nt5 {
    public d91 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ d91 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c91(d91 d91Var, mt5 mt5Var) {
        super(mt5Var);
        this.c = d91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return d91.a(this.c, null, null, 0, null, null, null, null, null, null, this);
    }
}
