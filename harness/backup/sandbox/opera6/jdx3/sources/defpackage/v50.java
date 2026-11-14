package defpackage;

/* loaded from: classes.dex */
public final class v50 implements yc0 {
    public static final v50 b = new v50(0);
    public static final v50 c = new v50(1);
    public static final v50 d = new v50(2);
    public static final v50 e = new v50(3);
    public static final v50 f = new v50(4);
    public static final v50 g = new v50(5);
    public static final v50 h = new v50(6);
    public static final v50 i = new v50(7);
    public static final v50 j = new v50(8);
    public static final v50 k = new v50(9);
    public static final v50 l = new v50(10);
    public static final v50 m = new v50(11);
    public static final v50 n = new v50(12);
    public static final v50 o = new v50(13);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public v50(int i2) {
        this.a = i2;
    }

    public static final v50 a(int i2) {
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
