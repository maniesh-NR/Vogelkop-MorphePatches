package defpackage;

/* loaded from: classes.dex */
public final class mlm {
    public final boolean a;
    public final boolean b;

    public mlm(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlm)) {
            return false;
        }
        mlm mlmVar = (mlm) obj;
        return this.a == mlmVar.a && this.b == mlmVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
