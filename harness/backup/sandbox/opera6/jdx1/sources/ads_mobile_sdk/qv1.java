package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class qv1 extends nt5 {
    public defpackage.pr a;
    public String b;
    public long c;
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ defpackage.pr f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv1(defpackage.pr prVar, nt5 nt5Var) {
        super(nt5Var);
        this.f = prVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.a((mt5) this);
    }
}
