package defpackage;

/* loaded from: classes.dex */
public final class p28 {
    public final String a;

    public p28(String str) {
        if (str != null) {
            this.a = str;
        } else {
            t3p.q("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p28)) {
            return false;
        }
        return this.a.equals(((p28) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return z1m.l(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
