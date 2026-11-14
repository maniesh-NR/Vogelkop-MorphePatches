package defpackage;

/* loaded from: classes.dex */
public final class yn0 implements yc0 {
    public static final yn0 b = new yn0(0);
    public static final yn0 c = new yn0(1);
    public static final yn0 d = new yn0(2);
    public static final yn0 e = new yn0(3);
    public static final yn0 f = new yn0(4);
    public static final yn0 g = new yn0(5);
    public static final yn0 h = new yn0(6);
    public static final yn0 i = new yn0(7);
    public static final yn0 j = new yn0(8);
    public static final yn0 k = new yn0(9);
    public static final yn0 l = new yn0(10);
    public static final yn0 m = new yn0(11);
    public static final yn0 n = new yn0(12);
    public static final yn0 o = new yn0(13);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public yn0(int i2) {
        this.a = i2;
    }

    public static final yn0 a(int i2) {
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
