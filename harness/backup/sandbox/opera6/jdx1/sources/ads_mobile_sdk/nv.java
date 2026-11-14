package ads_mobile_sdk;

import androidx.core.app.NotificationCompat;
import defpackage.g65;
import defpackage.ocp;
import defpackage.pio;
import defpackage.t3p;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class nv extends ov {
    public final byte[] b;
    public final int c;
    public int d;
    public final OutputStream e;

    public nv(OutputStream outputStream, int i) {
        if (outputStream == null) {
            t3p.q("out");
            throw null;
        }
        this.e = outputStream;
        if (i < 0) {
            qp2.o("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.b = new byte[iMax];
        this.c = iMax;
    }

    @Override // ads_mobile_sdk.ov
    public final void a(byte b) throws IOException {
        int i = this.d;
        int i2 = this.c;
        byte[] bArr = this.b;
        if (i == i2) {
            this.e.write(bArr, 0, i);
            this.d = 0;
            i = 0;
        }
        bArr[i] = b;
        this.d = i + 1;
    }

    @Override // ads_mobile_sdk.ov
    public final void a(int i, boolean z) throws IOException {
        p(11);
        i(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.d;
        this.b[i2] = b;
        this.d = i2 + 1;
    }

    @Override // ads_mobile_sdk.ov
    public final void a(String str) throws IOException {
        int length = str.length() * 3;
        int i = ov.i(length);
        int i2 = i + length;
        int i3 = this.c;
        if (i2 > i3) {
            byte[] bArr = new byte[length];
            int iA = sm3.a.a(str, bArr, 0, length);
            p(5);
            o(iA);
            b$1(0, iA, bArr);
            return;
        }
        int i4 = this.d;
        int i5 = i3 - i4;
        byte[] bArr2 = this.b;
        if (i2 > i5) {
            this.e.write(bArr2, 0, i4);
            this.d = 0;
        }
        int i6 = ov.i(str.length());
        int i7 = this.d;
        try {
            if (i6 != i) {
                ocp ocpVar = sm3.a;
                int iA2 = ocpVar.a(str);
                o(iA2);
                this.d = ocpVar.a(str, bArr2, this.d, iA2);
                return;
            }
            int i8 = i7 + i6;
            this.d = i8;
            int iA3 = sm3.a.a(str, bArr2, i8, i3 - i8);
            this.d = i7;
            o((iA3 - i7) - i6);
            this.d = iA3;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new g65((IndexOutOfBoundsException) e);
        }
    }

    @Override // ads_mobile_sdk.ov
    public final void a$1(int i, int i2, byte[] bArr) throws IOException {
        b$1(i, i2, bArr);
    }

    @Override // ads_mobile_sdk.ov
    public final void a$1(int i, byte[] bArr) throws IOException {
        p(5);
        o(i);
        b$1(0, i, bArr);
    }

    @Override // ads_mobile_sdk.ov
    public final void b(int i, hr hrVar) throws IOException {
        g(i, 2);
        b(hrVar);
    }

    @Override // ads_mobile_sdk.ov
    public final void b(g gVar) throws IOException {
        ku0 ku0Var = (ku0) gVar;
        int iA = ku0Var.a((pio) null);
        p(5);
        o(iA);
        ku0Var.a(this);
    }

    @Override // ads_mobile_sdk.ov
    public final void b(hr hrVar) throws IOException {
        int size = hrVar.size();
        p(5);
        o(size);
        hrVar.a(this);
    }

    @Override // ads_mobile_sdk.ov
    public final void b(String str, int i) throws IOException {
        g(i, 2);
        a(str);
    }

    public final void b$1(int i, int i2, byte[] bArr) throws IOException {
        int i3 = this.d;
        int i4 = this.c;
        int i5 = i4 - i3;
        byte[] bArr2 = this.b;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.d += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.d = i4;
        OutputStream outputStream = this.e;
        outputStream.write(bArr2, 0, i4);
        this.d = 0;
        if (i7 > i4) {
            outputStream.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.d = i7;
        }
    }

    @Override // ads_mobile_sdk.ov
    public final void c(long j) throws IOException {
        p(8);
        e(j);
    }

    @Override // ads_mobile_sdk.ov
    public final void d(int i, long j) throws IOException {
        p(18);
        i(i, 1);
        e(j);
    }

    @Override // ads_mobile_sdk.ov
    public final void d(long j) throws IOException {
        p(10);
        f(j);
    }

    @Override // ads_mobile_sdk.ov
    public final void e(int i, int i2) throws IOException {
        p(14);
        i(i, 5);
        n(i2);
    }

    @Override // ads_mobile_sdk.ov
    public final void e(int i, long j) throws IOException {
        p(20);
        i(i, 0);
        f(j);
    }

    public final void e(long j) {
        int i = this.d;
        byte[] bArr = this.b;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.d = i + 8;
    }

    @Override // ads_mobile_sdk.ov
    public final void f(int i, int i2) throws IOException {
        p(20);
        i(i, 0);
        if (i2 >= 0) {
            o(i2);
        } else {
            f(i2);
        }
    }

    public final void f(long j) {
        int i = this.d;
        long j2 = j & (-128);
        byte[] bArr = this.b;
        if (j2 == 0) {
            bArr[i] = (byte) j;
            this.d = i + 1;
            return;
        }
        bArr[i] = (byte) (((int) j) | NotificationCompat.FLAG_HIGH_PRIORITY);
        long j3 = j >>> 7;
        if ((j3 & (-128)) == 0) {
            bArr[i + 1] = (byte) j3;
            this.d = i + 2;
            return;
        }
        bArr[i + 1] = (byte) (((int) j3) | NotificationCompat.FLAG_HIGH_PRIORITY);
        long j4 = j >>> 14;
        if ((j4 & (-128)) == 0) {
            bArr[i + 2] = (byte) j4;
            this.d = i + 3;
            return;
        }
        bArr[i + 2] = (byte) (((int) j4) | NotificationCompat.FLAG_HIGH_PRIORITY);
        long j5 = j >>> 21;
        if ((j5 & (-128)) == 0) {
            bArr[i + 3] = (byte) j5;
            this.d = i + 4;
            return;
        }
        bArr[i + 3] = (byte) (((int) j5) | NotificationCompat.FLAG_HIGH_PRIORITY);
        long j6 = j >>> 28;
        if ((j6 & (-128)) == 0) {
            bArr[i + 4] = (byte) j6;
            this.d = i + 5;
            return;
        }
        bArr[i + 4] = (byte) (((int) j6) | NotificationCompat.FLAG_HIGH_PRIORITY);
        long j7 = j >>> 35;
        if ((j7 & (-128)) == 0) {
            bArr[i + 5] = (byte) j7;
            this.d = i + 6;
            return;
        }
        bArr[i + 5] = (byte) (((int) j7) | NotificationCompat.FLAG_HIGH_PRIORITY);
        long j8 = j >>> 42;
        if ((j8 & (-128)) == 0) {
            bArr[i + 6] = (byte) j8;
            this.d = i + 7;
            return;
        }
        bArr[i + 6] = (byte) (((int) j8) | NotificationCompat.FLAG_HIGH_PRIORITY);
        long j9 = j >>> 49;
        if ((j9 & (-128)) == 0) {
            bArr[i + 7] = (byte) j9;
            this.d = i + 8;
            return;
        }
        bArr[i + 7] = (byte) (((int) j9) | NotificationCompat.FLAG_HIGH_PRIORITY);
        long j10 = j >>> 56;
        if (((-128) & j10) == 0) {
            bArr[i + 8] = (byte) j10;
            this.d = i + 9;
        } else {
            bArr[i + 8] = (byte) (((int) j10) | NotificationCompat.FLAG_HIGH_PRIORITY);
            bArr[i + 9] = (byte) (j >>> 63);
            this.d = i + 10;
        }
    }

    @Override // ads_mobile_sdk.ov
    public final void g(int i, int i2) throws IOException {
        p(5);
        o((i << 3) | i2);
    }

    @Override // ads_mobile_sdk.ov
    public final void h(int i, int i2) throws IOException {
        p(20);
        i(i, 0);
        o(i2);
    }

    public final void i(int i, int i2) {
        o((i << 3) | i2);
    }

    @Override // ads_mobile_sdk.ov
    public final void k(int i) throws IOException {
        p(4);
        n(i);
    }

    @Override // ads_mobile_sdk.ov
    public final void l(int i) throws IOException {
        if (i >= 0) {
            p(5);
            o(i);
        } else {
            p(10);
            f(i);
        }
    }

    @Override // ads_mobile_sdk.ov
    public final void m(int i) throws IOException {
        p(5);
        o(i);
    }

    public final void n(int i) {
        int i2 = this.d;
        byte[] bArr = this.b;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.d = i2 + 4;
    }

    public final void o(int i) {
        int i2 = this.d;
        int i3 = i & (-128);
        byte[] bArr = this.b;
        if (i3 == 0) {
            bArr[i2] = (byte) i;
            this.d = i2 + 1;
            return;
        }
        bArr[i2] = (byte) (i | NotificationCompat.FLAG_HIGH_PRIORITY);
        int i4 = i >>> 7;
        if ((i4 & (-128)) == 0) {
            bArr[i2 + 1] = (byte) i4;
            this.d = i2 + 2;
            return;
        }
        bArr[i2 + 1] = (byte) (i4 | NotificationCompat.FLAG_HIGH_PRIORITY);
        int i5 = i >>> 14;
        if ((i5 & (-128)) == 0) {
            bArr[i2 + 2] = (byte) i5;
            this.d = i2 + 3;
            return;
        }
        bArr[i2 + 2] = (byte) (i5 | NotificationCompat.FLAG_HIGH_PRIORITY);
        int i6 = i >>> 21;
        if ((i6 & (-128)) == 0) {
            bArr[i2 + 3] = (byte) i6;
            this.d = i2 + 4;
        } else {
            bArr[i2 + 3] = (byte) (i6 | NotificationCompat.FLAG_HIGH_PRIORITY);
            bArr[i2 + 4] = (byte) (i >>> 28);
            this.d = i2 + 5;
        }
    }

    public final void p(int i) throws IOException {
        int i2 = this.d;
        if (this.c - i2 < i) {
            this.e.write(this.b, 0, i2);
            this.d = 0;
        }
    }
}
