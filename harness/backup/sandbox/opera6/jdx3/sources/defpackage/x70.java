package defpackage;

/* loaded from: classes.dex */
public final class x70 implements yc0 {
    public static final x70 b = new x70(0);
    public static final x70 c = new x70(1);
    public static final x70 d = new x70(2);
    public static final x70 e = new x70(3);
    public static final x70 f = new x70(4);
    public static final x70 g = new x70(5);
    public static final x70 h = new x70(6);
    public static final x70 i = new x70(7);
    public static final x70 j = new x70(8);
    public static final x70 k = new x70(9);
    public static final x70 l = new x70(10);
    public static final x70 m = new x70(11);
    public static final x70 n = new x70(12);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public x70(int i2) {
        this.a = i2;
    }

    public static final x70 a(int i2) {
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
