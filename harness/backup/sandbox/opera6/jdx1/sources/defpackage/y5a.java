package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class y5a {
    public static final byte[] f = {0, 0, 1};
    public boolean a;
    public byte b;
    public int c;
    public int d;
    public byte[] e;

    public final void a(byte[] bArr, int i, int i2) {
        if (this.a) {
            int i3 = i2 - i;
            byte[] bArrCopyOf = this.e;
            int length = bArrCopyOf.length;
            int i4 = this.c + i3;
            if (length < i4) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i4 << 1);
                this.e = bArrCopyOf;
            }
            System.arraycopy(bArr, i, bArrCopyOf, this.c, i3);
            this.c += i3;
        }
    }
}
