package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o6j {
    public final Set a;
    public final List b;

    public o6j(List list, Set set) {
        this.a = set;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6j)) {
            return false;
        }
        o6j o6jVar = (o6j) obj;
        return Intrinsics.a(this.a, o6jVar.a) && Intrinsics.a(this.b, o6jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
