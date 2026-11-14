package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class i7m extends e53 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // defpackage.eh2
    public final long b(long j) {
        return Math.max(0L, j - tym.U(this.b.a, this.j + this.i));
    }

    @Override // defpackage.e53
    public final bh2 c(bh2 bh2Var) throws dh2 {
        if (!tym.I(bh2Var.c)) {
            throw new dh2(bh2Var);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? bh2.e : bh2Var;
    }

    @Override // defpackage.e53
    public final void d() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.e53
    public final void e() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // defpackage.e53
    public final void f() {
        this.m = tym.b;
    }

    @Override // defpackage.e53, defpackage.eh2
    public final ByteBuffer getOutput() {
        int i;
        if (super.isEnded() && (i = this.n) > 0) {
            g(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.getOutput();
    }

    @Override // defpackage.e53, defpackage.eh2
    public final boolean isEnded() {
        return super.isEnded() && this.n == 0;
    }

    @Override // defpackage.eh2
    public final void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i != 0) {
            int iMin = Math.min(i, this.l);
            this.o += iMin / this.b.d;
            this.l -= iMin;
            byteBuffer.position(iPosition + iMin);
            if (this.l > 0) {
                return;
            }
            int i2 = i - iMin;
            int length = (this.n + i2) - this.m.length;
            ByteBuffer byteBufferG = g(length);
            int i3 = tym.i(length, 0, this.n);
            byteBufferG.put(this.m, 0, i3);
            int i4 = tym.i(length - i3, 0, i2);
            byteBuffer.limit(byteBuffer.position() + i4);
            byteBufferG.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i5 = i2 - i4;
            int i6 = this.n - i3;
            this.n = i6;
            byte[] bArr = this.m;
            System.arraycopy(bArr, i3, bArr, 0, i6);
            byteBuffer.get(this.m, this.n, i5);
            this.n += i5;
            byteBufferG.flip();
        }
    }
}
