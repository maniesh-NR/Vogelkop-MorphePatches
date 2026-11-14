package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFk1oSDK extends FilterInputStream {
    private int AFInAppEventType;
    private int AFLogger;
    private final byte[][] areAllFieldsValid;
    private final byte[] component1;
    private final int[] component2;
    private final int component3;
    private final int[] component4;
    private int copy;
    private final int copydefault;
    private final byte[] equals;
    private final int hashCode;
    private int toString;
    private static final byte[] getMonetizationNetwork = AFk1uSDK.getMonetizationNetwork;
    private static final int[] getRevenue = AFk1uSDK.getMediationNetwork;
    private static final int[] getMediationNetwork = AFk1uSDK.AFAdRevenueData;
    private static final int[] getCurrencyIso4217Code = AFk1uSDK.getCurrencyIso4217Code;
    private static final int[] AFAdRevenueData = AFk1uSDK.getRevenue;

    public AFk1oSDK(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i, bArr, bArr2, (byte) 0);
    }

    private AFk1oSDK(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2, byte b) {
        super(new BufferedInputStream(inputStream, 4096));
        this.component4 = new int[4];
        this.component1 = new byte[16];
        this.equals = new byte[16];
        this.copy = 1;
        this.toString = Integer.MAX_VALUE;
        this.AFInAppEventType = 16;
        this.AFLogger = 16;
        this.component3 = i;
        this.component2 = AFk1uSDK.getCurrencyIso4217Code(bArr, i);
        this.areAllFieldsValid = getRevenue(bArr2);
        this.copydefault = 100;
        this.hashCode = 100;
    }

    private void AFAdRevenueData(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.component4;
        char c = 1;
        char c2 = 2;
        char c3 = '\b';
        char c4 = 3;
        int i = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.component2;
        iArr[0] = i ^ iArr2[0];
        char c5 = 4;
        char c6 = 5;
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        iArr[3] = ((((bArr[12] << 24) | ((bArr[13] & 255) << 16)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255)) ^ iArr2[3];
        int i2 = 4;
        int i3 = 1;
        while (i3 < this.component3) {
            int[] iArr3 = getRevenue;
            int[] iArr4 = this.component4;
            char c7 = c5;
            byte[][] bArr3 = this.areAllFieldsValid;
            byte[] bArr4 = bArr3[0];
            int i4 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = getMediationNetwork;
            byte[] bArr5 = bArr3[c];
            char c8 = c;
            int i5 = i4 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = getCurrencyIso4217Code;
            byte[] bArr6 = bArr3[c2];
            char c9 = c2;
            int i6 = i5 ^ iArr6[(iArr4[bArr6[0]] >>> 8) & 255];
            int[] iArr7 = AFAdRevenueData;
            byte[] bArr7 = bArr3[c4];
            char c10 = c4;
            int i7 = i6 ^ iArr7[iArr4[bArr7[0]] & 255];
            int[] iArr8 = this.component2;
            int i8 = i7 ^ iArr8[i2];
            char c11 = c3;
            int i9 = (((iArr3[iArr4[bArr4[c8]] >>> 24] ^ iArr5[(iArr4[bArr5[c8]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c8]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c8]] & 255]) ^ iArr8[i2 + 1];
            int i10 = (((iArr3[iArr4[bArr4[c9]] >>> 24] ^ iArr5[(iArr4[bArr5[c9]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c9]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c9]] & 255]) ^ iArr8[i2 + 2];
            int i11 = (((iArr3[iArr4[bArr4[c10]] >>> 24] ^ iArr5[(iArr4[bArr5[c10]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c10]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c10]] & 255]) ^ iArr8[i2 + 3];
            iArr4[0] = i8;
            iArr4[c8] = i9;
            iArr4[c9] = i10;
            iArr4[c10] = i11;
            i3++;
            i2 += 4;
            c5 = c7;
            c = c8;
            c2 = c9;
            c4 = c10;
            c3 = c11;
            c6 = c6;
        }
        char c12 = c5;
        char c13 = c;
        char c14 = c2;
        char c15 = c4;
        char c16 = c3;
        int[] iArr9 = this.component2;
        int i12 = iArr9[i2];
        byte[] bArr8 = getMonetizationNetwork;
        int[] iArr10 = this.component4;
        byte[][] bArr9 = this.areAllFieldsValid;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i12 >>> 24));
        byte[] bArr11 = bArr9[c13];
        bArr2[c13] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i12 >>> 16));
        byte[] bArr12 = bArr9[c14];
        bArr2[c14] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i12 >>> 8));
        byte[] bArr13 = bArr9[c15];
        bArr2[c15] = (byte) (bArr8[iArr10[bArr13[0]] & 255] ^ i12);
        int i13 = iArr9[i2 + 1];
        bArr2[c12] = (byte) (bArr8[iArr10[bArr10[c13]] >>> 24] ^ (i13 >>> 24));
        bArr2[c6] = (byte) (bArr8[(iArr10[bArr11[c13]] >>> 16) & 255] ^ (i13 >>> 16));
        bArr2[6] = (byte) (bArr8[(iArr10[bArr12[c13]] >>> 8) & 255] ^ (i13 >>> 8));
        bArr2[7] = (byte) (bArr8[iArr10[bArr13[c13]] & 255] ^ i13);
        int i14 = iArr9[i2 + 2];
        bArr2[c16] = (byte) (bArr8[iArr10[bArr10[c14]] >>> 24] ^ (i14 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[c14]] >>> 16) & 255] ^ (i14 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[c14]] >>> 8) & 255] ^ (i14 >>> 8));
        bArr2[11] = (byte) (bArr8[iArr10[bArr13[c14]] & 255] ^ i14);
        int i15 = iArr9[i2 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[c15]] >>> 24] ^ (i15 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[c15]] >>> 16) & 255] ^ (i15 >>> 16));
        bArr2[14] = (byte) (bArr8[(iArr10[bArr12[c15]] >>> 8) & 255] ^ (i15 >>> 8));
        bArr2[15] = (byte) (bArr8[iArr10[bArr13[c15]] & 255] ^ i15);
    }

    private int getMediationNetwork() throws IOException {
        int i = this.toString;
        if (i == Integer.MAX_VALUE) {
            i = ((FilterInputStream) this).in.read();
            this.toString = i;
        }
        if (this.AFInAppEventType == 16) {
            this.component1[0] = (byte) i;
            if (i < 0) {
                qp2.n("unexpected block size");
                return 0;
            }
            int i2 = 1;
            do {
                int i3 = ((FilterInputStream) this).in.read(this.component1, i2, 16 - i2);
                if (i3 <= 0) {
                    break;
                }
                i2 += i3;
            } while (i2 < 16);
            if (i2 < 16) {
                qp2.n("unexpected block size");
                return 0;
            }
            int i4 = this.copydefault;
            if (i4 == this.hashCode) {
                AFAdRevenueData(this.component1, this.equals);
            } else {
                int i5 = this.copy;
                byte[] bArr = this.component1;
                if (i5 <= i4) {
                    AFAdRevenueData(bArr, this.equals);
                } else {
                    System.arraycopy(bArr, 0, this.equals, 0, bArr.length);
                }
                int i6 = this.copy;
                if (i6 < this.hashCode) {
                    this.copy = i6 + 1;
                } else {
                    this.copy = 1;
                }
            }
            int i7 = ((FilterInputStream) this).in.read();
            this.toString = i7;
            this.AFInAppEventType = 0;
            this.AFLogger = i7 < 0 ? 16 - (this.equals[15] & 255) : 16;
        }
        return this.AFLogger;
    }

    private static byte[][] getRevenue(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new byte[bArr[i].length];
            int i2 = 0;
            while (true) {
                byte[] bArr3 = bArr[i];
                if (i2 < bArr3.length) {
                    bArr2[i][bArr3[i2]] = (byte) i2;
                    i2++;
                }
            }
        }
        return bArr2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getMediationNetwork();
        return this.AFLogger - this.AFInAppEventType;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getMediationNetwork();
        int i = this.AFInAppEventType;
        if (i >= this.AFLogger) {
            return -1;
        }
        byte[] bArr = this.equals;
        this.AFInAppEventType = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            getMediationNetwork();
            int i5 = this.AFInAppEventType;
            if (i5 >= this.AFLogger) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.equals;
            this.AFInAppEventType = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }
}
