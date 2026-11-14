package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La9f;", "Lh8e;", "Lj9f;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class a9f extends h8e {
    public final float b;
    public final float c;

    public a9f(float f, float f2, w5f w5fVar) {
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        a9f a9fVar = obj instanceof a9f ? (a9f) obj : null;
        return a9fVar != null && gh7.b(this.b, a9fVar.b) && gh7.b(this.c, a9fVar.c);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        j9f j9fVar = new j9f();
        j9fVar.o = this.b;
        j9fVar.p = this.c;
        j9fVar.q = true;
        return j9fVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        j9f j9fVar = (j9f) b8eVar;
        float f = j9fVar.o;
        float f2 = this.b;
        boolean zB = gh7.b(f, f2);
        float f3 = this.c;
        if (!zB || !gh7.b(j9fVar.p, f3) || !j9fVar.q) {
            ui6.e0(j9fVar).U(false);
        }
        j9fVar.o = f2;
        j9fVar.p = f3;
        j9fVar.q = true;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.c) + (Float.hashCode(this.b) * 31)) * 31) + 1231;
    }

    public final String toString() {
        return sko.l("OffsetModifierElement(x=", gh7.c(this.b), ", y=", gh7.c(this.c), ", rtlAware=true)");
    }
}
