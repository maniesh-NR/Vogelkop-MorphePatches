package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class x4p {

    @NotNull
    public static final w4p Companion = new w4p();
    public final int a;
    public final int b;
    public final String c;

    public x4p(int i, int i2, int i3, String str) {
        if (7 != (i & 7)) {
            x7d.I(i, 7, v4p.b);
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4p)) {
            return false;
        }
        x4p x4pVar = (x4p) obj;
        return this.a == x4pVar.a && this.b == x4pVar.b && Intrinsics.a(this.c, x4pVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rfp.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImpressionTracker(event=");
        sb.append(this.a);
        sb.append(", method=");
        sb.append(this.b);
        sb.append(", url=");
        return o18.p(sb, this.c, ')');
    }
}
