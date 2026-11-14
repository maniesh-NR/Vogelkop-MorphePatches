package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class nr0 extends nt5 {
    public qr0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ qr0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr0(qr0 qr0Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = qr0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return qr0.a(this.c, null, null, this);
    }
}
