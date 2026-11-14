package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ms {
    public final Object a;
    public final Set b;
    public final int c;

    public ms(Object obj, Set set, int i) {
        this.a = obj;
        this.b = set;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms)) {
            return false;
        }
        ms msVar = (ms) obj;
        return Intrinsics.a(this.a, msVar.a) && Intrinsics.a(this.b, msVar.b) && this.c == msVar.c;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
