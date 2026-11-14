package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class a5p {

    @NotNull
    public static final z4p Companion = new z4p();
    public static final KSerializer[] d = {null, null, new k72(xhk.a, (byte) 0)};
    public final String a;
    public final String b;
    public final List c;

    public a5p(int i, String str, String str2, List list) {
        if (1 != (i & 1)) {
            x7d.I(i, 1, y4p.b);
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5p)) {
            return false;
        }
        a5p a5pVar = (a5p) obj;
        return Intrinsics.a(this.a, a5pVar.a) && Intrinsics.a(this.b, a5pVar.b) && Intrinsics.a(this.c, a5pVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "Link(landingUrl=" + this.a + ", fallbackUrl=" + this.b + ", clickTrackers=" + this.c + ')';
    }
}
