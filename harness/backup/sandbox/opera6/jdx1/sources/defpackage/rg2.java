package defpackage;

/* loaded from: classes.dex */
public final class rg2 {
    public static final rg2 d = new ukh((byte) 1).a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public rg2(ukh ukhVar) {
        this.a = ukhVar.b;
        this.b = ukhVar.c;
        this.c = ukhVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rg2.class != obj.getClass()) {
            return false;
        }
        rg2 rg2Var = (rg2) obj;
        return this.a == rg2Var.a && this.b == rg2Var.b && this.c == rg2Var.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
