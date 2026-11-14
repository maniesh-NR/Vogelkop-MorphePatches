package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class tt extends vt {
    public final boolean a;
    public final boolean b;
    public final ArrayList c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public tt(boolean z, boolean z2, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.a = z;
        this.b = z2;
        this.c = arrayList;
        this.d = list;
        this.e = arrayList2;
        this.f = arrayList3;
        this.g = arrayList4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt)) {
            return false;
        }
        tt ttVar = (tt) obj;
        return this.a == ttVar.a && this.b == ttVar.b && this.c.equals(ttVar.c) && this.d.equals(ttVar.d) && this.e.equals(ttVar.e) && this.f.equals(ttVar.f) && this.g.equals(ttVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + z1m.g(this.f, z1m.g(this.e, rfp.f(z1m.g(this.c, fki.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31), 31);
    }

    public final String toString() {
        return "";
    }
}
