package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class wyg extends oua {
    public final String b;
    public final byte[] c;

    public wyg(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wyg.class != obj.getClass()) {
            return false;
        }
        wyg wygVar = (wyg) obj;
        return this.b.equals(wygVar.b) && Arrays.equals(this.c, wygVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + z1m.f(527, 31, this.b);
    }

    @Override // defpackage.oua
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
