package defpackage;

/* loaded from: classes.dex */
public final class sta {
    public final int a;
    public final int b;

    public sta(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sta)) {
            return false;
        }
        sta staVar = (sta) obj;
        return this.a == staVar.a && this.b == staVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
