package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ljj {
    public final n54 a;
    public final n54 b;
    public final n54 c;

    public ljj(n54 n54Var, n54 n54Var2, n54 n54Var3) {
        this.a = n54Var;
        this.b = n54Var2;
        this.c = n54Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljj)) {
            return false;
        }
        ljj ljjVar = (ljj) obj;
        return this.a.equals(ljjVar.a) && this.b.equals(ljjVar.b) && this.c.equals(ljjVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c.a) + ((Arrays.hashCode(this.b.a) + (Arrays.hashCode(this.a.a) * 31)) * 31);
    }

    public final String toString() {
        return "SignatureData(v=" + this.a + ", r=" + this.b + ", s=" + this.c + ")";
    }
}
