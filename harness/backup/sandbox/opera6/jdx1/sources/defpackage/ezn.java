package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ezn {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final g1g a = new g1g();
    public final StringBuilder b = new StringBuilder();

    public static String a(g1g g1gVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = g1gVar.b;
        int i2 = g1gVar.c;
        while (i < i2 && !z) {
            char c2 = (char) g1gVar.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        g1gVar.O(i - g1gVar.b);
        return sb.toString();
    }

    public static String b(g1g g1gVar, StringBuilder sb) {
        c(g1gVar);
        if (g1gVar.a() == 0) {
            return null;
        }
        String strA = a(g1gVar, sb);
        return !strA.isEmpty() ? strA : String.valueOf((char) g1gVar.A());
    }

    public static void c(g1g g1gVar) {
        while (true) {
            for (boolean z = true; g1gVar.a() > 0 && z; z = false) {
                int i = g1gVar.b;
                byte[] bArr = g1gVar.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    g1gVar.O(1);
                } else {
                    int i2 = g1gVar.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            g1gVar.O(i2 - g1gVar.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
