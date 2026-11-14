package defpackage;

/* loaded from: classes.dex */
public final class wae implements jxd {
    public final int a;

    public wae(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wae) && this.a == ((wae) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.a;
    }
}
