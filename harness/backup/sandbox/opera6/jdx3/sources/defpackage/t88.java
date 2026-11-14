package defpackage;

/* loaded from: classes.dex */
public final class t88 {
    public final String a;

    public t88(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof t88) && this.a.equals(((t88) obj).a);
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
