package defpackage;

/* loaded from: classes.dex */
public final class d60 implements yc0 {
    public static final d60 b = new d60(0);
    public static final d60 c = new d60(1);
    public static final d60 d = new d60(2);
    public static final d60 e = new d60(3);
    public static final d60 f = new d60(4);
    public static final d60 g = new d60(5);
    public static final d60 h = new d60(6);
    public static final d60 i = new d60(7);
    public static final d60 j = new d60(8);
    public static final d60 k = new d60(9);
    public static final d60 l = new d60(10);
    public static final d60 m = new d60(11);
    public static final d60 n = new d60(12);
    public static final d60 o = new d60(13);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public d60(int i2) {
        this.a = i2;
    }

    public static final d60 a(int i2) {
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
