package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class kua implements jxd {
    public final byte[] a;
    public final String b;
    public final String c;

    public kua(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.jxd
    public final void b(ujd ujdVar) {
        String str = this.b;
        if (str != null) {
            ujdVar.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kua.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((kua) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return p3p.k(this.a.length, "\"", z1m.n("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""));
    }
}
