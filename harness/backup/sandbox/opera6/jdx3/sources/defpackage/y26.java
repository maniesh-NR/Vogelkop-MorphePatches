package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class y26 {
    public static final y26 c = new y26("cssk_m", (byte) 23);
    public static final y26 d = new y26("cssk_m", new byte[]{87});
    public static final y26 e = new y26("cssk_jbmr2", (byte) 18);
    public static final y26 f = new y26("cnssk", (byte) 0);
    public final String a;
    public final byte[] b;

    public y26(String str, byte b) {
        this.a = str;
        this.b = new byte[]{b};
    }

    public y26(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public static boolean a(byte[] bArr, byte b) {
        return bArr.length >= 1 && (bArr[0] & 63) == b;
    }

    public static y26 b(byte[] bArr) {
        if (!a(bArr, (byte) 23) && !a(bArr, (byte) 41)) {
            if (a(bArr, (byte) 18)) {
                return e;
            }
            return null;
        }
        if (bArr.length <= 0 || (bArr[0] & 128) != 128) {
            return (bArr.length <= 0 || (bArr[0] & 64) != 64) ? c : d;
        }
        if (bArr.length < 9) {
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 9);
        StringBuilder sb = new StringBuilder("cssk_m");
        long j = 0;
        for (int i = 1; i < 9; i++) {
            j = (j << 8) | (bArrCopyOf[i] & 255);
        }
        sb.append(j);
        return new y26(sb.toString(), bArrCopyOf);
    }
}
