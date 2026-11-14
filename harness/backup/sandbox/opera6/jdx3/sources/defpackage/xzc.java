package defpackage;

/* loaded from: classes.dex */
public final class xzc extends z5i {
    public final String x;

    public xzc(String str) {
        this.x = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof xzc) && this.x.equals(((xzc) obj).x);
        }
        return true;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final String toString() {
        return "";
    }
}
