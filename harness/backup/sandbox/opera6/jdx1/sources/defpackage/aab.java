package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class aab implements xvf {
    public final g2o a;
    public final ikk b;

    public aab(g2o g2oVar, ikk ikkVar) {
        this.a = g2oVar;
        this.b = ikkVar;
    }

    @Override // defpackage.xvf
    public final float a() {
        g2o g2oVar = this.a;
        ikk ikkVar = this.b;
        return ikkVar.j0(g2oVar.c(ikkVar));
    }

    @Override // defpackage.xvf
    public final float b(d2c d2cVar) {
        g2o g2oVar = this.a;
        ikk ikkVar = this.b;
        return ikkVar.j0(g2oVar.d(ikkVar, d2cVar));
    }

    @Override // defpackage.xvf
    public final float c(d2c d2cVar) {
        g2o g2oVar = this.a;
        ikk ikkVar = this.b;
        return ikkVar.j0(g2oVar.b(ikkVar, d2cVar));
    }

    @Override // defpackage.xvf
    public final float d() {
        g2o g2oVar = this.a;
        ikk ikkVar = this.b;
        return ikkVar.j0(g2oVar.a(ikkVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aab)) {
            return false;
        }
        aab aabVar = (aab) obj;
        return Intrinsics.a(this.a, aabVar.a) && this.b.equals(aabVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ")";
    }
}
