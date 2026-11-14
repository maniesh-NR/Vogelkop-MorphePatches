package defpackage;

/* loaded from: classes.dex */
public final class msc extends lh9 {
    public final u59 c;

    public msc(u59 u59Var) {
        this.c = u59Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof msc) {
            return this.c == ((msc) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.c + ")";
    }
}
