package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n3e extends oua {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public n3e(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n3e.class != obj.getClass()) {
            return false;
        }
        n3e n3eVar = (n3e) obj;
        return this.b == n3eVar.b && this.c == n3eVar.c && this.d == n3eVar.d && Arrays.equals(this.e, n3eVar.e) && Arrays.equals(this.f, n3eVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
