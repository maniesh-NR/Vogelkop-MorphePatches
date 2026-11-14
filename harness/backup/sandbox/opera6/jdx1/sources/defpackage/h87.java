package defpackage;

import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public abstract class h87 {
    public static final char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    public static final int[] b;

    static {
        int[] iArr = new int[NotificationCompat.FLAG_HIGH_PRIORITY];
        for (int i = 0; i < 128; i++) {
            char[] cArr = a;
            char c = (char) i;
            int i2 = 0;
            while (true) {
                if (i2 >= 64) {
                    i2 = -1;
                    break;
                } else if (c != cArr[i2]) {
                    i2++;
                }
            }
            iArr[i] = i2;
        }
        b = iArr;
    }
}
