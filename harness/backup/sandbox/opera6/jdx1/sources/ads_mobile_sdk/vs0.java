package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class vs0 extends nt5 {
    public cy0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mt0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(mt0 mt0Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = mt0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.b(null, this);
    }
}
