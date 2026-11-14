package defpackage;

/* loaded from: classes.dex */
public final class d8h implements e8h {
    public final zf a;

    public d8h(zf zfVar) {
        this.a = zfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d8h) && this.a == ((d8h) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(activeCamera=" + this.a + ')';
    }
}
