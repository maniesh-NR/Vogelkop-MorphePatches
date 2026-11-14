package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class fnj {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashSet c;

    public fnj(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashSet linkedHashSet) {
        this.a = linkedHashMap;
        this.b = linkedHashMap2;
        this.c = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnj)) {
            return false;
        }
        fnj fnjVar = (fnj) obj;
        return this.a.equals(fnjVar.a) && this.b.equals(fnjVar.b) && this.c.equals(fnjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
