package defpackage;

/* loaded from: classes.dex */
public final class xyj extends bzj {
    public final String a;

    public xyj(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof xyj) && this.a.equals(((xyj) obj).a);
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
