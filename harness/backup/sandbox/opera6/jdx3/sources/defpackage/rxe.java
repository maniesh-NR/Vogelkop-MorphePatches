package defpackage;

/* loaded from: classes.dex */
public final class rxe {
    public final boolean a;
    public final String b;

    public rxe(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxe)) {
            return false;
        }
        rxe rxeVar = (rxe) obj;
        return this.a == rxeVar.a && this.b.equals(rxeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
