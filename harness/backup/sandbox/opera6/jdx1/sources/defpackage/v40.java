package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class v40 {
    public static final List b = Arrays.asList(new v40(0), new v40(1), new v40(2), new v40(3), new v40(4), new v40(5));
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ v40(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v40) {
            return this.a == ((v40) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fki.r("AfMode(value=", this.a, ')');
    }
}
