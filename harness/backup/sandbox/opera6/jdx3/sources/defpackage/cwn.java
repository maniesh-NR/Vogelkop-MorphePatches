package defpackage;

import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes.dex */
public final class cwn extends nt5 {
    public /* synthetic */ Object A;
    public final /* synthetic */ dwn B;
    public int C;
    public qfb t;
    public b u;
    public c v;
    public tvn w;
    public pfe x;
    public int y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwn(dwn dwnVar, nt5 nt5Var) {
        super(nt5Var);
        this.B = dwnVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.f(null, this);
    }
}
