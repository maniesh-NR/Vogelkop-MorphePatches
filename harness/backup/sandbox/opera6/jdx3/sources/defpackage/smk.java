package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class smk extends nt5 {
    public List t;
    public String u;
    public Iterator v;
    public /* synthetic */ Object w;
    public final /* synthetic */ tmk x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smk(tmk tmkVar, nt5 nt5Var) {
        super(nt5Var);
        this.x = tmkVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.k(null, this);
    }
}
