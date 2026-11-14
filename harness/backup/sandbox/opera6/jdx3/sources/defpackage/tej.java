package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class tej {

    @NotNull
    public static final sej Companion = new sej();
    public final String a;
    public final String b;

    public /* synthetic */ tej(int i, String str, String str2) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, rej.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tej)) {
            return false;
        }
        tej tejVar = (tej) obj;
        return Intrinsics.a(this.a, tejVar.a) && Intrinsics.a(this.b, tejVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
