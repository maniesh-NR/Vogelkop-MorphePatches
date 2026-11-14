package defpackage;

/* loaded from: classes.dex */
public final class u50 implements yc0 {
    public static final u50 b = new u50(0);
    public static final u50 c = new u50(1);
    public static final u50 d = new u50(2);
    public static final u50 e = new u50(3);
    public static final u50 f = new u50(4);
    public static final u50 g = new u50(5);
    public static final u50 h = new u50(6);
    public static final u50 i = new u50(7);
    public static final u50 j = new u50(8);
    public static final u50 k = new u50(9);
    public static final u50 l = new u50(10);
    public static final u50 m = new u50(11);
    public static final u50 n = new u50(12);
    public static final u50 o = new u50(13);
    public static final u50 p = new u50(14);
    public static final u50 q = new u50(15);
    public static final u50 r = new u50(16);
    public static final u50 s = new u50(17);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public u50(int i2) {
        this.a = i2;
    }

    public static final u50 a(int i2) {
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
            case 16:
                return r;
            case 17:
                return s;
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
