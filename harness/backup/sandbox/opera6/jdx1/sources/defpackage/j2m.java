package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j2m {
    public final sf1 a;
    public final i9f b;

    public j2m(sf1 sf1Var, i9f i9fVar) {
        this.a = sf1Var;
        this.b = i9fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2m)) {
            return false;
        }
        j2m j2mVar = (j2m) obj;
        return Intrinsics.a(this.a, j2mVar.a) && this.b.equals(j2mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ")";
    }
}
