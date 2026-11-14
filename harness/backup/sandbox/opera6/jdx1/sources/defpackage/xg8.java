package defpackage;

import android.util.Pair;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class xg8 {
    public static final Pattern b = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern c = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern d = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final ArrayList e;
    public final ArrayList a;

    static {
        vg8 vg8Var = new vg8((byte) 0);
        vg8Var.b = 0;
        e = Collections.list(vg8Var);
    }

    public xg8() {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        vg8 vg8Var = new vg8((byte) 1);
        vg8Var.b = 0;
        this.a = Collections.list(vg8Var);
    }

    public static Pair a(String str) throws NumberFormatException {
        if (!str.contains(",")) {
            if (!str.contains("/")) {
                try {
                    try {
                        long j = Long.parseLong(str);
                        return (j < 0 || j > 65535) ? j < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                    } catch (NumberFormatException unused) {
                        Double.parseDouble(str);
                        return new Pair(12, -1);
                    }
                } catch (NumberFormatException unused2) {
                    return new Pair(2, -1);
                }
            }
            String[] strArrSplit = str.split("/", -1);
            if (strArrSplit.length == 2) {
                try {
                    long j2 = (long) Double.parseDouble(strArrSplit[0]);
                    long j3 = (long) Double.parseDouble(strArrSplit[1]);
                    return (j2 < 0 || j3 < 0) ? new Pair(10, -1) : (j2 > 2147483647L || j3 > 2147483647L) ? new Pair(5, -1) : new Pair(10, 5);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair(2, -1);
        }
        String[] strArrSplit2 = str.split(",", -1);
        Pair pairA = a(strArrSplit2[0]);
        if (((Integer) pairA.first).intValue() == 2) {
            return pairA;
        }
        for (int i = 1; i < strArrSplit2.length; i++) {
            Pair pairA2 = a(strArrSplit2[i]);
            int iIntValue = (((Integer) pairA2.first).equals(pairA.first) || ((Integer) pairA2.second).equals(pairA.first)) ? ((Integer) pairA.first).intValue() : -1;
            int iIntValue2 = (((Integer) pairA.second).intValue() == -1 || !(((Integer) pairA2.first).equals(pairA.second) || ((Integer) pairA2.second).equals(pairA.second))) ? -1 : ((Integer) pairA.second).intValue();
            if (iIntValue == -1 && iIntValue2 == -1) {
                return new Pair(2, -1);
            }
            if (iIntValue == -1) {
                pairA = new Pair(Integer.valueOf(iIntValue2), -1);
            } else if (iIntValue2 == -1) {
                pairA = new Pair(Integer.valueOf(iIntValue), -1);
            }
        }
        return pairA;
    }

    public final void b(String str, String str2, ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((Map) obj).containsKey(str)) {
                return;
            }
        }
        c(str, str2, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0136, code lost:
    
        if (r9 != r6) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r22, java.lang.String r23, java.util.List r24) {
        /*
            Method dump skipped, instructions count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg8.c(java.lang.String, java.lang.String, java.util.List):void");
    }

    public final void d(int i) {
        c("Orientation", String.valueOf(i != 0 ? i != 90 ? i != 180 ? i != 270 ? 0 : 8 : 3 : 6 : 1), this.a);
    }
}
