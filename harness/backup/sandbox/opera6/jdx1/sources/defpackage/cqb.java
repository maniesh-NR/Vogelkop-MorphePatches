package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cqb extends eqb {
    public final int a;
    public final String b;

    public cqb(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqb)) {
            return false;
        }
        cqb cqbVar = (cqb) obj;
        return this.a == cqbVar.a && Intrinsics.a(this.b, cqbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CodeAndMessage(code=" + this.a + ", message=" + this.b + ")";
    }
}
