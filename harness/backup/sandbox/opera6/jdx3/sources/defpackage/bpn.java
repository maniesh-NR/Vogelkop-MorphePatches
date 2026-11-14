package defpackage;

/* loaded from: classes.dex */
public final class bpn implements dpn {
    public final boolean a;
    public final op0 b;

    public bpn(boolean z, op0 op0Var) {
        this.a = z;
        this.b = op0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bpn) {
            bpn bpnVar = (bpn) obj;
            return this.a == bpnVar.a && this.b == bpnVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
