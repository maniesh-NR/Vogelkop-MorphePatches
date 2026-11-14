package defpackage;

/* loaded from: classes.dex */
public final class t70 implements yc0 {
    public static final t70 b = new t70(0);
    public static final t70 c = new t70(1);
    public static final t70 d = new t70(2);
    public static final t70 e = new t70(3);
    public static final t70 f = new t70(4);
    public static final t70 g = new t70(5);
    public static final t70 h = new t70(6);
    public static final t70 i = new t70(7);
    public static final t70 j = new t70(8);
    public static final t70 k = new t70(9);
    public static final t70 l = new t70(10);
    public static final t70 m = new t70(11);
    public static final t70 n = new t70(12);
    public static final t70 o = new t70(13);
    public static final t70 p = new t70(14);
    public static final t70 q = new t70(15);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public t70(int i2) {
        this.a = i2;
    }

    public static final t70 a(int i2) {
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
