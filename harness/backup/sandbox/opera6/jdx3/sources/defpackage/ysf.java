package defpackage;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ysf {
    public final LinkedHashMap a;
    public final Set b;

    public ysf(LinkedHashMap linkedHashMap, Set set) {
        this.a = linkedHashMap;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysf)) {
            return false;
        }
        ysf ysfVar = (ysf) obj;
        return this.a.equals(ysfVar.a) && Intrinsics.a(this.b, ysfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
