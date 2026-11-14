package defpackage;

/* loaded from: classes.dex */
public final class um2 {
    public final int a;
    public final vm2 b;

    public um2(int i, vm2 vm2Var) {
        if (i == 0) {
            t3p.q("Null type");
            throw null;
        }
        this.a = i;
        this.b = vm2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof um2)) {
            return false;
        }
        um2 um2Var = (um2) obj;
        if (!vep.e(this.a, um2Var.a)) {
            return false;
        }
        vm2 vm2Var = um2Var.b;
        vm2 vm2Var2 = this.b;
        return vm2Var2 == null ? vm2Var == null : vm2Var2.equals(vm2Var);
    }

    public final int hashCode() {
        int iA = (vep.A(this.a) ^ 1000003) * 1000003;
        vm2 vm2Var = this.b;
        return iA ^ (vm2Var == null ? 0 : vm2Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraState{type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "CLOSING" : "OPEN" : "OPENING" : "PENDING_OPEN");
        sb.append(", error=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
