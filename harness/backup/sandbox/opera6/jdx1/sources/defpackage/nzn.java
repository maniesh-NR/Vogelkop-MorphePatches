package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class nzn {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(g1g g1gVar) {
        String strN = g1gVar.n(StandardCharsets.UTF_8);
        return strN != null && strN.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String str2 = tym.a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                qp2.o("Expected 3 decimal places, got: ".concat(strTrim));
                return 0L;
            }
            j2 += Long.parseLong(strTrim);
        }
        return j2 * 1000;
    }

    public static void d(g1g g1gVar) {
        int i = g1gVar.b;
        if (a(g1gVar)) {
            return;
        }
        g1gVar.N(i);
        throw s1g.d("Expected WEBVTT. Got " + g1gVar.n(StandardCharsets.UTF_8), null);
    }
}
