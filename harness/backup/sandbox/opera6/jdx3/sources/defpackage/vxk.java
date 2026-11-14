package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class vxk {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final List h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public vxk(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List list, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = list;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxk)) {
            return false;
        }
        vxk vxkVar = (vxk) obj;
        return this.a == vxkVar.a && this.b == vxkVar.b && this.c == vxkVar.c && this.d == vxkVar.d && this.e == vxkVar.e && this.f == vxkVar.f && this.g == vxkVar.g && this.h.equals(vxkVar.h) && this.i == vxkVar.i && this.j == vxkVar.j && this.k == vxkVar.k && this.l == vxkVar.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + fki.k(fki.k(fki.k(rfp.f(fki.k(fki.k(fki.k(fki.k(fki.k(fki.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        return "";
    }
}
