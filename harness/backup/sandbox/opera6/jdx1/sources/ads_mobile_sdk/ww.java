package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ww extends nt5 {
    public lx a;
    public pfe b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ lx e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(lx lxVar, nt5 nt5Var) {
        super(nt5Var);
        this.e = lxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return lx.a(this.e, false, null, this);
    }
}
