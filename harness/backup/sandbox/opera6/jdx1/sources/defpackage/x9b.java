package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lx9b;", "Lh8e;", "Lz9b;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class x9b extends h8e {
    public final g2o b;
    public final Function1 c;

    public x9b(g2o g2oVar, Function1 function1) {
        this.b = g2oVar;
        this.c = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x9b) {
            return Intrinsics.a(((x9b) obj).b, this.b);
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new z9b(this.b);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        z9b z9bVar = (z9b) b8eVar;
        g2o g2oVar = z9bVar.q;
        g2o g2oVar2 = this.b;
        if (Intrinsics.a(g2oVar2, g2oVar)) {
            return;
        }
        z9bVar.q = g2oVar2;
        z9bVar.U0();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
