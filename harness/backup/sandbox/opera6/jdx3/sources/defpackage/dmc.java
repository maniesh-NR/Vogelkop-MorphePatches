package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class dmc extends nt5 {
    public Map t;
    public Iterator u;
    public /* synthetic */ Object v;
    public final /* synthetic */ gmc w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmc(gmc gmcVar, nt5 nt5Var) {
        super(nt5Var);
        this.w = gmcVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.f(null, this);
    }
}
