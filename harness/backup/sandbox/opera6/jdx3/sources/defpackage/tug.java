package defpackage;

/* loaded from: classes.dex */
public final class tug {
    public final boolean a;

    public tug(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof tug) && this.a == ((tug) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
