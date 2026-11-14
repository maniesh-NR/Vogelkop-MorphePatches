package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class gjg {
    public static final gjg c = new gjg(false, false);
    public static final String d;
    public static final String e;
    public final boolean a;
    public final boolean b;

    static {
        String str = tym.a;
        d = "0";
        e = "1";
    }

    public gjg(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjg)) {
            return false;
        }
        gjg gjgVar = (gjg) obj;
        return this.a == gjgVar.a && this.b == gjgVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }
}
