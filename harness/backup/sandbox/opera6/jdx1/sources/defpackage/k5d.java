package defpackage;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lk5d;", "Lh8e;", "Lm5d;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k5d extends h8e {
    public final p01 b;
    public final hil c;
    public final psp d;

    public k5d(p01 p01Var, hil hilVar, psp pspVar) {
        this.b = p01Var;
        this.c = hilVar;
        this.d = pspVar;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new m5d(this.b, this.c, this.d);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        m5d m5dVar = (m5d) b8eVar;
        float f = m5dVar.q;
        long j = m5dVar.s;
        float f2 = m5dVar.t;
        boolean z = m5dVar.r;
        float f3 = m5dVar.u;
        boolean z2 = m5dVar.v;
        psp pspVar = m5dVar.w;
        View view = m5dVar.x;
        n27 n27Var = m5dVar.y;
        m5dVar.o = this.b;
        m5dVar.q = Float.NaN;
        m5dVar.r = true;
        m5dVar.s = 9205357640488583168L;
        m5dVar.t = Float.NaN;
        m5dVar.u = Float.NaN;
        m5dVar.v = true;
        m5dVar.p = this.c;
        psp pspVar2 = this.d;
        m5dVar.w = pspVar2;
        View viewI0 = p37.i0(m5dVar);
        n27 n27Var2 = ui6.e0(m5dVar).y;
        if (m5dVar.z != null) {
            p0j p0jVar = n5d.a;
            if (9205357640488583168L != j || !gh7.b(Float.NaN, f2) || !gh7.b(Float.NaN, f3) || true != z || true != z2 || !pspVar2.equals(pspVar) || !viewI0.equals(view) || !Intrinsics.a(n27Var2, n27Var)) {
                m5dVar.U0();
            }
        }
        m5dVar.V0();
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (((((((((((this.b.hashCode() * 961) + 2143289344) * 31) + 1231) * 961) + 2143289344) * 31) + 2143289344) * 31) + 1231) * 31)) * 31);
    }
}
