package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class x91 extends nt5 {
    public z91 a;
    public m5a b;
    public /* synthetic */ Object c;
    public final /* synthetic */ z91 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x91(z91 z91Var, mt5 mt5Var) {
        super(mt5Var);
        this.d = z91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.f(this);
    }
}
