package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class gw2 {
    public static final List b = Arrays.asList(new gw2(0), new gw2(1), new gw2(6), new gw2(5), new gw2(2), new gw2(3), new gw2(8), new gw2(7));
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gw2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gw2) {
            return this.a == ((gw2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fki.r("AwbMode(value=", this.a, ')');
    }
}
