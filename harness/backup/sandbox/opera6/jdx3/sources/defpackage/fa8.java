package defpackage;

import com.opera.android.esim.work.EsimUpsellWorker;

/* loaded from: classes.dex */
public final class fa8 extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ EsimUpsellWorker u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa8(EsimUpsellWorker esimUpsellWorker, nt5 nt5Var) {
        super(nt5Var);
        this.u = esimUpsellWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.c(this);
    }
}
