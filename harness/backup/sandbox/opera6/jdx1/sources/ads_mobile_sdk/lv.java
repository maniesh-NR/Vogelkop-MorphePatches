package ads_mobile_sdk;

import androidx.core.app.NotificationCompat;
import defpackage.g65;
import defpackage.ocp;
import defpackage.pio;
import java.util.Locale;

/* loaded from: classes.dex */
public final class lv extends ov {
    public final byte[] b;
    public final int c;
    public int d;

    public lv(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            Locale locale = Locale.US;
            qp2.o(sko.h(bArr.length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.b = bArr;
        this.d = 0;
        this.c = i;
    }

    @Override // ads_mobile_sdk.ov
    public final void a(byte b) throws g65 {
        int i = this.d;
        try {
            int i2 = i + 1;
            try {
                this.b[i] = b;
                this.d = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new g65(i, this.c, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // ads_mobile_sdk.ov
    public final void a(int i, boolean z) throws g65 {
        g(i, 0);
        a(z ? (byte) 1 : (byte) 0);
    }

    @Override // ads_mobile_sdk.ov
    public final void a(String str) throws g65 {
        int i = this.d;
        try {
            int i2 = ov.i(str.length() * 3);
            int i3 = ov.i(str.length());
            byte[] bArr = this.b;
            if (i3 != i2) {
                ocp ocpVar = sm3.a;
                m(ocpVar.a(str));
                int i4 = this.d;
                this.d = ocpVar.a(str, bArr, i4, bArr.length - i4);
                return;
            }
            int i5 = i + i3;
            this.d = i5;
            int iA = sm3.a.a(str, bArr, i5, bArr.length - i5);
            this.d = i;
            m((iA - i) - i3);
            this.d = iA;
        } catch (IndexOutOfBoundsException e) {
            throw new g65(e);
        }
    }

    @Override // ads_mobile_sdk.ov
    public final void a$1(int i, int i2, byte[] bArr) throws g65 {
        try {
            System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new g65(this.d, this.c, i2, e);
        }
    }

    @Override // ads_mobile_sdk.ov
    public final void a$1(int i, byte[] bArr) throws g65 {
        m(i);
        try {
            System.arraycopy(bArr, 0, this.b, this.d, i);
            this.d += i;
        } catch (IndexOutOfBoundsException e) {
            throw new g65(this.d, this.c, i, e);
        }
    }

    public final int b() {
        return this.c - this.d;
    }

    @Override // ads_mobile_sdk.ov
    public final void b(int i, hr hrVar) throws g65 {
        g(i, 2);
        m(hrVar.size());
        hrVar.a(this);
    }

    @Override // ads_mobile_sdk.ov
    public final void b(g gVar) throws g65 {
        ku0 ku0Var = (ku0) gVar;
        m(ku0Var.a((pio) null));
        ku0Var.a(this);
    }

    @Override // ads_mobile_sdk.ov
    public final void b(hr hrVar) throws g65 {
        m(hrVar.size());
        hrVar.a(this);
    }

    @Override // ads_mobile_sdk.ov
    public final void b(String str, int i) throws g65 {
        g(i, 2);
        a(str);
    }

    @Override // ads_mobile_sdk.ov
    public final void c(long j) throws g65 {
        int i = this.d;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new g65(i, this.c, 8, e);
        }
    }

    @Override // ads_mobile_sdk.ov
    public final void d(int i, long j) throws g65 {
        g(i, 1);
        c(j);
    }

    @Override // ads_mobile_sdk.ov
    public final void d(long j) throws g65 {
        int i = this.d;
        long j2 = j & (-128);
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new g65(i, this.c, 1, e);
        }
    }

    @Override // ads_mobile_sdk.ov
    public final void e(int i, int i2) throws g65 {
        g(i, 5);
        k(i2);
    }

    @Override // ads_mobile_sdk.ov
    public final void e(int i, long j) throws g65 {
        g(i, 0);
        d(j);
    }

    @Override // ads_mobile_sdk.ov
    public final void f(int i, int i2) throws g65 {
        g(i, 0);
        l(i2);
    }

    @Override // ads_mobile_sdk.ov
    public final void g(int i, int i2) throws g65 {
        m((i << 3) | i2);
    }

    @Override // ads_mobile_sdk.ov
    public final void h(int i, int i2) throws g65 {
        g(i, 0);
        m(i2);
    }

    @Override // ads_mobile_sdk.ov
    public final void k(int i) throws g65 {
        int i2 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.d = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new g65(i2, this.c, 4, e);
        }
    }

    @Override // ads_mobile_sdk.ov
    public final void l(int i) throws g65 {
        int i2;
        IndexOutOfBoundsException indexOutOfBoundsException;
        IndexOutOfBoundsException indexOutOfBoundsException2;
        if (i >= 0) {
            m(i);
            return;
        }
        long j = i;
        int i3 = this.d;
        try {
            byte[] bArr = this.b;
            int i4 = i3 + 1;
            try {
                bArr[i3] = (byte) (((int) j) | NotificationCompat.FLAG_HIGH_PRIORITY);
                i2 = i3 + 2;
                try {
                    bArr[i4] = (byte) (((int) (j >>> 7)) | NotificationCompat.FLAG_HIGH_PRIORITY);
                    int i5 = i3 + 3;
                    bArr[i2] = (byte) (((int) (j >>> 14)) | NotificationCompat.FLAG_HIGH_PRIORITY);
                    i2 = i3 + 4;
                    bArr[i5] = (byte) (((int) (j >>> 21)) | NotificationCompat.FLAG_HIGH_PRIORITY);
                    int i6 = i3 + 5;
                    bArr[i2] = (byte) (((int) (j >>> 28)) | NotificationCompat.FLAG_HIGH_PRIORITY);
                    int i7 = i3 + 6;
                    try {
                        bArr[i6] = -1;
                        int i8 = i3 + 7;
                        bArr[i7] = -1;
                        i7 = i3 + 8;
                        bArr[i8] = -1;
                        i4 = i3 + 9;
                        bArr[i7] = -1;
                        i3 += 10;
                        bArr[i4] = 1;
                        this.d = i3;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException2 = e;
                        i4 = i7;
                        indexOutOfBoundsException = indexOutOfBoundsException2;
                        i2 = i4;
                        throw new g65(i2, this.c, 10, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    throw new g65(i2, this.c, 10, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException2 = e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            i2 = i3;
            indexOutOfBoundsException = e4;
        }
    }

    @Override // ads_mobile_sdk.ov
    public final void m(int i) throws g65 {
        IndexOutOfBoundsException indexOutOfBoundsException;
        IndexOutOfBoundsException indexOutOfBoundsException2;
        int i2;
        IndexOutOfBoundsException indexOutOfBoundsException3;
        int i3 = this.d;
        int i4 = i & (-128);
        try {
            byte[] bArr = this.b;
            if (i4 == 0) {
                int i5 = i3 + 1;
                try {
                    bArr[i3] = (byte) i;
                    this.d = i5;
                    return;
                } catch (IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                    i3 = i5;
                    indexOutOfBoundsException2 = indexOutOfBoundsException;
                    i2 = i3;
                    throw new g65(i2, this.c, 1, indexOutOfBoundsException2);
                }
            }
            int i6 = i3 + 1;
            try {
                bArr[i3] = (byte) (i | NotificationCompat.FLAG_HIGH_PRIORITY);
                int i7 = i >>> 7;
                if ((i7 & (-128)) == 0) {
                    int i8 = i3 + 2;
                    bArr[i6] = (byte) i7;
                    this.d = i8;
                    return;
                }
                int i9 = i3 + 2;
                try {
                    bArr[i6] = (byte) (i7 | NotificationCompat.FLAG_HIGH_PRIORITY);
                    int i10 = i >>> 14;
                    if ((i10 & (-128)) == 0) {
                        int i11 = i3 + 3;
                        bArr[i9] = (byte) i10;
                        this.d = i11;
                        return;
                    }
                    i6 = i3 + 3;
                    bArr[i9] = (byte) (i10 | NotificationCompat.FLAG_HIGH_PRIORITY);
                    int i12 = i >>> 21;
                    if ((i12 & (-128)) == 0) {
                        int i13 = i3 + 4;
                        bArr[i6] = (byte) i12;
                        this.d = i13;
                        return;
                    }
                    i2 = i3 + 4;
                    try {
                        bArr[i6] = (byte) (i12 | NotificationCompat.FLAG_HIGH_PRIORITY);
                        int i14 = i3 + 5;
                        bArr[i2] = (byte) (i >>> 28);
                        this.d = i14;
                    } catch (IndexOutOfBoundsException e2) {
                        indexOutOfBoundsException2 = e2;
                        throw new g65(i2, this.c, 1, indexOutOfBoundsException2);
                    }
                } catch (IndexOutOfBoundsException e3) {
                    indexOutOfBoundsException3 = e3;
                    i6 = i9;
                    indexOutOfBoundsException2 = indexOutOfBoundsException3;
                    i2 = i6;
                    throw new g65(i2, this.c, 1, indexOutOfBoundsException2);
                }
            } catch (IndexOutOfBoundsException e4) {
                indexOutOfBoundsException3 = e4;
            }
        } catch (IndexOutOfBoundsException e5) {
            indexOutOfBoundsException = e5;
        }
    }
}
