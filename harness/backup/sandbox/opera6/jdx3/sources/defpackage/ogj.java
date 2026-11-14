package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class ogj {

    @NotNull
    public static final ngj Companion = new ngj();
    public final String a;
    public final long b;

    public /* synthetic */ ogj(int i, long j, String str) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, mgj.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j;
    }

    public ogj(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogj)) {
            return false;
        }
        ogj ogjVar = (ogj) obj;
        return Intrinsics.a(this.a, ogjVar.a) && this.b == ogjVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
