package defpackage;

/* loaded from: classes.dex */
public final class jo2 {
    public final s1h a;
    public final qya b;

    public jo2(s1h s1hVar, qya qyaVar) {
        if (s1hVar == null) {
            t3p.q("Null processingRequest");
            throw null;
        }
        this.a = s1hVar;
        this.b = qyaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jo2)) {
            return false;
        }
        jo2 jo2Var = (jo2) obj;
        return this.a.equals(jo2Var.a) && this.b.equals(jo2Var.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.a + ", imageProxy=" + this.b + "}";
    }
}
