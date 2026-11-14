package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xv9 extends oua {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public xv9(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xv9.class != obj.getClass()) {
            return false;
        }
        xv9 xv9Var = (xv9) obj;
        return Objects.equals(this.b, xv9Var.b) && this.c.equals(xv9Var.c) && this.d.equals(xv9Var.d) && Arrays.equals(this.e, xv9Var.e);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.e) + z1m.f(z1m.f((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    @Override // defpackage.oua
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }
}
