package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class mfj {

    @NotNull
    public static final lfj Companion = new lfj();
    public static final l4c[] c;
    public final List a;
    public final List b;

    static {
        f7c f7cVar = f7c.b;
        c = new l4c[]{z4c.a(f7cVar, new gzh((byte) 26)), z4c.a(f7cVar, new gzh((byte) 27))};
    }

    public mfj(List list, List list2, int i) {
        this.a = (i & 1) == 0 ? l08.a : list;
        if ((i & 2) == 0) {
            this.b = l08.a;
        } else {
            this.b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfj)) {
            return false;
        }
        mfj mfjVar = (mfj) obj;
        return Intrinsics.a(this.a, mfjVar.a) && Intrinsics.a(this.b, mfjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
