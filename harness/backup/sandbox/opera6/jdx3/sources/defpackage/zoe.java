package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class zoe {

    @NotNull
    public static final yoe Companion = new yoe();
    public final double a;
    public final String b;
    public final int c;

    public /* synthetic */ zoe(int i, int i2, String str, double d) {
        if (7 != (i & 7)) {
            x7d.I(i, 7, xoe.a.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoe)) {
            return false;
        }
        zoe zoeVar = (zoe) obj;
        return Double.compare(this.a, zoeVar.a) == 0 && Intrinsics.a(this.b, zoeVar.b) && this.c == zoeVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + z1m.f(Double.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
