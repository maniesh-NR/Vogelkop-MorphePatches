package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z42 {
    public final ArrayList a;
    public final fz1 b;
    public final boolean c;

    public z42(ArrayList arrayList, fz1 fz1Var, boolean z) {
        this.a = arrayList;
        this.b = fz1Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z42)) {
            return false;
        }
        z42 z42Var = (z42) obj;
        return this.a.equals(z42Var.a) && Intrinsics.a(this.b, z42Var.b) && this.c == z42Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        fz1 fz1Var = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (fz1Var == null ? 0 : fz1Var.hashCode())) * 31);
    }

    public final String toString() {
        return "";
    }
}
