package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class gtc {
    public final long a;
    public final float b;
    public final long c;

    public gtc(ftc ftcVar) {
        this.a = ftcVar.a;
        this.b = ftcVar.b;
        this.c = ftcVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtc)) {
            return false;
        }
        gtc gtcVar = (gtc) obj;
        return this.a == gtcVar.a && this.b == gtcVar.b && this.c == gtcVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
