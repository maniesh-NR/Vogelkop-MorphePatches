package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class y10 {
    public static final List b = Arrays.asList(new y10(0), new y10(1), new y10(2), new y10(3), new y10(4), new y10(5), new y10(6));
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ y10(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y10) {
            return this.a == ((y10) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fki.r("AeMode(value=", this.a, ')');
    }
}
