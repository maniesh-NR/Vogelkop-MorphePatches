package defpackage;

import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class mqj {
    public final long a;
    public final long b;
    public final int c;

    public mqj(long j, long j2, int i) {
        z4o.w(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mqj.class == obj.getClass()) {
            mqj mqjVar = (mqj) obj;
            if (this.a == mqjVar.a && this.b == mqjVar.b && this.c == mqjVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = tym.a;
        Locale locale = Locale.US;
        StringBuilder sbQ = p3p.q(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        sbQ.append(this.b);
        sbQ.append(", speedDivisor=");
        sbQ.append(this.c);
        return sbQ.toString();
    }
}
