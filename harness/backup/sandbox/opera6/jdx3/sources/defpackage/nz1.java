package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class nz1 extends nt5 {
    public int A;
    public i07 t;
    public List u;
    public pqh v;
    public pqh w;
    public Map x;
    public /* synthetic */ Object y;
    public final /* synthetic */ tz1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz1(tz1 tz1Var, nt5 nt5Var) {
        super(nt5Var);
        this.z = tz1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.c(this);
    }
}
