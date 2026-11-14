package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lt7o;", "Lh8e;", "Lu7o;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class t7o extends h8e {
    public final p97 b;
    public final boolean c;
    public final Function2 d;
    public final Object e;

    public t7o(p97 p97Var, boolean z, Function2 function2, Object obj) {
        this.b = p97Var;
        this.c = z;
        this.d = function2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t7o.class != obj.getClass()) {
            return false;
        }
        t7o t7oVar = (t7o) obj;
        return this.b == t7oVar.b && this.c == t7oVar.c && this.e.equals(t7oVar.e);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        u7o u7oVar = new u7o();
        u7oVar.o = this.b;
        u7oVar.p = this.c;
        u7oVar.q = this.d;
        return u7oVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        u7o u7oVar = (u7o) b8eVar;
        u7oVar.o = this.b;
        u7oVar.p = this.c;
        u7oVar.q = this.d;
    }

    public final int hashCode() {
        return this.e.hashCode() + fki.k(this.b.hashCode() * 31, 31, this.c);
    }
}
