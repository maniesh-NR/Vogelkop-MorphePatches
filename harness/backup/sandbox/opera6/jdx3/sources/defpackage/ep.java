package defpackage;

/* loaded from: classes.dex */
public final class ep {
    public static final long d;
    public final boolean a;
    public final boolean b;
    public final long c;

    static {
        on7 on7Var = pn7.b;
        d = cs5.x0(20, un7.e);
    }

    public ep(long j, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep)) {
            return false;
        }
        ep epVar = (ep) obj;
        return this.a == epVar.a && this.b == epVar.b && this.c == epVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + fki.k(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
