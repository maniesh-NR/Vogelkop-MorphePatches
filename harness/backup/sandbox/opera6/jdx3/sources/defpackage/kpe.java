package defpackage;

import java.util.EnumSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class kpe extends nt5 {
    public EnumSet t;
    public Iterator u;
    public /* synthetic */ Object v;
    public final /* synthetic */ isd w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpe(isd isdVar, nt5 nt5Var) {
        super(nt5Var);
        this.w = isdVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.M(null, this);
    }
}
