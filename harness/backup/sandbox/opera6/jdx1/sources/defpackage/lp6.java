package defpackage;

import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class lp6 implements dn8 {
    public final oc6 b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        rjd.a("media3.extractor");
    }

    public lp6(oc6 oc6Var, long j, long j2) {
        this.b = oc6Var;
        this.d = j;
        this.c = j2;
    }

    public final boolean a(int i, boolean z) {
        d(i);
        int iF = this.g - this.f;
        while (iF < i) {
            lp6 lp6Var = this;
            int i2 = i;
            boolean z2 = z;
            iF = lp6Var.f(this.e, this.f, i2, iF, z2);
            if (iF == -1) {
                return false;
            }
            lp6Var.g = lp6Var.f + iF;
            this = lp6Var;
            i = i2;
            z = z2;
        }
        this.f += i;
        return true;
    }

    @Override // defpackage.dn8
    public final void advancePeekPosition(int i) {
        a(i, false);
    }

    public final void d(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, tym.i(bArr.length << 1, 65536 + i2, i2 + 524288));
        }
    }

    public final int e(int i, int i2, byte[] bArr) throws InterruptedIOException {
        lp6 lp6Var;
        int iMin;
        d(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            lp6Var = this;
            iMin = lp6Var.f(this.e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            lp6Var.g += iMin;
        } else {
            lp6Var = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(lp6Var.e, lp6Var.f, bArr, i, iMin);
        lp6Var.f += iMin;
        return iMin;
    }

    public final int f(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        qp2.c();
        return 0;
    }

    public final int g(int i) throws InterruptedIOException {
        lp6 lp6Var;
        int iMin = Math.min(this.g, i);
        i(iMin);
        if (iMin == 0) {
            byte[] bArr = this.a;
            lp6Var = this;
            iMin = lp6Var.f(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            lp6Var = this;
        }
        if (iMin != -1) {
            lp6Var.d += iMin;
        }
        return iMin;
    }

    @Override // defpackage.dn8
    public final long getLength() {
        return this.c;
    }

    @Override // defpackage.dn8
    public final long getPeekPosition() {
        return this.d + this.f;
    }

    @Override // defpackage.dn8
    public final long getPosition() {
        return this.d;
    }

    public final boolean h(int i, boolean z) throws InterruptedIOException {
        int iMin = Math.min(this.g, i);
        i(iMin);
        int iF = iMin;
        while (iF < i && iF != -1) {
            byte[] bArr = this.a;
            iF = f(bArr, -iF, Math.min(i, bArr.length + iF), iF, z);
        }
        if (iF != -1) {
            this.d += iF;
        }
        return iF != -1;
    }

    public final void i(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // defpackage.dn8
    public final void peekFully(byte[] bArr, int i, int i2) {
        peekFully(bArr, i, i2, false);
    }

    @Override // defpackage.dn8
    public final boolean peekFully(byte[] bArr, int i, int i2, boolean z) {
        if (!a(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.oc6
    public final int read(byte[] bArr, int i, int i2) throws InterruptedIOException {
        lp6 lp6Var;
        int i3 = this.g;
        int iF = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            i(iMin);
            iF = iMin;
        }
        if (iF == 0) {
            lp6Var = this;
            iF = lp6Var.f(bArr, i, i2, 0, true);
        } else {
            lp6Var = this;
        }
        if (iF != -1) {
            lp6Var.d += iF;
        }
        return iF;
    }

    @Override // defpackage.dn8
    public final void readFully(byte[] bArr, int i, int i2) throws InterruptedIOException {
        readFully(bArr, i, i2, false);
    }

    @Override // defpackage.dn8
    public final boolean readFully(byte[] bArr, int i, int i2, boolean z) throws InterruptedIOException {
        int iMin;
        int i3 = this.g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            i(iMin);
        }
        int iF = iMin;
        while (iF < i2 && iF != -1) {
            iF = f(bArr, i, i2, iF, z);
        }
        if (iF != -1) {
            this.d += iF;
        }
        return iF != -1;
    }

    @Override // defpackage.dn8
    public final void resetPeekPosition() {
        this.f = 0;
    }

    @Override // defpackage.dn8
    public final void skipFully(int i) throws InterruptedIOException {
        h(i, false);
    }
}
