package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n3l {
    public static final n3l d = new n3l(false, false, null);
    public static final n3l e = new n3l(true, false, null);
    public final boolean a;
    public final boolean b;
    public final Integer c;

    public n3l(boolean z, boolean z2, Integer num) {
        this.a = z;
        this.b = z2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3l)) {
            return false;
        }
        n3l n3lVar = (n3l) obj;
        return this.a == n3lVar.a && this.b == n3lVar.b && Intrinsics.a(this.c, n3lVar.c);
    }

    public final int hashCode() {
        int iK = fki.k(Boolean.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        return iK + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "";
    }
}
