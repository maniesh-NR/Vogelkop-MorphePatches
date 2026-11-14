package defpackage;

/* loaded from: classes.dex */
public final class pxe {
    public final boolean a;
    public final boolean b;
    public final String c;

    public pxe(boolean z, boolean z2, String str) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxe)) {
            return false;
        }
        pxe pxeVar = (pxe) obj;
        return this.a == pxeVar.a && this.b == pxeVar.b && this.c.equals(pxeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + fki.k(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
