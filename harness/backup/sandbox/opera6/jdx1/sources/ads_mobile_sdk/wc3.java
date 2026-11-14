package ads_mobile_sdk;

import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public abstract class wc3 {
    public static final String[] a = new String[NotificationCompat.FLAG_HIGH_PRIORITY];

    static {
        int i = 0;
        while (true) {
            String[] strArr = a;
            if (i > 31) {
                strArr[127] = "\\177";
                strArr[34] = "\\\"";
                strArr[39] = "\\'";
                strArr[92] = "\\\\";
                strArr[9] = "\\t";
                strArr[8] = "\\b";
                strArr[10] = "\\n";
                strArr[13] = "\\r";
                strArr[12] = "\\f";
                strArr[7] = "\\a";
                strArr[11] = "\\v";
                return;
            }
            strArr[i] = String.format("\\%03o", Integer.valueOf(i));
            i++;
        }
    }

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
