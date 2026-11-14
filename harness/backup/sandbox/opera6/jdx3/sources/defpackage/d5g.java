package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d5g {
    public final List a;
    public final u3g b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public d5g(List list, u3g u3gVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = list;
        this.b = u3gVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        int i = -1;
        this.h = (z && list.isEmpty()) ? 0 : -1;
        List list2 = list;
        this.i = (list2.isEmpty() || !z2) ? -1 : 0;
        if (!list2.isEmpty() && z3) {
            i = 0;
        }
        this.j = i;
        int size = 1;
        if (!list.isEmpty() || !z) {
            size = list.size() + ((z2 || z3) ? 1 : 0);
        }
        this.k = size;
    }

    public final w3g a(int i) {
        return (w3g) this.a.get(i - ((this.d || this.e) ? 1 : 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5g)) {
            return false;
        }
        d5g d5gVar = (d5g) obj;
        return Intrinsics.a(this.a, d5gVar.a) && this.b == d5gVar.b && this.c == d5gVar.c && this.d == d5gVar.d && this.e == d5gVar.e && this.f == d5gVar.f && this.g == d5gVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + fki.k(fki.k(fki.k(fki.k((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "";
    }
}
