package defpackage;

/* loaded from: classes.dex */
public final class omi implements pmi {
    public final long a;

    public omi(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof omi) && pn7.e(this.a, ((omi) obj).a);
    }

    public final int hashCode() {
        on7 on7Var = pn7.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
