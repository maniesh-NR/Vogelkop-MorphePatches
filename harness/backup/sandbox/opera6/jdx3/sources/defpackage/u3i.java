package defpackage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public final class u3i extends nt5 {
    public Context t;
    public Uri u;
    public /* synthetic */ Object v;
    public final /* synthetic */ hr5 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3i(hr5 hr5Var, nt5 nt5Var) {
        super(nt5Var);
        this.w = hr5Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.m(null, null, this);
    }
}
