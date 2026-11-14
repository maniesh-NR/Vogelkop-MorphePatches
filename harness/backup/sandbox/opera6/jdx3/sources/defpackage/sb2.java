package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class sb2 {

    @NotNull
    public static final rb2 Companion = new rb2();
    public static final l4c[] c;
    public final List a;
    public final xb2 b;

    static {
        wb2 wb2Var = xb2.Companion;
        c = new l4c[]{z4c.a(f7c.b, new vk1((byte) 18)), null};
    }

    public sb2(int i, List list, xb2 xb2Var) {
        this.a = (i & 1) == 0 ? l08.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = xb2Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb2)) {
            return false;
        }
        sb2 sb2Var = (sb2) obj;
        return Intrinsics.a(this.a, sb2Var.a) && Intrinsics.a(this.b, sb2Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xb2 xb2Var = this.b;
        return iHashCode + (xb2Var == null ? 0 : xb2Var.hashCode());
    }

    public final String toString() {
        return "";
    }
}
