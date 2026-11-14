package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class xpd implements mod {
    public final bqd a;

    public xpd(bqd bqdVar) {
        this.a = bqdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != xpd.class) {
            return false;
        }
        return this.a.equals(((xpd) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
