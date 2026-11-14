package defpackage;

/* loaded from: classes.dex */
public final class jwk {
    public final boolean a;
    public final boolean b;

    public jwk(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwk)) {
            return false;
        }
        jwk jwkVar = (jwk) obj;
        return this.a == jwkVar.a && this.b == jwkVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
