package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class nw0 implements qw0 {
    public final File a;
    public final o29 b;

    public nw0(File file, o29 o29Var) {
        this.a = file;
        this.b = o29Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw0)) {
            return false;
        }
        nw0 nw0Var = (nw0) obj;
        return this.a.equals(nw0Var.a) && this.b == nw0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
