package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ukk implements vnk {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder a = new StringBuilder();
    public final ArrayList b = new ArrayList();
    public final g1g c = new g1g();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.x36 a(android.text.Spanned r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ukk.a(android.text.Spanned, java.lang.String):x36");
    }

    public static long b(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    @Override // defpackage.vnk
    public final void j(byte[] bArr, int i, int i2, unk unkVar, op5 op5Var) throws NumberFormatException {
        String strN;
        String str;
        ukk ukkVar = this;
        long j = unkVar.b;
        g1g g1gVar = ukkVar.c;
        g1gVar.L(bArr, i + i2);
        g1gVar.N(i);
        Charset charsetJ = g1gVar.J();
        if (charsetJ == null) {
            charsetJ = StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        ArrayList arrayList = (j == -9223372036854775807L || !unkVar.a) ? null : new ArrayList();
        while (true) {
            String strN2 = g1gVar.n(charsetJ);
            int i3 = 0;
            if (strN2 == null) {
                break;
            }
            if (!strN2.isEmpty()) {
                try {
                    Integer.parseInt(strN2);
                    strN = g1gVar.n(charsetJ);
                } catch (NumberFormatException unused) {
                    w7d.K("Skipping invalid index: ".concat(strN2));
                }
                if (strN == null) {
                    w7d.K("Unexpected end");
                    break;
                }
                Matcher matcher = d.matcher(strN);
                if (matcher.matches()) {
                    long jB = b(matcher, 1);
                    long jB2 = b(matcher, 6);
                    StringBuilder sb = ukkVar.a;
                    sb.setLength(0);
                    ArrayList arrayList2 = ukkVar.b;
                    arrayList2.clear();
                    String strN3 = g1gVar.n(charsetJ);
                    while (!TextUtils.isEmpty(strN3)) {
                        long j3 = j2;
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String strTrim = strN3.trim();
                        StringBuilder sb2 = new StringBuilder(strTrim);
                        Matcher matcher2 = e.matcher(strTrim);
                        int i4 = i3;
                        while (matcher2.find()) {
                            String strGroup = matcher2.group();
                            arrayList2.add(strGroup);
                            int iStart = matcher2.start() - i4;
                            int length = strGroup.length();
                            sb2.replace(iStart, iStart + length, "");
                            i4 += length;
                            j = j;
                        }
                        sb.append(sb2.toString());
                        strN3 = g1gVar.n(charsetJ);
                        j2 = j3;
                        i3 = 0;
                    }
                    long j4 = j;
                    long j5 = j2;
                    Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i5);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (j4 == j5 || jB2 >= j4) {
                        op5Var.accept(new a46(h1b.v(a(spannedFromHtml, str)), jB, jB2 - jB));
                    } else if (arrayList != null) {
                        arrayList.add(new a46(h1b.v(a(spannedFromHtml, str)), jB, jB2 - jB));
                    }
                    ukkVar = this;
                    j2 = j5;
                    j = j4;
                } else {
                    w7d.K("Skipping invalid timing: ".concat(strN));
                    ukkVar = this;
                }
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                op5Var.accept((a46) obj);
            }
        }
    }

    @Override // defpackage.vnk
    public final int z() {
        return 1;
    }
}
