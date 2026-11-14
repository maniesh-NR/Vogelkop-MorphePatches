package defpackage;

/* loaded from: classes.dex */
public final class q50 implements yc0 {
    public static final q50 b = new q50(0);
    public static final q50 c = new q50(1);
    public static final q50 d = new q50(2);
    public static final q50 e = new q50(3);
    public static final q50 f = new q50(4);
    public static final q50 g = new q50(5);
    public static final q50 h = new q50(6);
    public static final q50 i = new q50(7);
    public static final q50 j = new q50(8);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public q50(int i2) {
        this.a = i2;
    }

    public static final q50 a(int i2) {
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
