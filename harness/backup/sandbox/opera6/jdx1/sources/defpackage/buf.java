package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class buf {
    public final ArrayList a;
    public final LinkedHashMap b;
    public final h81 c;
    public final LinkedHashMap d;

    public buf(ArrayList arrayList, LinkedHashMap linkedHashMap, h81 h81Var, LinkedHashMap linkedHashMap2) {
        this.a = arrayList;
        this.b = linkedHashMap;
        this.c = h81Var;
        this.d = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buf)) {
            return false;
        }
        buf bufVar = (buf) obj;
        return this.a.equals(bufVar.a) && this.b.equals(bufVar.b) && Intrinsics.a(this.c, bufVar.c) && this.d.equals(bufVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        h81 h81Var = this.c;
        return this.d.hashCode() + ((iHashCode + (h81Var == null ? 0 : h81Var.hashCode())) * 31);
    }

    public final String toString() {
        return "OutputConfigurations(all=" + this.a + ", deferred=" + this.b + ", postviewOutput=" + this.c + ", outputSurfaceMap=" + this.d + ')';
    }
}
