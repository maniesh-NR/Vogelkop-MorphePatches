package defpackage;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hs4 {
    public final LinkedHashMap a;
    public Set b;
    public ebb c;

    public hs4(LinkedHashMap linkedHashMap, Set set, ebb ebbVar) {
        this.a = linkedHashMap;
        this.b = set;
        this.c = ebbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs4)) {
            return false;
        }
        hs4 hs4Var = (hs4) obj;
        return this.a.equals(hs4Var.a) && Intrinsics.a(this.b, hs4Var.b) && Intrinsics.a(this.c, hs4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
