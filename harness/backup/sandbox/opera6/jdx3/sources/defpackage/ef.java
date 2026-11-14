package defpackage;

/* loaded from: classes.dex */
public final class ef {
    public final df a;

    public ef(df dfVar) {
        this.a = dfVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ef) && this.a.equals(((ef) obj).a);
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
