package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class gc6 extends nt5 {
    public Serializable t;
    public Iterator u;
    public /* synthetic */ Object v;
    public final /* synthetic */ i06 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc6(i06 i06Var, nt5 nt5Var) {
        super(nt5Var);
        this.w = i06Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.o(null, null, this);
    }
}
