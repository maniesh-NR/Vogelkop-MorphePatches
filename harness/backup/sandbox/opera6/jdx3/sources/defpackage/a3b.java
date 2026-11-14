package defpackage;

/* loaded from: classes.dex */
public final class a3b extends x2b {
    public final y2b a;

    public a3b(y2b y2bVar) {
        this.a = y2bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a3b) && this.a == ((a3b) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
