package defpackage;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class yvb {
    public static final byte[][] c = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 64);
    public final t87 a;
    public final int b;

    static {
        int i = 0;
        while (true) {
            byte[][] bArr = c;
            if (i == bArr.length) {
                return;
            }
            bArr[i][63] = (byte) i;
            i++;
        }
    }

    public yvb(q0 q0Var, int i) {
        this.a = x87.a(q0Var);
        this.b = i;
    }

    public final void a(int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = c[i];
        int i3 = this.b;
        vci vciVar = this.a;
        vciVar.g(64 - i3, i3, bArr4);
        vciVar.g(0, bArr.length, bArr);
        vciVar.g(0, bArr2.length, bArr2);
        if (vciVar instanceof vci) {
            vciVar.o(i2, i3, bArr3);
        } else {
            if (i3 >= vciVar.d()) {
                vciVar.e(i2, bArr3);
                return;
            }
            byte[] bArr5 = new byte[vciVar.d()];
            vciVar.e(0, bArr5);
            System.arraycopy(bArr5, 0, bArr3, i2, i3);
        }
    }
}
