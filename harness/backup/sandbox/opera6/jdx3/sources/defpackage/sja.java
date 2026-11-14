package defpackage;

/* loaded from: classes.dex */
public final class sja {
    public final rja a;

    public sja(rja rjaVar) {
        this.a = rjaVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof sja) && this.a == ((sja) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AuthenticationV1LoginErrorErrorData(reason=, codes=" + this.a + ")";
    }
}
