package defpackage;

/* loaded from: classes.dex */
public final class w7f extends y7f {
    public final Throwable a;

    public w7f(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof w7f) && this.a.equals(((w7f) obj).a);
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
