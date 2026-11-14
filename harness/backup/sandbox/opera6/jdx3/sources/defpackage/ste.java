package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ste {
    public final boolean a;
    public final o7j b;
    public final jrh c;
    public final bre d;
    public final adg e;
    public final cs5 f;

    public ste(boolean z, o7j o7jVar, jrh jrhVar, bre breVar, adg adgVar, cs5 cs5Var) {
        this.a = z;
        this.b = o7jVar;
        this.c = jrhVar;
        this.d = breVar;
        this.e = adgVar;
        this.f = cs5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ste)) {
            return false;
        }
        ste steVar = (ste) obj;
        return this.a == steVar.a && this.b == steVar.b && Intrinsics.a(this.c, steVar.c) && Intrinsics.a(this.d, steVar.d) && this.e == steVar.e && this.f.equals(steVar.f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        o7j o7jVar = this.b;
        int iHashCode2 = (iHashCode + (o7jVar == null ? 0 : o7jVar.hashCode())) * 31;
        jrh jrhVar = this.c;
        int iHashCode3 = (iHashCode2 + (jrhVar == null ? 0 : jrhVar.a.hashCode())) * 31;
        bre breVar = this.d;
        int iHashCode4 = (iHashCode3 + (breVar == null ? 0 : breVar.a.hashCode())) * 31;
        adg adgVar = this.e;
        return this.f.hashCode() + ((iHashCode4 + (adgVar != null ? adgVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "";
    }
}
