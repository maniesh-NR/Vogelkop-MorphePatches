package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mjl {
    public final sf1 a;
    public final ikl b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final n27 g;
    public final d2c h;
    public final mh9 i;
    public final long j;

    public mjl(sf1 sf1Var, ikl iklVar, List list, int i, boolean z, int i2, n27 n27Var, d2c d2cVar, mh9 mh9Var, long j) {
        this.a = sf1Var;
        this.b = iklVar;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = n27Var;
        this.h = d2cVar;
        this.i = mh9Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjl)) {
            return false;
        }
        mjl mjlVar = (mjl) obj;
        return Intrinsics.a(this.a, mjlVar.a) && Intrinsics.a(this.b, mjlVar.b) && Intrinsics.a(this.c, mjlVar.c) && this.d == mjlVar.d && this.e == mjlVar.e && this.f == mjlVar.f && Intrinsics.a(this.g, mjlVar.g) && this.h == mjlVar.h && Intrinsics.a(this.i, mjlVar.i) && yo5.b(this.j, mjlVar.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + rfp.c(this.f, fki.k((rfp.f(fki.l(this.b, this.a.hashCode() * 31, 31), 31, this.c) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        int i = this.f;
        String str = i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid";
        String strL = yo5.l(this.j);
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        z1m.u(sb, this.e, ", overflow=", str, ", density=");
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append(strL);
        sb.append(")");
        return sb.toString();
    }
}
