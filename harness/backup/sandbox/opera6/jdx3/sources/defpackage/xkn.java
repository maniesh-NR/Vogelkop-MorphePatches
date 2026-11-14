package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class xkn {
    public final String a;
    public final aln b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public xkn(aln alnVar, String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.a = alnVar.getId();
        this.b = alnVar;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    public static xkn a(aln alnVar, int i, int i2) {
        return new xkn(alnVar, null, i, i2, p37.r(i, p37.a0(0.5f, i2)), !p37.u0(r6), !p37.u0(i), !p37.u0(i2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xkn.class == obj.getClass()) {
            xkn xknVar = (xkn) obj;
            if (this.d == xknVar.d && this.e == xknVar.e && this.f == xknVar.f && this.g == xknVar.g && this.h == xknVar.h && this.i == xknVar.i && this.a.equals(xknVar.a) && Objects.equals(this.c, xknVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i));
    }
}
