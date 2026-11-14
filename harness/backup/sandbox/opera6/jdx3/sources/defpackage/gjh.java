package defpackage;

import android.graphics.Point;

/* loaded from: classes.dex */
public final class gjh extends nt5 {
    public Point t;
    public /* synthetic */ Object u;
    public final /* synthetic */ xbf v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjh(xbf xbfVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = xbfVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.q(null, this);
    }
}
