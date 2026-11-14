package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class dp2 {
    public final String a;
    public final byte[] b;
    public final myg c;

    public dp2(String str, byte[] bArr, myg mygVar) {
        this.a = str;
        this.b = bArr;
        this.c = mygVar;
    }

    public static l45 a() {
        l45 l45Var = new l45();
        l45Var.c = myg.a;
        return l45Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dp2) {
            dp2 dp2Var = (dp2) obj;
            if (this.a.equals(dp2Var.a) && Arrays.equals(this.b, dp2Var.b) && this.c.equals(dp2Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return z1m.l(sb, strEncodeToString, ")");
    }
}
