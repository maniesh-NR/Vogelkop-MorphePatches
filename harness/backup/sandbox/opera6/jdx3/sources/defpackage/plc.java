package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class plc extends nt5 {
    public /* synthetic */ Object A;
    public final /* synthetic */ wlc B;
    public int C;
    public wlc t;
    public List u;
    public Set v;
    public List w;
    public Iterator x;
    public ruc y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public plc(wlc wlcVar, mt5 mt5Var) {
        super(mt5Var);
        this.B = wlcVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return wlc.c(this.B, 0L, this);
    }
}
