package defpackage;

import com.leanplum.internal.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class j1p {

    @NotNull
    public static final p0p Companion = new p0p();
    public final String a;
    public final k0p b;
    public final y0p c;
    public final v0p d;
    public final String e;
    public final String f;
    public final int g;
    public final String h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final s0p m;

    public j1p(int i, String str, k0p k0pVar, y0p y0pVar, v0p v0pVar, String str2, String str3, int i2, String str4, int i3, int i4, int i5, int i6, s0p s0pVar) {
        if (5313 != (i & 5313)) {
            x7d.I(i, 5313, e0p.b);
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
            k0pVar = null;
        } else {
            this.b = k0pVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
            y0pVar = null;
        } else {
            this.c = y0pVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
            v0pVar = null;
        } else {
            this.d = v0pVar;
        }
        if ((i & 16) == 0) {
            this.e = "Opera";
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = "2.14.0";
        } else {
            this.f = str3;
        }
        this.g = i2;
        this.h = str4;
        if ((i & Constants.Crypt.KEY_LENGTH) == 0) {
            this.i = 1;
        } else {
            this.i = i3;
        }
        if ((i & 512) == 0) {
            this.j = 1;
        } else {
            this.j = i4;
        }
        this.k = i5;
        this.l = (i & 2048) == 0 ? 3600 : i6;
        this.m = s0pVar;
        if (k0pVar == null && y0pVar == null && v0pVar == null) {
            qp2.o("Failed requirement.");
            throw null;
        }
    }

    public j1p(String str, k0p k0pVar, y0p y0pVar, v0p v0pVar, int i, String str2, int i2, s0p s0pVar) {
        this.a = str;
        this.b = k0pVar;
        this.c = y0pVar;
        this.d = v0pVar;
        this.e = "Opera";
        this.f = "2.14.0";
        this.g = i;
        this.h = str2;
        this.i = 1;
        this.j = 1;
        this.k = i2;
        this.l = 3600;
        this.m = s0pVar;
        if (k0pVar == null && y0pVar == null && v0pVar == null) {
            qp2.o("Failed requirement.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1p)) {
            return false;
        }
        j1p j1pVar = (j1p) obj;
        return Intrinsics.a(this.a, j1pVar.a) && Intrinsics.a(this.b, j1pVar.b) && Intrinsics.a(this.c, j1pVar.c) && Intrinsics.a(this.d, j1pVar.d) && Intrinsics.a(this.e, j1pVar.e) && Intrinsics.a(this.f, j1pVar.f) && this.g == j1pVar.g && Intrinsics.a(this.h, j1pVar.h) && this.i == j1pVar.i && this.j == j1pVar.j && this.k == j1pVar.k && this.l == j1pVar.l && Intrinsics.a(this.m, j1pVar.m);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        k0p k0pVar = this.b;
        int iHashCode2 = (iHashCode + (k0pVar == null ? 0 : k0pVar.hashCode())) * 31;
        y0p y0pVar = this.c;
        int iHashCode3 = (iHashCode2 + (y0pVar == null ? 0 : y0pVar.hashCode())) * 31;
        v0p v0pVar = this.d;
        int iC = rfp.c(this.l, rfp.c(this.k, rfp.c(this.j, rfp.c(this.i, z1m.f(rfp.c(this.g, z1m.f(z1m.f((iHashCode3 + (v0pVar == null ? 0 : v0pVar.hashCode())) * 31, 31, this.e), 31, this.f), 31), 31, this.h), 31), 31), 31), 31);
        s0p s0pVar = this.m;
        return iC + (s0pVar != null ? Integer.hashCode(s0pVar.a) : 0);
    }

    public final String toString() {
        return "ImpObject(id=" + this.a + ", banner=" + this.b + ", video=" + this.c + ", native=" + this.d + ", displaymanager=" + this.e + ", displaymanagerver=" + this.f + ", instl=" + this.g + ", placementId=" + this.h + ", clickbrowser=" + this.i + ", secure=" + this.j + ", rwdd=" + this.k + ", exp=" + this.l + ", ext=" + this.m + ')';
    }
}
