package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d2f extends nt5 {
    public List t;
    public ArrayList u;
    public Iterator v;
    public Object w;
    public /* synthetic */ Object x;
    public final /* synthetic */ e2f y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2f(e2f e2fVar, nt5 nt5Var) {
        super(nt5Var);
        this.y = e2fVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.d(null, this);
    }
}
