package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class g98 extends nt5 {
    public Iterator t;
    public String u;
    public /* synthetic */ Object v;
    public final /* synthetic */ l98 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g98(l98 l98Var, nt5 nt5Var) {
        super(nt5Var);
        this.w = l98Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.a(this);
    }
}
