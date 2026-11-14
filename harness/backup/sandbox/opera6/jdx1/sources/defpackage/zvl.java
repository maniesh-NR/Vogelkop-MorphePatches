package defpackage;

/* loaded from: classes.dex */
public final class zvl {
    public final long a;
    public final long b;
    public final int c;

    public zvl(long j, long j2, int i) {
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvl)) {
            return false;
        }
        zvl zvlVar = (zvl) obj;
        return this.a == zvlVar.a && this.b == zvlVar.b && this.c == zvlVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + z1m.e(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Topic { ".concat("TaxonomyVersion=" + this.a + ", ModelVersion=" + this.b + ", TopicCode=" + this.c + " }");
    }
}
