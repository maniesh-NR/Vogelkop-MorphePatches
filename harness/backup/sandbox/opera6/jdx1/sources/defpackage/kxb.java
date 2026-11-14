package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class kxb {
    public final int a = 398591036;
    public final Integer b = 5;
    public final Set c;
    public final fza d;

    public kxb(Set set, fza fzaVar) {
        this.c = set;
        this.d = fzaVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kxb) && ((long) this.a) == ((long) ((kxb) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        Integer num = this.b;
        if (num == null) {
            return j + " without alias";
        }
        return j + " with alias " + num.intValue();
    }
}
