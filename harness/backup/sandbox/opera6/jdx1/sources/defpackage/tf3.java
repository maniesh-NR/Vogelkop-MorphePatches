package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class tf3 extends oua {
    public final byte[] b;

    public tf3(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tf3.class != obj.getClass()) {
            return false;
        }
        tf3 tf3Var = (tf3) obj;
        return this.a.equals(tf3Var.a) && Arrays.equals(this.b, tf3Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + z1m.f(527, 31, this.a);
    }
}
