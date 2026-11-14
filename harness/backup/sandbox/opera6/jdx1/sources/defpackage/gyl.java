package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class gyl {
    public final byte a;
    public final byte[] b;
    public final int c;
    public final int d;

    /* JADX WARN: Multi-variable type inference failed */
    public gyl(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gyl.class != obj.getClass()) {
            return false;
        }
        gyl gylVar = (gyl) obj;
        return this.a == gylVar.a && this.c == gylVar.c && this.d == gylVar.d && Arrays.equals(this.b, gylVar.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
