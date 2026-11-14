package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class g06 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof g06) {
            return this.a.equals(((g06) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ")";
    }
}
