package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class zyl {

    @NotNull
    public static final yyl Companion = new yyl();
    public static final l4c[] c;
    public final ld8 a;
    public final List b;

    static {
        f7c f7cVar = f7c.b;
        c = new l4c[]{z4c.a(f7cVar, new thk((byte) 22)), z4c.a(f7cVar, new thk((byte) 23))};
    }

    public /* synthetic */ zyl(int i, ld8 ld8Var, List list) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, xyl.a.getDescriptor());
            throw null;
        }
        this.a = ld8Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyl)) {
            return false;
        }
        zyl zylVar = (zyl) obj;
        return this.a == zylVar.a && Intrinsics.a(this.b, zylVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
