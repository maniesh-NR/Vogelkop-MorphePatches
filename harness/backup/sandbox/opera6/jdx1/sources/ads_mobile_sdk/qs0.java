package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class qs0 extends nt5 {
    public Object a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mt0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs0(mt0 mt0Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = mt0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return mt0.a(this.d, this);
    }
}
