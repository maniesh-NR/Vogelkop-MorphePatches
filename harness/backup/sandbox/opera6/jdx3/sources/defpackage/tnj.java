package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class tnj extends ifd {
    public final File a;

    public tnj(File file) {
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof tnj) && this.a.equals(((tnj) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
