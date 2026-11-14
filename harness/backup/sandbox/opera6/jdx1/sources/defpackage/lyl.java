package defpackage;

/* loaded from: classes.dex */
public final class lyl {
    public static final lyl d = new lyl(new f8b());
    public static final String e;
    public static final String f;
    public static final String g;
    public final int a;
    public final boolean b;
    public final boolean c;

    static {
        String str = tym.a;
        e = "1";
        f = "2";
        g = "3";
    }

    public lyl(f8b f8bVar) {
        this.a = f8bVar.a;
        this.b = f8bVar.b;
        this.c = f8bVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lyl.class == obj.getClass()) {
            lyl lylVar = (lyl) obj;
            if (this.a == lylVar.a && this.b == lylVar.b && this.c == lylVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a + 31) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0);
    }
}
