package defpackage;

/* loaded from: classes.dex */
public final class cjm {
    public final int a;
    public final boolean b;

    public cjm(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjm)) {
            return false;
        }
        cjm cjmVar = (cjm) obj;
        return this.a == cjmVar.a && this.b == cjmVar.b;
    }

    public final int hashCode() {
        return ((Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31)) * 31) + 4099;
    }

    public final String toString() {
        return "";
    }
}
