package defpackage;

import java.time.ZoneId;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class ypl {
    public static final h69 b;
    public final ZoneId a;

    static {
        wxm.Companion.getClass();
        b = new h69(ZoneId.of("UTC"));
    }

    public ypl(ZoneId zoneId) {
        this.a = zoneId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ypl) {
            return Intrinsics.a(this.a, ((ypl) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
