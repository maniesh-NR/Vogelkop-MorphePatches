package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ix4 {
    public final LinkedHashSet a;
    public final Set b;

    public ix4(LinkedHashSet linkedHashSet, Set set) {
        this.a = linkedHashSet;
        if (set.isEmpty()) {
            set = v08.a;
        } else if (!linkedHashSet.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (!linkedHashSet.contains(Integer.valueOf(((Number) obj).intValue()))) {
                    arrayList.add(obj);
                }
            }
            set = CollectionsKt.n0(arrayList);
        }
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ix4.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ix4 ix4Var = (ix4) obj;
        return this.a.equals(ix4Var.a) && Intrinsics.a(this.b, ix4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
