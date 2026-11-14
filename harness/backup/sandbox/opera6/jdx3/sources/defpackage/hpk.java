package defpackage;

/* loaded from: classes.dex */
public final class hpk {
    public final String a;
    public final int b;

    public hpk(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpk)) {
            return false;
        }
        hpk hpkVar = (hpk) obj;
        if (this.b != hpkVar.b) {
            return false;
        }
        return this.a.equals(hpkVar.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
