package defpackage;

import kotlinx.serialization.json.c;

/* loaded from: classes.dex */
public final class awn extends nt5 {
    public c t;
    public /* synthetic */ Object u;
    public final /* synthetic */ dwn v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awn(dwn dwnVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = dwnVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.d(null, this);
    }
}
