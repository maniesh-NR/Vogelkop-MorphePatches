package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class nf extends nt5 {
    public Object a;
    public pfe b;
    public long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ bg e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf(bg bgVar, nt5 nt5Var) {
        super(nt5Var);
        this.e = bgVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return bg.b(this.e, 0L, this);
    }
}
