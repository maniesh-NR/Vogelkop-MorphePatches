package defpackage;

/* loaded from: classes.dex */
public final class mgc {
    public final int a;
    public final String b;

    public mgc(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgc)) {
            return false;
        }
        mgc mgcVar = (mgc) obj;
        return this.a == mgcVar.a && this.b.equals(mgcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
