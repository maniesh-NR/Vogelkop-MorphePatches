package defpackage;

import android.util.Size;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class w5a {
    public static final byte[] e = {0, 0, 1};
    public int a = -1;
    public int b = -1;
    public boolean c = false;
    public Serializable d;

    /* JADX WARN: Multi-variable type inference failed */
    public w5a(j3... j3VarArr) {
        this.d = j3VarArr;
    }

    public final Size a(hya hyaVar) {
        int iU = hyaVar.u(0);
        Size size = (Size) hyaVar.b(hya.pp, null);
        int i = this.b;
        int i2 = this.a;
        if (size != null) {
            int iM = kfo.M(kfo.f0(iU), i2, 1 == i);
            if (iM == 90 || iM == 270) {
                return new Size(size.getHeight(), size.getWidth());
            }
        }
        return size;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [byte[], java.io.Serializable] */
    public final void b(byte[] bArr, int i, int i2) {
        if (this.c) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.d;
            int length = bArr2.length;
            int i4 = this.a + i3;
            byte[] bArr3 = bArr2;
            if (length < i4) {
                ?? CopyOf = Arrays.copyOf(bArr2, i4 << 1);
                this.d = CopyOf;
                bArr3 = CopyOf;
            }
            System.arraycopy(bArr, i, bArr3, this.a, i3);
            this.a += i3;
        }
    }
}
