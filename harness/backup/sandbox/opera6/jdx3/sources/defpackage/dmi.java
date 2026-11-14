package defpackage;

/* loaded from: classes.dex */
public final class dmi implements fmi {
    public final String a;

    public dmi(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof dmi) && this.a.equals(((dmi) obj).a);
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
