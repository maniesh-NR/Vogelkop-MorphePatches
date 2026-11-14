package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class gfj {

    @NotNull
    public static final ffj Companion = new ffj();
    public final String a;
    public final String b;

    public /* synthetic */ gfj(int i, String str, String str2) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, efj.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfj)) {
            return false;
        }
        gfj gfjVar = (gfj) obj;
        return Intrinsics.a(this.a, gfjVar.a) && Intrinsics.a(this.b, gfjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
