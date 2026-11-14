package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class cx6 {
    public static final String c;
    public static final String d;
    public static final String e;
    public final int a;
    public final int[] b;

    static {
        String str = tym.a;
        c = "0";
        d = "1";
        e = "2";
    }

    public cx6(int i, int... iArr) {
        this.a = i;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        this.b = iArrCopyOf;
        Arrays.sort(iArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cx6.class != obj.getClass()) {
            return false;
        }
        cx6 cx6Var = (cx6) obj;
        return this.a == cx6Var.a && Arrays.equals(this.b, cx6Var.b);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.b) + (this.a * 31)) * 31;
    }
}
