package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class yl extends nt5 {
    public zl a;
    public pfe b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ zl e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl(zl zlVar, nt5 nt5Var) {
        super(nt5Var);
        this.e = zlVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a(false, this);
    }
}
