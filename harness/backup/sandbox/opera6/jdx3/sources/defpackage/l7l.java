package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class l7l {

    @NotNull
    public static final k7l Companion = new k7l();
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final float e;

    public /* synthetic */ l7l(int i, String str, int i2, int i3, boolean z, float f) {
        if (31 != (i & 31)) {
            x7d.I(i, 31, j7l.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = f;
    }

    public l7l(String str, int i, int i2, boolean z, float f) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7l)) {
            return false;
        }
        l7l l7lVar = (l7l) obj;
        return Intrinsics.a(this.a, l7lVar.a) && this.b == l7lVar.b && this.c == l7lVar.c && this.d == l7lVar.d && Float.compare(this.e, l7lVar.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + fki.k(rfp.c(this.c, rfp.c(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        return "";
    }
}
