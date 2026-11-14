package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class v59 implements mo7 {
    public final dj9 a;
    public final long b;
    public final x5f c;
    public final wsf d;

    public v59(dj9 dj9Var, long j, x5f x5fVar, wsf wsfVar) {
        this.a = dj9Var;
        this.b = j;
        this.c = x5fVar;
        this.d = wsfVar;
    }

    @Override // defpackage.mo7
    public final void o(boolean z) {
        dj9 dj9Var = this.a;
        cj9 cj9Var = (cj9) dj9Var.i();
        boolean zIsEmpty = cj9Var.isEmpty();
        int i = cj9Var.c;
        if (zIsEmpty) {
            return;
        }
        long j = i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(j);
        x5f x5fVar = this.c;
        zpa zpaVar = x5fVar.d;
        x56 x56VarF = zpa.F();
        in0 in0VarI = x56VarF.I(zpaVar);
        long j2 = this.b;
        in0VarI.p(34, 1, j2 - millis);
        x5fVar.U0(x56VarF);
        this.d.a(new k5f((byte) 1, j2, timeUnit.toMillis(j)));
        dj9Var.H(this);
    }
}
