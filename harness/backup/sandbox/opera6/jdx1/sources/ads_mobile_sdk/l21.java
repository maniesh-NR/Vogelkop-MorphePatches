package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class l21 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ m21 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l21(m21 m21Var, mt5 mt5Var) {
        super(mt5Var);
        this.b = m21Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return this.b.a(null, null, this);
    }
}
