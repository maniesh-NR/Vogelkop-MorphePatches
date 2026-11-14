package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zie {
    public final List a;
    public final List b;
    public final List c;
    public final List d;

    public zie(List list, List list2, List list3, List list4) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zie)) {
            return false;
        }
        zie zieVar = (zie) obj;
        return Intrinsics.a(this.a, zieVar.a) && Intrinsics.a(this.b, zieVar.b) && Intrinsics.a(this.c, zieVar.c) && Intrinsics.a(this.d, zieVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rfp.f(rfp.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
