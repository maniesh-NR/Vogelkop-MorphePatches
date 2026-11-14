package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lwzk;", "Lh8e;", "Lxzk;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class wzk extends h8e {
    public final Function1 b;
    public final Function1 c;

    public wzk(Function1 function1, Function1 function12) {
        this.b = function1;
        this.c = function12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wzk) {
            return this.c == ((wzk) obj).c;
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        xzk xzkVar = new xzk(sfe.f);
        xzkVar.r = this.c;
        return xzkVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        xzk xzkVar = (xzk) b8eVar;
        Function1 function1 = xzkVar.r;
        Function1 function12 = this.c;
        if (function1 != function12) {
            xzkVar.r = function12;
            k3o k3oVar = xzkVar.s;
            if (k3oVar != null) {
                g2o g2oVar = (g2o) function12.invoke(k3oVar);
                if (Intrinsics.a(g2oVar, xzkVar.q)) {
                    return;
                }
                xzkVar.q = g2oVar;
                xzkVar.U0();
            }
        }
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
