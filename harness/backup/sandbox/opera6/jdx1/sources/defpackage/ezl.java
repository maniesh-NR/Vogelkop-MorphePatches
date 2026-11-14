package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ezl {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final eyl b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = tym.a;
        f = "0";
        g = "1";
        h = "3";
        i = "4";
    }

    public ezl(eyl eylVar, boolean z, int[] iArr, boolean[] zArr) {
        int i2 = eylVar.a;
        this.a = i2;
        boolean z2 = false;
        z4o.w(i2 == iArr.length && i2 == zArr.length);
        this.b = eylVar;
        if (z && i2 > 1) {
            z2 = true;
        }
        this.c = z2;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ezl.class != obj.getClass()) {
            return false;
        }
        ezl ezlVar = (ezl) obj;
        return this.c == ezlVar.c && this.b.equals(ezlVar.b) && Arrays.equals(this.d, ezlVar.d) && Arrays.equals(this.e, ezlVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
