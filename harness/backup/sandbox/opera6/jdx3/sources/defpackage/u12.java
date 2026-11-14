package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class u12 extends o0g {
    public final File i;
    public final File j;

    public u12(File file, File file2) {
        this.i = file;
        this.j = file2;
    }

    public final File V() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u12)) {
            return false;
        }
        u12 u12Var = (u12) obj;
        return this.i.equals(u12Var.i) && this.j.equals(u12Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + (this.i.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
