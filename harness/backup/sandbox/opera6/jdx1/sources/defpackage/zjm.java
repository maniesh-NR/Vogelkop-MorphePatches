package defpackage;

/* loaded from: classes.dex */
public final class zjm implements akm {
    public final g1b a;

    public zjm(g1b g1bVar) {
        this.a = g1bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof zjm) && this.a.equals(((zjm) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Visible(minAmounts=" + this.a + ")";
    }
}
