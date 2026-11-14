package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s5j extends u5j {
    public final List b;
    public final List c;

    public s5j(List list, List list2) {
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5j)) {
            return false;
        }
        s5j s5jVar = (s5j) obj;
        return Intrinsics.a(this.b, s5jVar.b) && Intrinsics.a(this.c, s5jVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
