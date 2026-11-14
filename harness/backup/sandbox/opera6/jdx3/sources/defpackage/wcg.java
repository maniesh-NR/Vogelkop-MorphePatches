package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class wcg {

    @NotNull
    public static final vcg Companion = new vcg();
    public final String a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ wcg(int i, String str, boolean z, boolean z2) {
        if (7 != (i & 7)) {
            x7d.I(i, 7, ucg.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public wcg(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcg)) {
            return false;
        }
        wcg wcgVar = (wcg) obj;
        return Intrinsics.a(this.a, wcgVar.a) && this.b == wcgVar.b && this.c == wcgVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + fki.k(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
