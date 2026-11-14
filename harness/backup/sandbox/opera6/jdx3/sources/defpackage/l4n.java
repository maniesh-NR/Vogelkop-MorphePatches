package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l4n {
    public static final l4n c = new l4n(-1, -1);
    public final long a;
    public final long b;

    public l4n(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l4n.class != obj.getClass()) {
            return false;
        }
        l4n l4nVar = (l4n) obj;
        return this.a == l4nVar.a && this.b == l4nVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
    }
}
