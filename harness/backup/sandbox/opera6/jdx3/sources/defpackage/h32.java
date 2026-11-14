package defpackage;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h32 {
    public final File a;
    public final ebb b;

    public h32(File file, ebb ebbVar) {
        this.a = file;
        this.b = ebbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h32)) {
            return false;
        }
        h32 h32Var = (h32) obj;
        return this.a.equals(h32Var.a) && Intrinsics.a(this.b, h32Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
