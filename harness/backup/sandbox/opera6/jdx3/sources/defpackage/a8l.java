package defpackage;

/* loaded from: classes.dex */
public final class a8l extends b8l {
    public final m7l a;

    public a8l(m7l m7lVar) {
        this.a = m7lVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a8l) && this.a.equals(((a8l) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
