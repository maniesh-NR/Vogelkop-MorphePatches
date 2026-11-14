package defpackage;

/* loaded from: classes.dex */
public final class u8a {
    public final m4l a;
    public final int b;

    static {
        l4l l4lVar = m4l.Companion;
    }

    public u8a(m4l m4lVar, int i) {
        this.a = m4lVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8a)) {
            return false;
        }
        u8a u8aVar = (u8a) obj;
        return this.a.equals(u8aVar.a) && this.b == u8aVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
