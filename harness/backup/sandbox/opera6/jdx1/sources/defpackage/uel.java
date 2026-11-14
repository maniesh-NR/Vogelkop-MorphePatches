package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class uel {
    public final sf1 a;
    public sf1 b;
    public boolean c = false;
    public ace d = null;

    public uel(sf1 sf1Var, sf1 sf1Var2) {
        this.a = sf1Var;
        this.b = sf1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uel)) {
            return false;
        }
        uel uelVar = (uel) obj;
        return Intrinsics.a(this.a, uelVar.a) && Intrinsics.a(this.b, uelVar.b) && this.c == uelVar.c && Intrinsics.a(this.d, uelVar.d);
    }

    public final int hashCode() {
        int iK = fki.k((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        ace aceVar = this.d;
        return iK + (aceVar == null ? 0 : aceVar.hashCode());
    }

    public final String toString() {
        sf1 sf1Var = this.b;
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) sf1Var) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ")";
    }
}
