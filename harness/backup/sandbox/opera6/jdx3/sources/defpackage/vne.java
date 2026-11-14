package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class vne {

    @NotNull
    public static final une Companion = new une();
    public final String a;
    public final String b;

    public /* synthetic */ vne(int i, String str, String str2) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, tne.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vne)) {
            return false;
        }
        vne vneVar = (vne) obj;
        return Intrinsics.a(this.a, vneVar.a) && Intrinsics.a(this.b, vneVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
