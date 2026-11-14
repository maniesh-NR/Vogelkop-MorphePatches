package defpackage;

/* loaded from: classes.dex */
public final class yqj {
    public final wv a;
    public final wv b;

    public yqj(wv wvVar, wv wvVar2) {
        this.a = wvVar;
        this.b = wvVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqj)) {
            return false;
        }
        yqj yqjVar = (yqj) obj;
        return this.a.equals(yqjVar.a) && this.b.equals(yqjVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "SmartContractAddresses(sortedOracles=" + this.a + ", federatedAttestationsProxy=" + this.b + ")";
    }
}
