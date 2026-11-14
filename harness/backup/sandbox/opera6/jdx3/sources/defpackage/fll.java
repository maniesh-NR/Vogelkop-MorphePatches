package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fll {
    public final List a;
    public final f7j b;
    public final List c;
    public final g7j d;
    public final boolean e;

    public fll(List list, f7j f7jVar, List list2, g7j g7jVar, boolean z) {
        this.a = list;
        this.b = f7jVar;
        this.c = list2;
        this.d = g7jVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fll)) {
            return false;
        }
        fll fllVar = (fll) obj;
        return Intrinsics.a(this.a, fllVar.a) && this.b == fllVar.b && Intrinsics.a(this.c, fllVar.c) && this.d == fllVar.d && this.e == fllVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + rfp.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "";
    }
}
