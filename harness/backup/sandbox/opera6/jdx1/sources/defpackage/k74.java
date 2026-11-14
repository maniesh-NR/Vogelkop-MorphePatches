package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k74 {
    public final poe a;

    public k74(poe poeVar) {
        this.a = poeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k74) && Intrinsics.a(this.a, ((k74) obj).a);
    }

    public final int hashCode() {
        poe poeVar = this.a;
        if (poeVar != null) {
            return poeVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReadResult(request=null, response=" + this.a + ")";
    }
}
