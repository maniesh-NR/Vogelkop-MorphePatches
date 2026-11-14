package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class vjj extends e53 {
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public byte[] n;
    public int o;
    public int p;
    public byte[] q;

    @Override // defpackage.e53
    public final void d() {
        if (isActive()) {
            int i = this.b.b << 1;
            this.i = i;
            int i2 = (((((int) ((100000 * r0.a) / 1000000)) / 2) / i) * i) << 1;
            if (this.n.length != i2) {
                this.n = new byte[i2];
                this.q = new byte[i2];
            }
        }
        this.k = false;
        this.l = 0L;
        this.m = 0;
        this.o = 0;
        this.p = 0;
    }

    @Override // defpackage.e53
    public final void e() {
        if (this.p > 0) {
            i(true);
            this.m = 0;
        }
    }

    @Override // defpackage.e53
    public final void f() {
        this.j = false;
        byte[] bArr = tym.b;
        this.n = bArr;
        this.q = bArr;
    }

    public final int h(int i) {
        int length = ((((int) ((2000000 * this.b.a) / 1000000)) - this.m) * this.i) - (this.n.length / 2);
        z4o.H(length >= 0);
        int iMin = (int) Math.min((i * 0.2f) + 0.5f, length);
        int i2 = this.i;
        return (iMin / i2) * i2;
    }

    public final void i(boolean z) {
        int length;
        int iH;
        int i = this.p;
        byte[] bArr = this.n;
        if (i == bArr.length || z) {
            if (this.m == 0) {
                if (z) {
                    j(i, 3);
                    length = i;
                } else {
                    z4o.H(i >= bArr.length / 2);
                    length = this.n.length / 2;
                    j(length, 0);
                }
                iH = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iH2 = h(length2) + (this.n.length / 2);
                j(iH2, 2);
                iH = iH2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iH = h(length);
                j(iH, 1);
            }
            if (!(length % this.i == 0)) {
                qp2.n(n1h.j("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
                return;
            }
            z4o.H(i >= iH);
            this.p -= length;
            int i2 = this.o + length;
            this.o = i2;
            this.o = i2 % this.n.length;
            this.m = (iH / this.i) + this.m;
            this.l += (length - iH) / r2;
        }
    }

    @Override // defpackage.e53, defpackage.eh2
    public final boolean isActive() {
        return super.isActive() && this.j;
    }

    public final void j(int i, int i2) {
        int i3;
        if (i == 0) {
            return;
        }
        z4o.w(this.p >= i);
        int i4 = this.o;
        if (i2 == 2) {
            int i5 = this.p;
            int i6 = i4 + i5;
            byte[] bArr = this.n;
            if (i6 <= bArr.length) {
                System.arraycopy(bArr, i6 - i, this.q, 0, i);
            } else {
                int length = i5 - (bArr.length - i4);
                byte[] bArr2 = this.q;
                if (length >= i) {
                    System.arraycopy(bArr, length - i, bArr2, 0, i);
                } else {
                    int i7 = i - length;
                    System.arraycopy(bArr, bArr.length - i7, bArr2, 0, i7);
                    System.arraycopy(this.n, 0, this.q, i7, length);
                }
            }
        } else {
            int i8 = i4 + i;
            byte[] bArr3 = this.n;
            int length2 = bArr3.length;
            byte[] bArr4 = this.q;
            if (i8 <= length2) {
                System.arraycopy(bArr3, i4, bArr4, 0, i);
            } else {
                int length3 = bArr3.length - i4;
                System.arraycopy(bArr3, i4, bArr4, 0, length3);
                System.arraycopy(this.n, 0, this.q, length3, i - length3);
            }
        }
        z4o.t(i, "sizeToOutput is not aligned to frame size: %s", i % this.i == 0);
        z4o.H(this.o < this.n.length);
        byte[] bArr5 = this.q;
        z4o.t(i, "byteOutput size is not aligned to frame size %s", i % this.i == 0);
        if (i2 != 3) {
            for (int i9 = 0; i9 < i; i9 += 2) {
                int i10 = i9 + 1;
                int i11 = (bArr5[i9] & 255) | (bArr5[i10] << 8);
                if (i2 == 0) {
                    i3 = ((((i9 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i3 = 10;
                    if (i2 == 2) {
                        i3 = 10 + (((90000 * i9) / (i - 1)) / 1000);
                    }
                }
                int i12 = (i11 * i3) / 100;
                if (i12 >= 32767) {
                    bArr5[i9] = -1;
                    bArr5[i10] = Byte.MAX_VALUE;
                } else if (i12 <= -32768) {
                    bArr5[i9] = 0;
                    bArr5[i10] = Byte.MIN_VALUE;
                } else {
                    bArr5[i9] = (byte) (i12 & 255);
                    bArr5[i10] = (byte) (i12 >> 8);
                }
            }
        }
        g(i).put(bArr5, 0, i).flip();
    }

    @Override // defpackage.eh2
    public final void queueInput(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            boolean z = this.k;
            if (!z) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.n.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3 - 1) & 255) | (byteBuffer.get(iLimit3) << 8)) > 1024) {
                        int i = this.i;
                        iPosition = ((iLimit3 / i) * i) + i;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.k = true;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    g(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (!z) {
                    h9o.e();
                    return;
                }
                z4o.H(this.o < this.n.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2 - 1) & 255) | (byteBuffer.get(iPosition2) << 8)) > 1024) {
                        int i2 = this.i;
                        iLimit = (iPosition2 / i2) * i2;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.o;
                int i3 = this.p;
                int length2 = length + i3;
                byte[] bArr = this.n;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i3 - (bArr.length - length);
                }
                int i4 = length - length2;
                boolean z2 = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i4);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.n, length2, iMin);
                int i5 = this.p + iMin;
                this.p = i5;
                z4o.H(i5 <= this.n.length);
                boolean z3 = z2 && iPosition3 < i4;
                i(z3);
                if (z3) {
                    this.k = false;
                    this.m = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }
}
