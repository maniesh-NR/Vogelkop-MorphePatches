package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class c6k {
    public final LinkedHashMap a;
    public final ArrayList b;
    public final boolean c;

    public c6k(LinkedHashMap linkedHashMap, ArrayList arrayList, boolean z) {
        this.a = linkedHashMap;
        this.b = arrayList;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6k)) {
            return false;
        }
        c6k c6kVar = (c6k) obj;
        return this.a.equals(c6kVar.a) && this.b.equals(c6kVar.b) && this.c == c6kVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + z1m.g(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "";
    }
}
