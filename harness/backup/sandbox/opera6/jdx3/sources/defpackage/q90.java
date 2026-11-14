package defpackage;

/* loaded from: classes.dex */
public final class q90 implements yc0 {
    public static final q90 b = new q90(0);
    public static final q90 c = new q90(1);
    public static final q90 d = new q90(2);
    public static final q90 e = new q90(3);
    public static final q90 f = new q90(4);
    public static final q90 g = new q90(5);
    public static final q90 h = new q90(6);
    public static final q90 i = new q90(7);
    public static final q90 j = new q90(8);
    public static final q90 k = new q90(9);
    public static final q90 l = new q90(10);
    public static final q90 m = new q90(11);
    public static final q90 n = new q90(12);
    public static final q90 o = new q90(13);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public q90(int i2) {
        this.a = i2;
    }

    public static final q90 a(int i2) {
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
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return k;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return l;
            case 11:
                return m;
            case 12:
                return n;
            case 13:
                return o;
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
