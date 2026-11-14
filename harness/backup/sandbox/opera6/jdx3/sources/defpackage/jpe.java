package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class jpe extends nt5 {
    public Iterator t;
    public /* synthetic */ Object u;
    public final /* synthetic */ isd v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpe(isd isdVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = isdVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.C(this);
    }
}
