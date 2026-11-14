package defpackage;

/* loaded from: classes.dex */
public final class an0 implements yc0 {
    public static final an0 b = new an0(0);
    public static final an0 c = new an0(1);
    public static final an0 d = new an0(2);
    public static final an0 e = new an0(3);
    public static final an0 f = new an0(4);
    public static final an0 g = new an0(5);
    public static final an0 h = new an0(6);
    public static final an0 i = new an0(7);
    public static final an0 j = new an0(8);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public an0(int i2) {
        this.a = i2;
    }

    public static final an0 a(int i2) {
        switch (i2) {
            case 0:
                return b;
            case 1:
                return c;
            case 2:
                return d;
            case 3:
                return e;
            case 4:
                return f;
            case 5:
                return g;
            case 6:
                return h;
            case 7:
                return i;
            case 8:
                return j;
            default:
                hai.d();
                return null;
        }
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a;
    }
}
