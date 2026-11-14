package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class pl3 extends nt5 {
    public ql3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ql3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl3(ql3 ql3Var, mt5 mt5Var) {
        super(mt5Var);
        this.c = ql3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.a(null, null, this);
    }
}
