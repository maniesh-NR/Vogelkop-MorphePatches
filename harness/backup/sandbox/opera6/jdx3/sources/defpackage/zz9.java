package defpackage;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zz9 implements b0a {
    public final String a;
    public final File b;
    public final o29 c;

    public zz9(o29 o29Var, File file, String str) {
        this.a = str;
        this.b = file;
        this.c = o29Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz9)) {
            return false;
        }
        zz9 zz9Var = (zz9) obj;
        return Intrinsics.a(this.a, zz9Var.a) && Intrinsics.a(this.b, zz9Var.b) && this.c == zz9Var.c;
    }

    @Override // defpackage.b0a
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        File file = this.b;
        return this.c.hashCode() + ((iHashCode + (file == null ? 0 : file.hashCode())) * 31);
    }

    public final String toString() {
        return "";
    }
}
