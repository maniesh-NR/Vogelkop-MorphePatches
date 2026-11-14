package com.appsflyer.internal;

import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public final class AFk1uSDK {
    private static byte[] component1 = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
    static final byte[] getMonetizationNetwork = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
    static final int[] getMediationNetwork = new int[NotificationCompat.FLAG_LOCAL_ONLY];
    static final int[] AFAdRevenueData = new int[NotificationCompat.FLAG_LOCAL_ONLY];
    static final int[] getCurrencyIso4217Code = new int[NotificationCompat.FLAG_LOCAL_ONLY];
    static final int[] getRevenue = new int[NotificationCompat.FLAG_LOCAL_ONLY];
    private static int[] areAllFieldsValid = new int[10];

    static {
        byte[] bArr;
        int i;
        byte b = 1;
        byte b2 = 1;
        do {
            b = (byte) (((b << 1) ^ b) ^ ((b & 128) != 0 ? 27 : 0));
            byte b3 = (byte) (b2 ^ (b2 << 1));
            byte b4 = (byte) (b3 ^ (b3 << 2));
            byte b5 = (byte) (b4 ^ (b4 << 4));
            b2 = (byte) (b5 ^ ((b5 & 128) != 0 ? (byte) 9 : (byte) 0));
            bArr = component1;
            i = b & 255;
            int i2 = b2 & 255;
            bArr[i] = (byte) (((((b2 ^ 99) ^ ((i2 << 1) | (i2 >> 7))) ^ ((i2 << 2) | (i2 >> 6))) ^ ((i2 << 3) | (i2 >> 5))) ^ ((i2 << 4) | (i2 >> 4)));
        } while (i != 1);
        bArr[0] = 99;
        for (int i3 = 0; i3 < 256; i3++) {
            int i4 = component1[i3] & 255;
            getMonetizationNetwork[i4] = (byte) i3;
            int i5 = i3 << 1;
            if (i5 >= 256) {
                i5 ^= 283;
            }
            int i6 = i5 << 1;
            if (i6 >= 256) {
                i6 ^= 283;
            }
            int i7 = i6 << 1;
            if (i7 >= 256) {
                i7 ^= 283;
            }
            int i8 = i7 ^ i3;
            int i9 = (((i7 ^ i6) ^ i5) << 24) | (i8 << 16) | ((i8 ^ i6) << 8) | (i8 ^ i5);
            getMediationNetwork[i4] = i9;
            AFAdRevenueData[i4] = (i9 >>> 8) | (i9 << 24);
            getCurrencyIso4217Code[i4] = (i9 >>> 16) | (i9 << 16);
            getRevenue[i4] = (i9 >>> 24) | (i9 << 8);
        }
        areAllFieldsValid[0] = 16777216;
        int i10 = 1;
        for (int i11 = 1; i11 < 10; i11++) {
            i10 <<= 1;
            if (i10 >= 256) {
                i10 ^= 283;
            }
            areAllFieldsValid[i11] = i10 << 24;
        }
    }

    public static int[] getCurrencyIso4217Code(byte[] bArr, int i) {
        int i2;
        if (bArr.length != 16) {
            hai.d();
            return null;
        }
        int i3 = (i + 1) << 2;
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i2 = 4;
            if (i4 >= 4) {
                break;
            }
            int i6 = i5 + 3;
            int i7 = (bArr[i5] << 24) | ((bArr[i5 + 1] & 255) << 16) | ((bArr[i5 + 2] & 255) << 8);
            i5 += 4;
            iArr[i4] = i7 | (bArr[i6] & 255);
            i4++;
        }
        int i8 = 0;
        int i9 = 0;
        int i10 = 4;
        while (i10 < i3) {
            int i11 = iArr[i10 - 1];
            if (i8 == 0) {
                byte[] bArr2 = component1;
                int i12 = areAllFieldsValid[i9] ^ ((((bArr2[(i11 >>> 16) & 255] << 24) | ((bArr2[(i11 >>> 8) & 255] & 255) << 16)) | ((bArr2[i11 & 255] & 255) << 8)) | (bArr2[i11 >>> 24] & 255));
                i9++;
                i11 = i12;
                i8 = 4;
            }
            iArr[i10] = iArr[i10 - 4] ^ i11;
            i10++;
            i8--;
        }
        if (bArr.length != 16) {
            hai.d();
            return null;
        }
        int[] iArr2 = new int[i3];
        int i13 = i << 2;
        iArr2[0] = iArr[i13];
        int i14 = 1;
        iArr2[1] = iArr[i13 + 1];
        iArr2[2] = iArr[i13 + 2];
        char c = 3;
        iArr2[3] = iArr[i13 + 3];
        int i15 = i13 - 4;
        while (i14 < i) {
            int i16 = iArr[i15];
            int[] iArr3 = getMediationNetwork;
            byte[] bArr3 = component1;
            int i17 = iArr3[bArr3[i16 >>> 24] & 255];
            int[] iArr4 = AFAdRevenueData;
            int i18 = i17 ^ iArr4[bArr3[(i16 >>> 16) & 255] & 255];
            int[] iArr5 = getCurrencyIso4217Code;
            int i19 = i18 ^ iArr5[bArr3[(i16 >>> 8) & 255] & 255];
            int[] iArr6 = getRevenue;
            iArr2[i2] = i19 ^ iArr6[bArr3[i16 & 255] & 255];
            int i20 = iArr[i15 + 1];
            char c2 = c;
            int[] iArr7 = iArr2;
            iArr7[i2 + 1] = ((iArr3[bArr3[i20 >>> 24] & 255] ^ iArr4[bArr3[(i20 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i20 >>> 8) & 255] & 255]) ^ iArr6[bArr3[i20 & 255] & 255];
            int i21 = iArr[i15 + 2];
            int i22 = i2 + 3;
            iArr7[i2 + 2] = ((iArr3[bArr3[i21 >>> 24] & 255] ^ iArr4[bArr3[(i21 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i21 >>> 8) & 255] & 255]) ^ iArr6[bArr3[i21 & 255] & 255];
            int i23 = iArr[i15 + 3];
            i2 += 4;
            iArr7[i22] = ((iArr3[bArr3[i23 >>> 24] & 255] ^ iArr4[bArr3[(i23 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i23 >>> 8) & 255] & 255]) ^ iArr6[bArr3[i23 & 255] & 255];
            i15 -= 4;
            i14++;
            c = c2;
            iArr2 = iArr7;
        }
        int[] iArr8 = iArr2;
        iArr8[i2] = iArr[i15];
        iArr8[i2 + 1] = iArr[i15 + 1];
        iArr8[i2 + 2] = iArr[i15 + 2];
        iArr8[i2 + 3] = iArr[i15 + 3];
        return iArr8;
    }

    public static byte[][] getMediationNetwork(int i) {
        byte[][] bArr = new byte[4][];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i >>> (i2 << 3);
            bArr[i2] = new byte[]{(byte) (i3 & 3), (byte) ((i3 >> 2) & 3), (byte) ((i3 >> 4) & 3), (byte) ((i3 >> 6) & 3)};
        }
        return bArr;
    }
}
