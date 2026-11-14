package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class xb5 extends oua {
    public final String b;
    public final String c;
    public final String d;

    public xb5(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xb5.class != obj.getClass()) {
            return false;
        }
        xb5 xb5Var = (xb5) obj;
        return this.c.equals(xb5Var.c) && this.b.equals(xb5Var.b) && Objects.equals(this.d, xb5Var.d);
    }

    public final int hashCode() {
        int iF = z1m.f(z1m.f(527, 31, this.b), 31, this.c);
        String str = this.d;
        return iF + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.oua
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
