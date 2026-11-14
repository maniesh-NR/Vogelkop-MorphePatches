package defpackage;

/* loaded from: classes.dex */
public final class t8f extends wxe {
    public final String m;

    public t8f(String str) {
        this.m = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof t8f) && this.m.equals(((t8f) obj).m);
        }
        return true;
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final String toString() {
        return "";
    }
}
