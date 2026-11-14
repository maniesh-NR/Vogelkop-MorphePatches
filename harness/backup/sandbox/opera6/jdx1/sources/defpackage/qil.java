package defpackage;

import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class qil {
    private qil() {
    }

    public static String escapeBytes(v44 v44Var) {
        return escapeBytes(v44Var.toByteArray());
    }

    public static String escapeBytes(byte[] bArr) {
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

    public static String escapeDoubleQuotesAndBackslashes(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    public static String escapeText(String str) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ' || cCharAt > '~') {
                return escapeBytes(str.getBytes(StandardCharsets.UTF_8));
            }
            if (cCharAt == '\"') {
                z3 = true;
            } else if (cCharAt == '\'') {
                z2 = true;
            } else if (cCharAt == '\\') {
                z = true;
            }
        }
        if (z) {
            str = str.replace("\\", "\\\\");
        }
        if (z2) {
            str = str.replace("'", "\\'");
        }
        return z3 ? str.replace("\"", "\\\"") : str;
    }
}
