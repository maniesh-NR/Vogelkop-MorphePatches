package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class jhk {
    public final LinkedHashMap a;

    public jhk(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof jhk) && this.a.equals(((jhk) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Plurals(items=" + this.a + ")";
    }
}
