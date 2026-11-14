package defpackage;

/* loaded from: classes.dex */
public final class r4n {
    public static final r4n d = new r4n(0, 0);
    public static final String e;
    public static final String f;
    public static final String g;
    public final int a;
    public final int b;
    public final float c;

    static {
        String str = tym.a;
        e = "0";
        f = "1";
        g = "3";
    }

    public r4n(int i, int i2) {
        this(i, i2, 1.0f);
    }

    public r4n(int i, int i2, float f2) {
        this.a = i;
        this.b = i2;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r4n) {
            r4n r4nVar = (r4n) obj;
            if (this.a == r4nVar.a && this.b == r4nVar.b && this.c == r4nVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((217 + this.a) * 31) + this.b) * 31);
    }
}
