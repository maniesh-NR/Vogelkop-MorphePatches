package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gkl {
    public final String a;
    public String b;
    public boolean c = false;
    public wzf d = null;

    public gkl(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkl)) {
            return false;
        }
        gkl gklVar = (gkl) obj;
        return Intrinsics.a(this.a, gklVar.a) && Intrinsics.a(this.b, gklVar.b) && this.c == gklVar.c && Intrinsics.a(this.d, gklVar.d);
    }

    public final int hashCode() {
        int iK = fki.k(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        wzf wzfVar = this.d;
        return iK + (wzfVar == null ? 0 : wzfVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ")";
    }
}
