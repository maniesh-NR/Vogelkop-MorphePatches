package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class o9g {
    public static final o9g e = new o9g(0, 0, 0, 0);
    public static final Pattern f = Pattern.compile("P(?:([0-9]+)Y)?(?:([0-9]+)M)?(?:([0-9]+)W)?(?:([0-9]+)D)?", 2);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public o9g(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static o9g b(String str) throws NumberFormatException {
        int i;
        Matcher matcher = f.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(2);
        String strGroup3 = matcher.group(3);
        String strGroup4 = matcher.group(4);
        if (strGroup == null && strGroup2 == null && strGroup4 == null && strGroup3 == null) {
            return null;
        }
        if (strGroup == null) {
            i = 0;
        } else {
            try {
                i = Integer.parseInt(strGroup);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return new o9g(i, strGroup2 == null ? 0 : Integer.parseInt(strGroup2), strGroup3 == null ? 0 : Integer.parseInt(strGroup3), strGroup4 != null ? Integer.parseInt(strGroup4) : 0);
    }

    public final int a() {
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        int i4 = this.a;
        if (i4 == 1 && i3 == 0 && i2 == 0 && i == 0) {
            return 0;
        }
        if (i4 == 0 && i3 == 6 && i2 == 0 && i == 0) {
            return 1;
        }
        if (i4 == 0 && i3 == 3 && i2 == 0 && i == 0) {
            return 2;
        }
        return (i4 == 0 && i3 == 1 && i2 == 0 && i == 0) ? 3 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9g)) {
            return false;
        }
        o9g o9gVar = (o9g) obj;
        return this.a == o9gVar.a && this.b == o9gVar.b && this.c == o9gVar.c && this.d == o9gVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }
}
