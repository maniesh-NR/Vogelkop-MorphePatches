package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class o79 {
    public static final List b = Arrays.asList(new o79(0), new o79(1), new o79(2));
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ o79(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o79) {
            return this.a == ((o79) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fki.r("FlashMode(value=", this.a, ')');
    }
}
