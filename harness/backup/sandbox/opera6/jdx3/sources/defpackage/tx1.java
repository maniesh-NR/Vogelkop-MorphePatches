package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tx1 extends wxe {
    public final Uri m;
    public final z92 n;
    public final String o;
    public final String p;

    public tx1(z92 z92Var, Uri uri, String str, String str2) {
        this.m = uri;
        this.n = z92Var;
        this.o = str;
        this.p = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx1)) {
            return false;
        }
        tx1 tx1Var = (tx1) obj;
        return Intrinsics.a(this.m, tx1Var.m) && Intrinsics.a(this.n, tx1Var.n) && Intrinsics.a(this.o, tx1Var.o) && Intrinsics.a(this.p, tx1Var.p);
    }

    public final int hashCode() {
        int iHashCode = this.m.hashCode() * 31;
        z92 z92Var = this.n;
        int iHashCode2 = (iHashCode + (z92Var == null ? 0 : z92Var.a.hashCode())) * 31;
        String str = this.o;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.p;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
