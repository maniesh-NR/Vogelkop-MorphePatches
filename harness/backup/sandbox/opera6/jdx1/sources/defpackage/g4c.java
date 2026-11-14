package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lg4c;", "Lh8e;", "Lh4c;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g4c extends h8e {
    public final float b;
    public final boolean c;

    public g4c(float f, boolean z) {
        this.b = f;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        g4c g4cVar = obj instanceof g4c ? (g4c) obj : null;
        return g4cVar != null && this.b == g4cVar.b && this.c == g4cVar.c;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        h4c h4cVar = new h4c();
        h4cVar.o = this.b;
        h4cVar.p = this.c;
        return h4cVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        h4c h4cVar = (h4c) b8eVar;
        h4cVar.o = this.b;
        h4cVar.p = this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }
}
