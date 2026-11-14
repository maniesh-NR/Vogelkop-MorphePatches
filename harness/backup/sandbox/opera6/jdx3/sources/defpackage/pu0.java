package defpackage;

/* loaded from: classes.dex */
public final class pu0 implements yc0 {
    public static final pu0 b = new pu0(0);
    public static final pu0 c = new pu0(1);
    public static final pu0 d = new pu0(2);
    public static final pu0 e = new pu0(3);
    public static final pu0 f = new pu0(4);
    public static final pu0 g = new pu0(5);
    public static final pu0 h = new pu0(6);
    public static final pu0 i = new pu0(7);
    public static final pu0 j = new pu0(8);
    public static final pu0 k = new pu0(9);
    public static final pu0 l = new pu0(10);
    public static final pu0 m = new pu0(11);
    public static final pu0 n = new pu0(12);
    public static final pu0 o = new pu0(13);
    public static final pu0 p = new pu0(14);
    public static final pu0 q = new pu0(15);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public pu0(int i2) {
        this.a = i2;
    }

    public static final pu0 a(int i2) {
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
            case 14:
                return p;
            case 15:
                return q;
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
