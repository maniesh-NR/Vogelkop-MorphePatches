package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g1g {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final u1b f = u1b.p(5, new Object[]{StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE});
    public static final AtomicBoolean g = new AtomicBoolean();
    public byte[] a;
    public int b;
    public int c;

    public g1g() {
        this.a = tym.b;
    }

    public g1g(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public g1g(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public g1g(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    public static int b(int i, int i2, int i3, int i4) {
        byte b = (byte) i3;
        return sgb.C((byte) 0, fac.l(((i & 7) << 2) | ((i2 & 48) >> 4)), fac.l(((((byte) i2) & 15) << 4) | ((b & 60) >> 2)), fac.l(((b & 3) << 6) | (((byte) i4) & 63)));
    }

    public static int d(Charset charset) {
        z4o.y(f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean e(byte b) {
        return (b & 192) == 128;
    }

    public final int A() {
        f(1);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int B() {
        f(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        int i4 = i3 | (bArr[i2] & 255);
        this.b = i + 4;
        return i4;
    }

    public final long C() {
        f(4);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r3] & 255) << 16);
        this.b = i + 3;
        long j2 = j | ((bArr[r8] & 255) << 8);
        this.b = i + 4;
        return j2 | (bArr[r3] & 255);
    }

    public final int D() {
        f(3);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.b = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        this.b = i + 3;
        return i5 | (bArr[i4] & 255);
    }

    public final int E() {
        int iM = m();
        if (iM >= 0) {
            return iM;
        }
        qp2.n(sko.i(iM, "Top bit not zero: "));
        return 0;
    }

    public final int F() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.b == this.c) {
                qp2.n("Attempting to read a byte over the limit.");
                return 0;
            }
            long jA = A();
            j |= (127 & jA) << (i * 7);
            if ((jA & 128) == 0) {
                break;
            }
        }
        return sgb.l(j);
    }

    public final long G() {
        long jU = u();
        if (jU >= 0) {
            return jU;
        }
        qp2.n(p3p.l(jU, "Top bit not zero: "));
        return 0L;
    }

    public final int H() {
        f(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return i3 | (bArr[i2] & 255);
    }

    public final long I() {
        int i;
        f(1);
        long j = this.a[this.b];
        int i2 = 7;
        while (true) {
            if (i2 < 0) {
                break;
            }
            if (((1 << i2) & j) != 0) {
                i2--;
            } else if (i2 < 6) {
                j &= r6 - 1;
                i = 7 - i2;
            } else if (i2 == 7) {
                i = 1;
            }
        }
        i = 0;
        if (i == 0) {
            throw new NumberFormatException(p3p.l(j, "Invalid UTF-8 sequence first byte: "));
        }
        f(i);
        for (int i3 = 1; i3 < i; i3++) {
            if ((this.a[this.b + i3] & 192) != 128) {
                throw new NumberFormatException(p3p.l(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | (r4 & 63);
        }
        this.b += i;
        return j;
    }

    public final Charset J() {
        if (a() >= 3) {
            byte[] bArr = this.a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.a;
        int i2 = this.b;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.b = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.b = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void K(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        L(bArr, i);
    }

    public final void L(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void M(int i) {
        z4o.w(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public final void N(int i) {
        z4o.w(i >= 0 && i <= this.c);
        this.b = i;
    }

    public final void O(int i) {
        N(this.b + i);
    }

    public final int a() {
        return Math.max(this.c - this.b, 0);
    }

    public final void c(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public final void f(int i) {
        if (!g.get() || a() >= i) {
            return;
        }
        h9o.g(a(), p3p.o(i, "bytesNeeded= ", ", bytesLeft="));
    }

    public final char g(int i, ByteOrder byteOrder) {
        byte b;
        byte b2;
        f(2);
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.a;
        int i2 = this.b + i;
        if (byteOrder == byteOrder2) {
            b = bArr[i2];
            b2 = bArr[i2 + 1];
        } else {
            b = bArr[i2 + 1];
            b2 = bArr[i2];
        }
        return (char) ((b << 8) | (b2 & 255));
    }

    public final int h(Charset charset) {
        int codePoint;
        z4o.y(f.contains(charset), "Unsupported charset: %s", charset);
        if (a() < d(charset)) {
            s49.o("position=", this.b, this.c, ", limit=");
            return 0;
        }
        int i = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.a[this.b];
            if ((b & 128) == 0) {
                codePoint = Byte.toUnsignedInt(b);
                return (codePoint << 8) | i;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b2 = this.a[this.b];
            int i2 = (b2 & 128) == 0 ? 1 : ((b2 & 224) == 192 && a() >= 2 && e(this.a[this.b + 1])) ? 2 : ((this.a[this.b] & 240) == 224 && a() >= 3 && e(this.a[this.b + 1]) && e(this.a[this.b + 2])) ? 3 : ((this.a[this.b] & 248) == 240 && a() >= 4 && e(this.a[this.b + 1]) && e(this.a[this.b + 2]) && e(this.a[this.b + 3])) ? 4 : 0;
            if (i2 == 1) {
                codePoint = Byte.toUnsignedInt(this.a[this.b]);
            } else if (i2 == 2) {
                byte[] bArr = this.a;
                int i3 = this.b;
                codePoint = b(0, 0, bArr[i3], bArr[i3 + 1]);
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        byte[] bArr2 = this.a;
                        int i4 = this.b;
                        codePoint = b(bArr2[i4], bArr2[i4 + 1], bArr2[i4 + 2], bArr2[i4 + 3]);
                    }
                    return 0;
                }
                byte[] bArr3 = this.a;
                int i5 = this.b;
                codePoint = b(0, bArr3[i5] & 15, bArr3[i5 + 1], bArr3[i5 + 2]);
            }
            i = i2;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cG = g(0, byteOrder);
            if (!Character.isHighSurrogate(cG) || a() < 4) {
                codePoint = cG;
                i = 2;
            } else {
                codePoint = Character.toCodePoint(cG, g(2, byteOrder));
                i = 4;
            }
        }
        return (codePoint << 8) | i;
    }

    public final int i() {
        if (a() < 4) {
            s49.o("position=", this.b, this.c, ", limit=");
            return 0;
        }
        int iM = m();
        this.b -= 4;
        return iM;
    }

    public final int j() {
        f(1);
        return this.a[this.b] & 255;
    }

    public final void k(byte[] bArr, int i, int i2) {
        f(i2);
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final char l(Charset charset, char[] cArr) {
        int iH;
        if (a() >= d(charset) && (iH = h(charset)) != 0) {
            long j = iH >>> 8;
            z4o.u(j, (j >> 32) == 0, "out of range: %s");
            int i = (int) j;
            if (!Character.isSupplementaryCodePoint(i)) {
                long j2 = i;
                char c = (char) j2;
                z4o.u(j2, ((long) c) == j2, "Out of range: %s");
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.b = sgb.l(iH & 255) + this.b;
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int m() {
        f(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.b = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 16);
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.b = i + 4;
        return i7 | (bArr[i6] & 255);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String n(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            u1b r0 = defpackage.g1g.f
            boolean r0 = r0.contains(r5)
            java.lang.String r1 = "Unsupported charset: %s"
            defpackage.z4o.y(r0, r1, r5)
            int r0 = r4.a()
            r1 = 0
            if (r0 != 0) goto L13
            return r1
        L13:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r2 = r5.equals(r0)
            if (r2 != 0) goto L1e
            r4.J()
        L1e:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L4c
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L4c
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L4a
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L4a
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L4a
            java.lang.String r4 = "Unsupported charset: "
            s49.l(r5, r4)
            return r1
        L4a:
            r0 = 2
            goto L4d
        L4c:
            r0 = 1
        L4d:
            int r1 = r4.b
        L4f:
            int r2 = r4.c
            int r3 = r0 + (-1)
            int r3 = r2 - r3
            if (r1 >= r3) goto Lab
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L67
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L71
        L67:
            byte[] r2 = r4.a
            r2 = r2[r1]
            boolean r2 = defpackage.tym.K(r2)
            if (r2 != 0) goto Lac
        L71:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L81
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L91
        L81:
            byte[] r2 = r4.a
            r3 = r2[r1]
            if (r3 != 0) goto L91
            int r3 = r1 + 1
            r2 = r2[r3]
            boolean r2 = defpackage.tym.K(r2)
            if (r2 != 0) goto Lac
        L91:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto La9
            byte[] r2 = r4.a
            int r3 = r1 + 1
            r3 = r2[r3]
            if (r3 != 0) goto La9
            r2 = r2[r1]
            boolean r2 = defpackage.tym.K(r2)
            if (r2 != 0) goto Lac
        La9:
            int r1 = r1 + r0
            goto L4f
        Lab:
            r1 = r2
        Lac:
            int r0 = r4.b
            int r1 = r1 - r0
            java.lang.String r0 = r4.y(r1, r5)
            int r1 = r4.b
            int r2 = r4.c
            if (r1 == r2) goto Lc8
            char[] r1 = defpackage.g1g.d
            char r1 = r4.l(r5, r1)
            r2 = 13
            if (r1 != r2) goto Lc8
            char[] r1 = defpackage.g1g.e
            r4.l(r5, r1)
        Lc8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g1g.n(java.nio.charset.Charset):java.lang.String");
    }

    public final int o() {
        f(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.b = i + 4;
        return i7 | ((bArr[i6] & 255) << 24);
    }

    public final long p() {
        f(8);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        long j = (bArr[i] & 255) | ((bArr[r3] & 255) << 8);
        this.b = i + 3;
        long j2 = j | ((bArr[r8] & 255) << 16);
        this.b = i + 4;
        long j3 = j2 | ((bArr[r3] & 255) << 24);
        this.b = i + 5;
        long j4 = j3 | ((bArr[r8] & 255) << 32);
        this.b = i + 6;
        long j5 = j4 | ((bArr[r3] & 255) << 40);
        this.b = i + 7;
        long j6 = j5 | ((bArr[r8] & 255) << 48);
        this.b = i + 8;
        return j6 | ((bArr[r3] & 255) << 56);
    }

    public final short q() {
        f(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) (i3 | ((bArr[i2] & 255) << 8));
    }

    public final long r() {
        f(4);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        long j = (bArr[i] & 255) | ((bArr[r3] & 255) << 8);
        this.b = i + 3;
        long j2 = j | ((bArr[r8] & 255) << 16);
        this.b = i + 4;
        return j2 | ((bArr[r3] & 255) << 24);
    }

    public final int s() {
        int iO = o();
        if (iO >= 0) {
            return iO;
        }
        qp2.n(sko.i(iO, "Top bit not zero: "));
        return 0;
    }

    public final int t() {
        f(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return i3 | ((bArr[i2] & 255) << 8);
    }

    public final long u() {
        f(8);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r3] & 255) << 48);
        this.b = i + 3;
        long j2 = j | ((bArr[r8] & 255) << 40);
        this.b = i + 4;
        long j3 = j2 | ((bArr[r3] & 255) << 32);
        this.b = i + 5;
        long j4 = j3 | ((bArr[r8] & 255) << 24);
        this.b = i + 6;
        long j5 = j4 | ((bArr[r3] & 255) << 16);
        this.b = i + 7;
        long j6 = j5 | ((bArr[r8] & 255) << 8);
        this.b = i + 8;
        return j6 | (bArr[r3] & 255);
    }

    public final String v() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = tym.a;
        String str2 = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return str2;
    }

    public final String w(int i) {
        f(i);
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.c || this.a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.a;
        String str = tym.a;
        String str2 = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.b += i;
        return str2;
    }

    public final short x() {
        f(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (short) (i3 | (bArr[i2] & 255));
    }

    public final String y(int i, Charset charset) {
        f(i);
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final int z() {
        return (A() << 21) | (A() << 14) | (A() << 7) | A();
    }
}
