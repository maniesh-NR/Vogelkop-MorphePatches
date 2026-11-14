package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l74 {
    public static final l74 b = new l74();
    public final poe a;

    public l74() {
        this.a = null;
    }

    public l74(poe poeVar) {
        this.a = poeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l74) {
            return Intrinsics.a(this.a, ((l74) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        poe poeVar = this.a;
        if (poeVar != null) {
            return poeVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.a + ")";
    }
}
