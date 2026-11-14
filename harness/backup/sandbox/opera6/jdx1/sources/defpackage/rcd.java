package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final class rcd {
    public final Pair a;

    public rcd(Pair pair) {
        this.a = pair;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != rcd.class) {
            return false;
        }
        return this.a.equals(((rcd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
