package defpackage;

import androidx.core.app.NotificationCompat;
import java.lang.reflect.Method;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class nym {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final c processor = createProcessor();

    public static class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws bjb {
            if (!isNotTrailingByte(b2)) {
                if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !isNotTrailingByte(b3) && !isNotTrailingByte(b4)) {
                    int iTrailingByteValue = ((b & 7) << 18) | (trailingByteValue(b2) << 12) | (trailingByteValue(b3) << 6) | trailingByteValue(b4);
                    cArr[i] = highSurrogate(iTrailingByteValue);
                    cArr[i + 1] = lowSurrogate(iTrailingByteValue);
                    return;
                }
            }
            throw bjb.invalidUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte b, byte b2, byte b3, char[] cArr, int i) throws bjb {
            if (isNotTrailingByte(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || isNotTrailingByte(b3)))) {
                throw bjb.invalidUtf8();
            }
            cArr[i] = (char) (((b & 15) << 12) | (trailingByteValue(b2) << 6) | trailingByteValue(b3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte b, byte b2, char[] cArr, int i) throws bjb {
            if (b < -62 || isNotTrailingByte(b2)) {
                throw bjb.invalidUtf8();
            }
            cArr[i] = (char) (((b & 31) << 6) | trailingByteValue(b2));
        }

        private static char highSurrogate(int i) {
            return (char) ((i >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b) {
            return b > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b) {
            return b >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b) {
            return b < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b) {
            return b < -32;
        }

        private static char lowSurrogate(int i) {
            return (char) ((i & 1023) + 56320);
        }

        private static int trailingByteValue(byte b) {
            return b & 63;
        }
    }

    public static final class b extends c {
        @Override // nym.c
        public String decodeUtf8(byte[] bArr, int i, int i2) throws bjb {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                t3p.m("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                return null;
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!a.isOneByte(b)) {
                    break;
                }
                i++;
                a.handleOneByte(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (a.isOneByte(b2)) {
                    int i7 = i5 + 1;
                    a.handleOneByte(b2, cArr, i5);
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b3 = bArr[i8];
                        if (!a.isOneByte(b3)) {
                            break;
                        }
                        i8++;
                        a.handleOneByte(b3, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (a.isTwoBytes(b2)) {
                    if (i6 >= i3) {
                        throw bjb.invalidUtf8();
                    }
                    i += 2;
                    a.handleTwoBytes(b2, bArr[i6], cArr, i5);
                    i5++;
                } else if (a.isThreeBytes(b2)) {
                    if (i6 >= i3 - 1) {
                        throw bjb.invalidUtf8();
                    }
                    int i9 = i + 2;
                    i += 3;
                    a.handleThreeBytes(b2, bArr[i6], bArr[i9], cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw bjb.invalidUtf8();
                    }
                    byte b4 = bArr[i6];
                    int i10 = i + 3;
                    byte b5 = bArr[i + 2];
                    i += 4;
                    a.handleFourBytes(b2, b4, b5, bArr[i10], cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // nym.c
        public int encodeUtf8(String str, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            char cCharAt;
            int length = str.length();
            int i5 = i + i2;
            int i6 = 0;
            while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = str.charAt(i6)) < 128) {
                bArr[i4] = (byte) cCharAt;
                i6++;
            }
            if (i6 == length) {
                return i + length;
            }
            int i7 = i + i6;
            while (i6 < length) {
                char cCharAt2 = str.charAt(i6);
                if (cCharAt2 < 128 && i7 < i5) {
                    bArr[i7] = (byte) cCharAt2;
                    i7++;
                } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                    i7 += 2;
                    bArr[i8] = (byte) ((cCharAt2 & '?') | NotificationCompat.FLAG_HIGH_PRIORITY);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                        if (i7 > i5 - 4) {
                            if (55296 > cCharAt2 || cCharAt2 > 57343 || ((i3 = i6 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                            }
                            return encodeUtf8Naive(str, bArr, i, i2);
                        }
                        i6++;
                        if (i6 != str.length()) {
                            char cCharAt3 = str.charAt(i6);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                                int i9 = i7 + 3;
                                bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                                i7 += 4;
                                bArr[i9] = (byte) ((codePoint & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                            }
                        }
                        return encodeUtf8Naive(str, bArr, i, i2);
                    }
                    bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i10 = i7 + 2;
                    bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                    i7 += 3;
                    bArr[i10] = (byte) ((cCharAt2 & '?') | NotificationCompat.FLAG_HIGH_PRIORITY);
                }
                i6++;
            }
            return i7;
        }

        @Override // nym.c
        public void encodeUtf8Internal(String str, ByteBuffer byteBuffer) {
            int length = str.length();
            int iPosition = byteBuffer.position();
            int i = 0;
            while (i < length) {
                try {
                    char cCharAt = str.charAt(i);
                    if (cCharAt >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i, (byte) cCharAt);
                    i++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                }
            }
            if (i == length) {
                mmb.position(byteBuffer, iPosition + i);
                return;
            }
            int i2 = iPosition + i;
            while (i < length) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 < 128) {
                    byteBuffer.put(i2, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i3 = i2 + 1;
                    byteBuffer.put(i2, (byte) ((cCharAt2 >>> 6) | 192));
                    byteBuffer.put(i3, (byte) ((cCharAt2 & '?') | NotificationCompat.FLAG_HIGH_PRIORITY));
                    i2 = i3;
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        i++;
                        if (i != length) {
                            char cCharAt3 = str.charAt(i);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                byteBuffer.put(i2, (byte) ((codePoint >>> 18) | 240));
                                int i4 = i2 + 2;
                                byteBuffer.put(i2 + 1, (byte) (((codePoint >>> 12) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY));
                                i2 += 3;
                                byteBuffer.put(i4, (byte) (((codePoint >>> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY));
                                byteBuffer.put(i2, (byte) ((codePoint & 63) | NotificationCompat.FLAG_HIGH_PRIORITY));
                            }
                        }
                        encodeUtf8Naive(str, byteBuffer);
                        return;
                    }
                    int i5 = i2 + 1;
                    byteBuffer.put(i2, (byte) ((cCharAt2 >>> '\f') | 224));
                    i2 += 2;
                    byteBuffer.put(i5, (byte) (((cCharAt2 >>> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY));
                    byteBuffer.put(i2, (byte) ((cCharAt2 & '?') | NotificationCompat.FLAG_HIGH_PRIORITY));
                }
                i++;
                i2++;
            }
            mmb.position(byteBuffer, i2);
        }
    }

    public static abstract class c {
        public final String decodeUtf8(ByteBuffer byteBuffer, int i, int i2) {
            if (!byteBuffer.hasArray()) {
                return decodeUtf8NonArrayByteBuffer(byteBuffer, i, i2);
            }
            return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        }

        public abstract String decodeUtf8(byte[] bArr, int i, int i2);

        public final String decodeUtf8NonArrayByteBuffer(ByteBuffer byteBuffer, int i, int i2) throws bjb {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                t3p.m("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)});
                return null;
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (!a.isOneByte(b)) {
                    break;
                }
                i++;
                a.handleOneByte(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = byteBuffer.get(i);
                if (a.isOneByte(b2)) {
                    int i7 = i5 + 1;
                    a.handleOneByte(b2, cArr, i5);
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b3 = byteBuffer.get(i8);
                        if (!a.isOneByte(b3)) {
                            break;
                        }
                        i8++;
                        a.handleOneByte(b3, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (a.isTwoBytes(b2)) {
                    if (i6 >= i3) {
                        throw bjb.invalidUtf8();
                    }
                    i += 2;
                    a.handleTwoBytes(b2, byteBuffer.get(i6), cArr, i5);
                    i5++;
                } else if (a.isThreeBytes(b2)) {
                    if (i6 >= i3 - 1) {
                        throw bjb.invalidUtf8();
                    }
                    int i9 = i + 2;
                    i += 3;
                    a.handleThreeBytes(b2, byteBuffer.get(i6), byteBuffer.get(i9), cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw bjb.invalidUtf8();
                    }
                    byte b4 = byteBuffer.get(i6);
                    int i10 = i + 3;
                    byte b5 = byteBuffer.get(i + 2);
                    i += 4;
                    a.handleFourBytes(b2, b4, b5, byteBuffer.get(i10), cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        public abstract int encodeUtf8(String str, byte[] bArr, int i, int i2);

        public final void encodeUtf8(String str, ByteBuffer byteBuffer) {
            if (!byteBuffer.hasArray()) {
                encodeUtf8Internal(str, byteBuffer);
            } else {
                int iArrayOffset = byteBuffer.arrayOffset();
                mmb.position(byteBuffer, nym.encode(str, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            }
        }

        public abstract void encodeUtf8Internal(String str, ByteBuffer byteBuffer);

        public int encodeUtf8Naive(String str, byte[] bArr, int i, int i2) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            if (bytes.length - i > i2) {
                throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
            }
            System.arraycopy(bytes, 0, bArr, i, bytes.length);
            return i + bytes.length;
        }

        public void encodeUtf8Naive(String str, ByteBuffer byteBuffer) {
            try {
                byteBuffer.put(str.getBytes(StandardCharsets.UTF_8));
            } catch (BufferOverflowException unused) {
                throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        
            if (r2 < r5) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        
            bxl.b(r2 + 4294967296L, "UTF-8 length does not fit in int: ");
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        
            return 0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int encodedLength(java.lang.String r6) {
            /*
                r5 = this;
                int r5 = r6.length()
                r0 = 0
                r1 = r0
            L6:
                if (r1 >= r5) goto L13
                char r2 = r6.charAt(r1)
                r3 = 128(0x80, float:1.8E-43)
                if (r2 >= r3) goto L13
                int r1 = r1 + 1
                goto L6
            L13:
                r2 = r5
            L14:
                if (r1 >= r5) goto L34
                char r3 = r6.charAt(r1)
                r4 = 2048(0x800, float:2.87E-42)
                if (r3 >= r4) goto L26
                int r3 = 127 - r3
                int r3 = r3 >>> 31
                int r2 = r2 + r3
                int r1 = r1 + 1
                goto L14
            L26:
                int r6 = defpackage.nym.access$700(r6, r1)     // Catch: nym.f -> L2c
                int r2 = r2 + r6
                goto L34
            L2c:
                java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
                byte[] r5 = r6.getBytes(r5)
                int r5 = r5.length
                return r5
            L34:
                if (r2 < r5) goto L37
                return r2
            L37:
                long r5 = (long) r2
                r1 = 4294967296(0x100000000, double:2.121995791E-314)
                long r5 = r5 + r1
                java.lang.String r1 = "UTF-8 length does not fit in int: "
                bxl.b(r5, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: nym.c.encodedLength(java.lang.String):int");
        }
    }

    public static class d extends c {
        @Override // nym.c
        public String decodeUtf8(byte[] bArr, int i, int i2) throws bjb {
            Charset charset = StandardCharsets.UTF_8;
            String str = new String(bArr, i, i2, charset);
            if (str.indexOf(65533) < 0 || Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                return str;
            }
            throw bjb.invalidUtf8();
        }

        @Override // nym.c
        public int encodeUtf8(String str, byte[] bArr, int i, int i2) {
            return encodeUtf8Naive(str, bArr, i, i2);
        }

        @Override // nym.c
        public void encodeUtf8Internal(String str, ByteBuffer byteBuffer) {
            encodeUtf8Naive(str, byteBuffer);
        }
    }

    public static final class e extends d {
        private static final Method encodedLengthMethod = createEncodedLengthMethod();

        private static Method createEncodedLengthMethod() {
            try {
                return String.class.getMethod("encodedLength", Charset.class);
            } catch (ReflectiveOperationException unused) {
                return null;
            }
        }

        public static boolean isAvailable() {
            return encodedLengthMethod != null;
        }

        @Override // nym.c
        public int encodedLength(String str) {
            try {
                return ((Integer) encodedLengthMethod.invoke(str, StandardCharsets.UTF_8)).intValue();
            } catch (ReflectiveOperationException e) {
                h9o.o(e);
                return 0;
            }
        }
    }

    public static class f extends Exception {
        public f(int i, int i2) {
            super(sko.h(i, i2, "Unpaired surrogate at index ", " of "));
        }
    }

    private nym() {
    }

    private static c createProcessor() {
        return m21.isOnAndroidDevice() ? new b() : e.isAvailable() ? new e() : new d();
    }

    public static String decodeUtf8(ByteBuffer byteBuffer, int i, int i2) {
        return i2 == 0 ? "" : processor.decodeUtf8(byteBuffer, i, i2);
    }

    public static String decodeUtf8(byte[] bArr, int i, int i2) {
        return i2 == 0 ? "" : processor.decodeUtf8(bArr, i, i2);
    }

    public static int encode(String str, byte[] bArr, int i, int i2) {
        return processor.encodeUtf8(str, bArr, i, i2);
    }

    public static void encodeUtf8(String str, ByteBuffer byteBuffer) {
        processor.encodeUtf8(str, byteBuffer);
    }

    public static int encodedLength(String str) {
        return processor.encodedLength(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int encodedLengthGeneral(String str, int i) throws f {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(str, i) < 65536) {
                        throw new f(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    private static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i2 - 7;
        int i4 = i;
        while (i4 < i3 && (byteBuffer.getLong(i4) & ASCII_MASK_LONG) == 0) {
            i4 += 8;
        }
        return i4 - i;
    }

    public static boolean isValidUtf8(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iRemaining = byteBuffer.remaining() + iPosition;
        if (!byteBuffer.hasArray()) {
            return isValidUtf8BufferInternal(byteBuffer, iPosition, iRemaining);
        }
        int iArrayOffset = byteBuffer.arrayOffset();
        return isValidUtf8Internal(byteBuffer.array(), iPosition + iArrayOffset, iArrayOffset + iRemaining);
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return isValidUtf8Internal(bArr, 0, bArr.length);
    }

    public static boolean isValidUtf8(byte[] bArr, int i, int i2) {
        return isValidUtf8Internal(bArr, i, i2);
    }

    private static boolean isValidUtf8BufferInternal(ByteBuffer byteBuffer, int i, int i2) {
        int iEstimateConsecutiveAscii = i + estimateConsecutiveAscii(byteBuffer, i, i2);
        while (iEstimateConsecutiveAscii < i2) {
            int i3 = iEstimateConsecutiveAscii + 1;
            byte b2 = byteBuffer.get(iEstimateConsecutiveAscii);
            if (b2 >= 0) {
                iEstimateConsecutiveAscii = i3;
            } else if (b2 < -32) {
                if (i3 >= i2 || b2 < -62 || byteBuffer.get(i3) > -65) {
                    return false;
                }
                iEstimateConsecutiveAscii += 2;
            } else {
                if (b2 >= -16) {
                    if (i3 >= i2 - 2) {
                        return false;
                    }
                    int i4 = iEstimateConsecutiveAscii + 2;
                    byte b3 = byteBuffer.get(i3);
                    if (b3 <= -65) {
                        if ((((b3 + 112) + (b2 << 28)) >> 30) == 0) {
                            int i5 = iEstimateConsecutiveAscii + 3;
                            if (byteBuffer.get(i4) <= -65) {
                                iEstimateConsecutiveAscii += 4;
                                if (byteBuffer.get(i5) > -65) {
                                }
                            }
                        }
                    }
                    return false;
                }
                if (i3 >= i2 - 1) {
                    return false;
                }
                int i6 = iEstimateConsecutiveAscii + 2;
                byte b4 = byteBuffer.get(i3);
                if (b4 > -65 || ((b2 == -32 && b4 < -96) || ((b2 == -19 && b4 >= -96) || byteBuffer.get(i6) > -65))) {
                    return false;
                }
                iEstimateConsecutiveAscii += 3;
            }
        }
        return true;
    }

    private static boolean isValidUtf8Internal(byte[] bArr, int i, int i2) {
        while (i < i2) {
            if (bArr[i] < 0) {
                return isValidUtf8NonAscii(bArr, i, i2);
            }
            i++;
        }
        return true;
    }

    private static boolean isValidUtf8NonAscii(byte[] bArr, int i, int i2) {
        while (i < i2) {
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i3 < i2 && b2 >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return false;
                }
                if (b2 < -16) {
                    if (i3 >= i2 - 1) {
                        return false;
                    }
                    int i4 = i + 2;
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        i += 3;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return false;
                }
                if (i3 >= i2 - 2) {
                    return false;
                }
                int i5 = i + 2;
                byte b4 = bArr[i3];
                if (b4 <= -65) {
                    if ((((b4 + 112) + (b2 << 28)) >> 30) == 0) {
                        int i6 = i + 3;
                        if (bArr[i5] <= -65) {
                            i += 4;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                }
                return false;
            }
            i = i3;
        }
        return true;
    }
}
