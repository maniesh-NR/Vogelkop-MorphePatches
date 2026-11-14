package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ood {
    public final h1b a;
    public final int b;
    public final long c;

    public ood(int i, List list, long j) {
        this.a = h1b.s(list);
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ood)) {
            return false;
        }
        ood oodVar = (ood) obj;
        return this.a.equals(oodVar.a) && this.b == oodVar.b && this.c == oodVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
