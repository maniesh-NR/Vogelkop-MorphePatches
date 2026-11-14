package defpackage;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a0a implements b0a {
    public final String a;
    public final File b;
    public final o29 c;
    public final String d;

    public a0a(String str, File file, o29 o29Var, String str2) {
        this.a = str;
        this.b = file;
        this.c = o29Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0a)) {
            return false;
        }
        a0a a0aVar = (a0a) obj;
        return Intrinsics.a(this.a, a0aVar.a) && this.b.equals(a0aVar.b) && this.c == a0aVar.c && Intrinsics.a(this.d, a0aVar.d);
    }

    @Override // defpackage.b0a
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "";
    }
}
