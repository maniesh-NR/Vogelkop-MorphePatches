package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class s4l {

    @NotNull
    public static final r4l Companion = new r4l();
    public static final l4c[] c = {z4c.a(f7c.b, new thk((byte) 7)), null};
    public final List a;
    public final int b;

    public /* synthetic */ s4l(int i, int i2, List list) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, q4l.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = i2;
    }

    public s4l(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4l)) {
            return false;
        }
        s4l s4lVar = (s4l) obj;
        return Intrinsics.a(this.a, s4lVar.a) && this.b == s4lVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
