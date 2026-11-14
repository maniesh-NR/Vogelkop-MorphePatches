package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jo1 extends oua {
    public final String b;
    public final String c;
    public final short d;
    public final byte[] e;

    /* JADX WARN: Multi-variable type inference failed */
    public jo1(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // defpackage.jxd
    public final void b(ujd ujdVar) {
        ujdVar.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jo1.class != obj.getClass()) {
            return false;
        }
        jo1 jo1Var = (jo1) obj;
        return this.d == jo1Var.d && this.b.equals(jo1Var.b) && Objects.equals(this.c, jo1Var.c) && Arrays.equals(this.e, jo1Var.e);
    }

    public final int hashCode() {
        int iF = z1m.f((527 + this.d) * 31, 31, this.b);
        String str = this.c;
        return Arrays.hashCode(this.e) + ((iF + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.oua
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
