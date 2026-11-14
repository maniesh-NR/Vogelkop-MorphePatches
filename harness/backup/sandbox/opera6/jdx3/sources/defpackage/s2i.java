package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class s2i implements r82 {
    public final y3i a;
    public final ddc b;
    public d3k c;
    public final long d;

    public s2i(y3i y3iVar, ddc ddcVar) {
        this.a = y3iVar;
        this.b = ddcVar;
        on7 on7Var = pn7.b;
        this.d = cs5.x0(10, un7.e);
    }

    @Override // defpackage.r82
    public final void a() {
        this.c = na2.B(this.b, (CoroutineContext) null, (rx5) null, new agb((byte) 19, null, this), 3);
    }

    @Override // defpackage.r82
    public final void b(boolean z, boolean z2) {
    }

    @Override // defpackage.r82
    public final void c(int i) {
    }

    @Override // defpackage.r82
    public final void d(g82 g82Var, lqm lqmVar, boolean z) {
        this.a.n(zff.a);
    }

    @Override // defpackage.r82
    public final void e() {
        d3k d3kVar = this.c;
        if (d3kVar != null) {
            d3kVar.k((CancellationException) null);
        }
        this.c = null;
    }
}
