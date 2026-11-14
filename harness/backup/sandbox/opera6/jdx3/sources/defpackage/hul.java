package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class hul extends nt5 {
    public Uri t;
    public /* synthetic */ Object u;
    public final /* synthetic */ kul v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hul(kul kulVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = kulVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(null, this);
    }
}
