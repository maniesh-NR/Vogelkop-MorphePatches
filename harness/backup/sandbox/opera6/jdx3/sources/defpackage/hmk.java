package defpackage;

/* loaded from: classes.dex */
public final class hmk {
    public final String a;
    public final String b;

    public hmk(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmk)) {
            return false;
        }
        hmk hmkVar = (hmk) obj;
        if (this.a.equals(hmkVar.a)) {
            return this.b.equals(hmkVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
