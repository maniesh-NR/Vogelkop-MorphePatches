package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class xvn extends nt5 {
    public IOException t;
    public pfe u;
    public /* synthetic */ Object v;
    public final /* synthetic */ dwn w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvn(dwn dwnVar, nt5 nt5Var) {
        super(nt5Var);
        this.w = dwnVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.a(null, this);
    }
}
