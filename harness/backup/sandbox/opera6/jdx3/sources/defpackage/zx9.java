package defpackage;

/* loaded from: classes.dex */
public final class zx9 implements dy9 {
    public final Exception a;

    public zx9(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof zx9) && this.a.equals(((zx9) obj).a);
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
