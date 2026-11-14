package defpackage;

/* loaded from: classes.dex */
public final class gr0 implements yc0 {
    public static final gr0 b = new gr0(0);
    public static final gr0 c = new gr0(1);
    public static final gr0 d = new gr0(2);
    public static final gr0 e = new gr0(3);
    public static final gr0 f = new gr0(4);
    public static final gr0 g = new gr0(5);
    public static final gr0 h = new gr0(6);
    public static final gr0 i = new gr0(7);
    public static final gr0 j = new gr0(8);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public gr0(int i2) {
        this.a = i2;
    }

    public static final gr0 a(int i2) {
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
