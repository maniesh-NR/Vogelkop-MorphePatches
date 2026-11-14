package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class xto {

    @NotNull
    public static final wto Companion = new wto();
    public final String a;
    public final String b;

    public xto(int i, String str, String str2) {
        if (1 != (i & 1)) {
            x7d.I(i, 1, vto.b);
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public xto(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xto)) {
            return false;
        }
        xto xtoVar = (xto) obj;
        return Intrinsics.a(this.a, xtoVar.a) && Intrinsics.a(this.b, xtoVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Publisher(id=");
        sb.append(this.a);
        sb.append(", name=");
        return o18.p(sb, this.b, ')');
    }
}
