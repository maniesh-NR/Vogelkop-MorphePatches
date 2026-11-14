package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q3o {
    public final List a;

    public q3o(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !q3o.class.equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.a(this.a, ((q3o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return CollectionsKt.P(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, (Function1) null, 56);
    }
}
