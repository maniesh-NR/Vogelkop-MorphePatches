package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class qhc {
    public final al3 a;
    public final int b;

    public qhc(al3 al3Var, int i) {
        this.a = al3Var;
        this.b = i;
    }

    public static qhc b(al3 al3Var) {
        return (al3Var.g() && alo.S((ml3) al3Var)) ? new qhc(al3Var, 3) : (al3Var.g() && alo.T((ml3) al3Var)) ? new qhc(al3Var, 4) : new qhc(al3Var, 1);
    }

    public final boolean a() {
        int i = this.b;
        return i == 1 || i == 3 || i == 4;
    }

    public final int c() {
        int i = this.b;
        if (i == 6) {
            return 1;
        }
        if (i == 7) {
            return 4;
        }
        if (i == 8) {
            return 5;
        }
        if (i == 9) {
            return 6;
        }
        return this.a.g() ? 2 : 3;
    }

    public final String d(Resources resources) {
        if (this.b == 2) {
            return resources.getString(2132018067);
        }
        al3 al3Var = this.a;
        return al3Var.g() ? alo.J((ml3) al3Var, resources) : alo.K((pl3) al3Var);
    }

    public final String e() {
        if (this.b != 2) {
            al3 al3Var = this.a;
            if (!al3Var.g()) {
                String str = (String) ((pl3) al3Var).getUrl().b;
                String[] strArr = aik.a;
                return str == null ? "" : str;
            }
        }
        return "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhc)) {
            return false;
        }
        qhc qhcVar = (qhc) obj;
        return this.b == qhcVar.b && this.a.getId() == qhcVar.a.getId();
    }

    public final int hashCode() {
        return this.a.hashCode() + (vep.A(this.b) * 31);
    }
}
