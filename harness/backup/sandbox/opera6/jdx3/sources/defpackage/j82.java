package defpackage;

/* loaded from: classes.dex */
public abstract class j82 extends ia2 {
    public final oqe c;
    public final String d;
    public final boolean e;

    public j82(oqe oqeVar, String str, boolean z) {
        super((byte) 1);
        this.c = oqeVar;
        this.d = str;
        this.e = z;
    }

    @Override // defpackage.ia2
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            j82 j82Var = (j82) obj;
            if (this.c.equals(j82Var.c) && this.d.equals(j82Var.d) && this.e == j82Var.e) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ia2
    public final int hashCode() {
        return z1m.f((this.c.hashCode() + (getClass().hashCode() * 31)) * 31, 31, this.d) + (this.e ? 1 : 0);
    }
}
