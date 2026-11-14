package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class uy extends nt5 {
    public vz a;
    public ox b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ vz e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy(vz vzVar, nt5 nt5Var) {
        super(nt5Var);
        this.e = vzVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return vz.a(this.e, false, (nt5) this);
    }
}
