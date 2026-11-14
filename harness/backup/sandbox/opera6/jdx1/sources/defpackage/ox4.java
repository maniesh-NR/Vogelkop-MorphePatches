package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class ox4 {

    @NotNull
    public static final nx4 Companion = new nx4();
    public final String a;
    public final k2j b;

    public /* synthetic */ ox4(int i, String str, k2j k2jVar) throws n1e {
        if (3 != (i & 3)) {
            x7d.I(i, 3, mx4.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = k2jVar;
    }

    public ox4(String str, k2j k2jVar) {
        this.a = str;
        this.b = k2jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox4)) {
            return false;
        }
        ox4 ox4Var = (ox4) obj;
        return Intrinsics.a(this.a, ox4Var.a) && Intrinsics.a(this.b, ox4Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        k2j k2jVar = this.b;
        return iHashCode + (k2jVar == null ? 0 : k2jVar.hashCode());
    }

    public final String toString() {
        return "SavedChildState(key=" + this.a + ", savedState=" + this.b + ')';
    }
}
