package defpackage;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qx1 extends wxe {
    public final File m;
    public final String n;
    public final o29 o;

    public qx1(o29 o29Var, File file, String str) {
        this.m = file;
        this.n = str;
        this.o = o29Var;
    }

    public final boolean G() {
        return this.o == o29.IMAGE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx1)) {
            return false;
        }
        qx1 qx1Var = (qx1) obj;
        return this.m.equals(qx1Var.m) && Intrinsics.a(this.n, qx1Var.n) && this.o == qx1Var.o;
    }

    public final int hashCode() {
        int iHashCode = this.m.hashCode() * 31;
        String str = this.n;
        return this.o.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "";
    }
}
