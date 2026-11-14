package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gla {
    public final List a;
    public final List b;
    public final List c;

    public gla(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gla)) {
            return false;
        }
        gla glaVar = (gla) obj;
        return Intrinsics.a(this.a, glaVar.a) && Intrinsics.a(this.b, glaVar.b) && Intrinsics.a(this.c, glaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rfp.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "HostStateFollowingData(matches=" + this.a + ", teams=" + this.b + ", tournaments=" + this.c + ")";
    }
}
