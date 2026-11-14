package defpackage;

/* loaded from: classes.dex */
public final class mol implements jxd {
    public final long a;

    public mol(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && mol.class == obj.getClass() && this.a == ((mol) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.a;
    }
}
