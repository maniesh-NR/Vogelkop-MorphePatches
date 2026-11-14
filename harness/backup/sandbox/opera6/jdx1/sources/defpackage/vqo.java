package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class vqo {
    public static final Pattern a = Pattern.compile("<(head)( [^>]*)?>", 2);
    public static final Pattern b = Pattern.compile("<(head)( [^>]*)?/>", 2);
    public static final Pattern c = Pattern.compile("<(body)( [^>]*?)?>", 2);
    public static final Pattern d = Pattern.compile("<(body)( [^>]*?)?/>", 2);
    public static final Pattern e = Pattern.compile("<(html)( [^>]*?)?>", 2);
    public static final Pattern f = Pattern.compile("<(html)( [^>]*?)?/>", 2);
    public static final Pattern g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.lang.String r8, java.lang.StringBuilder r9, java.util.regex.Pattern r10, java.lang.String r11, int[][] r12) {
        /*
            java.util.regex.Matcher r10 = r10.matcher(r8)
            r0 = 0
            r1 = r0
        L6:
            boolean r1 = r10.find(r1)
            if (r1 == 0) goto L44
            int r1 = r10.start()
            int r2 = r10.end()
            r3 = 1
            if (r12 == 0) goto L2a
            int r4 = r12.length
            r5 = r0
        L19:
            if (r5 >= r4) goto L2a
            r6 = r12[r5]
            r7 = r6[r0]
            if (r1 < r7) goto L27
            r6 = r6[r3]
            if (r1 > r6) goto L27
            r1 = r2
            goto L6
        L27:
            int r5 = r5 + 1
            goto L19
        L2a:
            int r12 = r10.end()
            java.lang.String r12 = r8.substring(r0, r12)
            r9.append(r12)
            r9.append(r11)
            int r10 = r10.end()
            java.lang.String r8 = r8.substring(r10)
            r9.append(r8)
            return r3
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqo.a(java.lang.String, java.lang.StringBuilder, java.util.regex.Pattern, java.lang.String, int[][]):boolean");
    }

    public static String b(String str, String str2) {
        String str3 = "<script type=\"text/javascript\">" + str + "</script>";
        zch.e(str2, "HTML is null or empty");
        ArrayList arrayList = new ArrayList();
        int length = str2.length();
        int i = 0;
        while (i < length) {
            int iIndexOf = str2.indexOf("<!--", i);
            if (iIndexOf >= 0) {
                int iIndexOf2 = str2.indexOf("-->", iIndexOf);
                if (iIndexOf2 >= 0) {
                    arrayList.add(new int[]{iIndexOf, iIndexOf2});
                    i = iIndexOf2 + 3;
                } else {
                    arrayList.add(new int[]{iIndexOf, length});
                }
            }
            i = length;
        }
        int[][] iArr = (int[][]) arrayList.toArray((int[][]) Array.newInstance((Class<?>) Integer.TYPE, 0, 2));
        StringBuilder sb = new StringBuilder(str3.length() + str2.length() + 16);
        return (c(str2, sb, b, str3, iArr) || a(str2, sb, a, str3, iArr) || c(str2, sb, d, str3, iArr) || a(str2, sb, c, str3, iArr) || c(str2, sb, f, str3, iArr) || a(str2, sb, e, str3, iArr) || a(str2, sb, g, str3, iArr)) ? sb.toString() : str3.concat(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.lang.String r8, java.lang.StringBuilder r9, java.util.regex.Pattern r10, java.lang.String r11, int[][] r12) {
        /*
            java.util.regex.Matcher r10 = r10.matcher(r8)
            r0 = 0
            r1 = r0
        L6:
            boolean r1 = r10.find(r1)
            if (r1 == 0) goto L54
            int r1 = r10.start()
            int r2 = r10.end()
            r3 = 1
            if (r12 == 0) goto L2a
            int r4 = r12.length
            r5 = r0
        L19:
            if (r5 >= r4) goto L2a
            r6 = r12[r5]
            r7 = r6[r0]
            if (r1 < r7) goto L27
            r6 = r6[r3]
            if (r1 > r6) goto L27
            r1 = r2
            goto L6
        L27:
            int r5 = r5 + 1
            goto L19
        L2a:
            int r12 = r10.end()
            int r12 = r12 + (-2)
            java.lang.String r12 = r8.substring(r0, r12)
            r9.append(r12)
            java.lang.String r12 = "</"
            java.lang.String r0 = ">"
            defpackage.p3p.v(r9, r0, r11, r12)
            java.lang.String r11 = r10.group(r3)
            r9.append(r11)
            r9.append(r0)
            int r10 = r10.end()
            java.lang.String r8 = r8.substring(r10)
            r9.append(r8)
            return r3
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqo.c(java.lang.String, java.lang.StringBuilder, java.util.regex.Pattern, java.lang.String, int[][]):boolean");
    }
}
