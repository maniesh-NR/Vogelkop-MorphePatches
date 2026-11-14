package defpackage;

/* loaded from: classes.dex */
public final class ebn extends hbn {
    public final String a;

    public ebn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ebn) && this.a.equals(((ebn) obj).a);
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
