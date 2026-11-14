package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xr2 {
    public final ArrayList a;
    public final boolean b;
    public final k2g c;

    public xr2(ArrayList arrayList, boolean z, k2g k2gVar) {
        this.a = arrayList;
        this.b = z;
        this.c = k2gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr2)) {
            return false;
        }
        xr2 xr2Var = (xr2) obj;
        return this.a.equals(xr2Var.a) && this.b == xr2Var.b && Intrinsics.a(this.c, xr2Var.c);
    }

    public final int hashCode() {
        int iK = fki.k(this.a.hashCode() * 31, 31, this.b);
        k2g k2gVar = this.c;
        return iK + (k2gVar == null ? 0 : k2gVar.hashCode());
    }

    public final String toString() {
        return "";
    }
}
