package defpackage;

/* loaded from: classes.dex */
public final class bl0 implements yc0 {
    public static final bl0 b = new bl0(0);
    public static final bl0 c = new bl0(1);
    public static final bl0 d = new bl0(2);
    public static final bl0 e = new bl0(3);
    public static final bl0 f = new bl0(4);
    public static final bl0 g = new bl0(5);
    public static final bl0 h = new bl0(6);
    public static final bl0 i = new bl0(7);
    public static final bl0 j = new bl0(8);
    public static final bl0 k = new bl0(9);
    public static final bl0 l = new bl0(10);
    public static final bl0 m = new bl0(11);
    public static final bl0 n = new bl0(12);
    public static final bl0 o = new bl0(13);
    public static final bl0 p = new bl0(14);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public bl0(int i2) {
        this.a = i2;
    }

    public static final bl0 a(int i2) {
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
