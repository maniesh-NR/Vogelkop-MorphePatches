package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zs4 extends oua {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final oua[] f;

    public zs4(String str, boolean z, boolean z2, String[] strArr, oua[] ouaVarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = ouaVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zs4.class != obj.getClass()) {
            return false;
        }
        zs4 zs4Var = (zs4) obj;
        return this.c == zs4Var.c && this.d == zs4Var.d && this.b.equals(zs4Var.b) && Arrays.equals(this.e, zs4Var.e) && Arrays.equals(this.f, zs4Var.f);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
