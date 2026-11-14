package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class wij {
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;

    public wij(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wij.class != obj.getClass()) {
            return false;
        }
        wij wijVar = (wij) obj;
        if (Arrays.equals(this.a, wijVar.a) && Arrays.equals(this.b, wijVar.b)) {
            return Arrays.equals(this.c, wijVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31)) * 31);
    }
}
