package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class so {
    public static final String d;
    public static final String e;
    public static final String f;
    public final long a;
    public final long b;
    public final String c;

    static {
        String str = tym.a;
        d = "0";
        e = "1";
        f = "2";
    }

    public so(long j, long j2, String str) {
        z4o.w((j == -9223372036854775807L && j2 == -9223372036854775807L && str == null) ? false : true);
        this.a = j == -9223372036854775807L ? 0L : j;
        this.b = j2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && so.class == obj.getClass()) {
            so soVar = (so) obj;
            if (this.a == soVar.a && this.b == soVar.b && Objects.equals(this.c, soVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), this.c);
    }
}
