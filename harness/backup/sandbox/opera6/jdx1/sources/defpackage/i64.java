package defpackage;

/* loaded from: classes.dex */
public final class i64 extends i1 {
    public i64(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public static int X(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        if (i < 97 || i > 102) {
            return -1;
        }
        return i - 87;
    }

    public final String Y() {
        int iX;
        if (r()) {
            return null;
        }
        char cCharAt = ((String) ((i1) this).d).charAt(((i1) this).b);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ((i1) this).b++;
        int iIntValue = E().intValue();
        while (iIntValue != -1 && iIntValue != cCharAt) {
            if (iIntValue == 92) {
                iIntValue = E().intValue();
                if (iIntValue != -1) {
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        iIntValue = E().intValue();
                    } else {
                        int iX2 = X(iIntValue);
                        if (iX2 != -1) {
                            for (int i = 1; i <= 5 && (iX = X((iIntValue = E().intValue()))) != -1; i++) {
                                iX2 = (iX2 << 4) + iX;
                            }
                            sb.append((char) iX2);
                        }
                    }
                }
            }
            sb.append((char) iIntValue);
            iIntValue = E().intValue();
        }
        return sb.toString();
    }

    public final String Z() {
        int i;
        String str = (String) ((i1) this).d;
        boolean zR = r();
        int i2 = ((i1) this).b;
        if (zR) {
            i = i2;
        } else {
            int iCharAt = str.charAt(i2);
            if (iCharAt == 45) {
                iCharAt = h();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i = i2;
            } else {
                int iH = h();
                while (true) {
                    if ((iH < 65 || iH > 90) && ((iH < 97 || iH > 122) && !((iH >= 48 && iH <= 57) || iH == 45 || iH == 95))) {
                        break;
                    }
                    iH = h();
                }
                i = ((i1) this).b;
            }
            ((i1) this).b = i2;
        }
        if (i == i2) {
            return null;
        }
        String strSubstring = str.substring(i2, i);
        ((i1) this).b = i;
        return strSubstring;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x01f0, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x025b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0445 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a0() throws defpackage.g64 {
        /*
            Method dump skipped, instructions count: 1162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i64.a0():java.util.ArrayList");
    }
}
