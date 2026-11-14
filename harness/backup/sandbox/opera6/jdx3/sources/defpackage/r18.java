package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class r18 {
    public final p28 a;
    public final byte[] b;

    public r18(p28 p28Var, byte[] bArr) {
        if (p28Var == null) {
            t3p.q("encoding is null");
            throw null;
        }
        if (bArr == null) {
            t3p.q("bytes is null");
            throw null;
        }
        this.a = p28Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r18)) {
            return false;
        }
        r18 r18Var = (r18) obj;
        if (this.a.equals(r18Var.a)) {
            return Arrays.equals(this.b, r18Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
