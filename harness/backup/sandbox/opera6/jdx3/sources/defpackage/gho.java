package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class gho {

    @NotNull
    public static final dho Companion = new dho();
    public static final KSerializer[] c = {new k72(mho.a, (byte) 0), null};
    public final List a;
    public final String b;

    public gho(int i, List list, String str) {
        if (1 != (i & 1)) {
            x7d.I(i, 1, bho.b);
            throw null;
        }
        this.a = list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gho)) {
            return false;
        }
        gho ghoVar = (gho) obj;
        return Intrinsics.a(this.a, ghoVar.a) && Intrinsics.a(this.b, ghoVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bid(bid=");
        sb.append(this.a);
        sb.append(", seat=");
        return o18.p(sb, this.b, ')');
    }
}
