package defpackage;

/* loaded from: classes.dex */
public final class bmi implements fmi {
    public final String a;

    public bmi(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof bmi) && this.a.equals(((bmi) obj).a);
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
