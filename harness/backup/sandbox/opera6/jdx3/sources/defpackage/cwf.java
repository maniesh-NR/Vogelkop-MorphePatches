package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cwf {
    public final String a;
    public boolean b;
    public final boolean c = false;
    public int d;
    public int e;
    public final bwf f;

    public cwf(bwf bwfVar, boolean z) {
        this.a = bwfVar.b();
        this.b = z;
        this.f = bwfVar;
    }

    public final boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        cwf cwfVar = (cwf) obj;
        return Intrinsics.a(this.a, cwfVar.a) && this.b == cwfVar.b && this.c == cwfVar.c && this.d == cwfVar.d && this.e == cwfVar.e;
    }

    public final int b() {
        return ((fki.k(fki.k(this.a.hashCode() * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return cwf.class.equals(obj != null ? obj.getClass() : null) && a(obj) && Intrinsics.a(this.f, ((cwf) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (b() * 31);
    }
}
