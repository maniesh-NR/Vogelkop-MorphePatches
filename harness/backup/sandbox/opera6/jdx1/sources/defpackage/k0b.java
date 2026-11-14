package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0b {
    public static final k0b g = new k0b(false, 0, true, 1, 1, awc.c);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final awc f;

    public k0b(boolean z, int i, boolean z2, int i2, int i3, awc awcVar) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = awcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0b)) {
            return false;
        }
        k0b k0bVar = (k0b) obj;
        return this.a == k0bVar.a && this.b == k0bVar.b && this.c == k0bVar.c && this.d == k0bVar.d && this.e == k0bVar.e && Intrinsics.a(this.f, k0bVar.f);
    }

    public final int hashCode() {
        return this.f.a.hashCode() + rfp.c(this.e, rfp.c(this.d, fki.k(rfp.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        String strN0 = f03.n0(this.b);
        String strA = wvb.a(this.d);
        String strA2 = h0b.a(this.e);
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.a);
        sb.append(", capitalization=");
        sb.append(strN0);
        sb.append(", autoCorrect=");
        z1m.u(sb, this.c, ", keyboardType=", strA, ", imeAction=");
        sb.append(strA2);
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
