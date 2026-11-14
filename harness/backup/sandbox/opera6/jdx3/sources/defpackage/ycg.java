package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ycg {
    public final List a;
    public final eef b;
    public final hff c;

    public ycg(List list, eef eefVar, hff hffVar) {
        this.a = list;
        this.b = eefVar;
        this.c = hffVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycg)) {
            return false;
        }
        ycg ycgVar = (ycg) obj;
        return Intrinsics.a(this.a, ycgVar.a) && Intrinsics.a(this.b, ycgVar.b) && this.c == ycgVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        eef eefVar = this.b;
        return this.c.hashCode() + ((iHashCode + (eefVar == null ? 0 : eefVar.hashCode())) * 31);
    }

    public final String toString() {
        return "";
    }
}
