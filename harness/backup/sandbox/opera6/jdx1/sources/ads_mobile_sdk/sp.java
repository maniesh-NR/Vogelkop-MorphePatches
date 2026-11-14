package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class sp extends nt5 {
    public tp a;
    public double b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ tp e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp(tp tpVar, nt5 nt5Var) {
        super(nt5Var);
        this.e = tpVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return tp.a(this.e, null, 0.0d, false, this);
    }
}
