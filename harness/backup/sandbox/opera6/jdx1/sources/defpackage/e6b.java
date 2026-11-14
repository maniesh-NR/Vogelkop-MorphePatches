package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Le6b;", "Lh8e;", "Lf6b;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class e6b extends h8e {
    public final lde b;
    public final g6b c;

    public e6b(lde ldeVar, g6b g6bVar) {
        this.b = ldeVar;
        this.c = g6bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6b)) {
            return false;
        }
        e6b e6bVar = (e6b) obj;
        return Intrinsics.a(this.b, e6bVar.b) && Intrinsics.a(this.c, e6bVar.c);
    }

    @Override // defpackage.h8e
    public final b8e f() throws pxb {
        f17 f17VarA = this.c.a(this.b);
        f6b f6bVar = new f6b();
        f6bVar.q = f17VarA;
        f6bVar.T0(f17VarA);
        return f6bVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) throws pxb {
        f6b f6bVar = (f6b) b8eVar;
        f17 f17VarA = this.c.a(this.b);
        f6bVar.U0(f6bVar.q);
        f6bVar.q = f17VarA;
        f6bVar.T0(f17VarA);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
