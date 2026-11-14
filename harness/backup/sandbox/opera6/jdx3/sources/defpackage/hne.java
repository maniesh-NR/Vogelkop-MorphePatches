package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class hne {

    @NotNull
    public static final gne Companion = new gne();
    public static final l4c[] c;
    public final List a;
    public final List b;

    static {
        f7c f7cVar = f7c.b;
        c = new l4c[]{z4c.a(f7cVar, new vme((byte) 5)), z4c.a(f7cVar, new vme((byte) 6))};
    }

    public /* synthetic */ hne(List list, List list2, int i) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, fne.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hne)) {
            return false;
        }
        hne hneVar = (hne) obj;
        return Intrinsics.a(this.a, hneVar.a) && Intrinsics.a(this.b, hneVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
