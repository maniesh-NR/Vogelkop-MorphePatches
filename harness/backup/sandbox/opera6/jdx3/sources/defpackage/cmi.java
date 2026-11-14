package defpackage;

/* loaded from: classes.dex */
public final class cmi implements fmi {
    public final String a;
    public final int b;

    public cmi(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmi)) {
            return false;
        }
        cmi cmiVar = (cmi) obj;
        return this.a.equals(cmiVar.a) && this.b == cmiVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
