package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class k4p {

    @NotNull
    public static final j4p Companion = new j4p();
    public final Integer a;
    public final String b;

    public k4p(int i, String str, Integer num) {
        if (2 != (i & 2)) {
            x7d.I(i, 2, i4p.b);
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = num;
        }
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4p)) {
            return false;
        }
        k4p k4pVar = (k4p) obj;
        return Intrinsics.a(this.a, k4pVar.a) && Intrinsics.a(this.b, k4pVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(type=");
        sb.append(this.a);
        sb.append(", value=");
        return o18.p(sb, this.b, ')');
    }
}
