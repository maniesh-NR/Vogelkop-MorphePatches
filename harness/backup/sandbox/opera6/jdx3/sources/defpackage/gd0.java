package defpackage;

/* loaded from: classes.dex */
public final class gd0 implements yc0 {
    public static final gd0 b = new gd0(0);
    public static final gd0 c = new gd0(1);
    public static final gd0 d = new gd0(2);
    public static final gd0 e = new gd0(3);
    public static final gd0 f = new gd0(4);
    public static final gd0 g = new gd0(5);
    public static final gd0 h = new gd0(6);
    public static final gd0 i = new gd0(7);
    public static final gd0 j = new gd0(8);
    public static final gd0 k = new gd0(9);
    public static final gd0 l = new gd0(10);
    public static final gd0 m = new gd0(11);
    public static final gd0 n = new gd0(12);
    public static final gd0 o = new gd0(13);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public gd0(int i2) {
        this.a = i2;
    }

    public static final gd0 a(int i2) {
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
