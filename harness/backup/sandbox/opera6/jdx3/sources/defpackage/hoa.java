package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class hoa extends nt5 {
    public Uri.Builder t;
    public /* synthetic */ Object u;
    public final /* synthetic */ br6 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hoa(br6 br6Var, nt5 nt5Var) {
        super(nt5Var);
        this.v = br6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return br6.d(this.v, this);
    }
}
