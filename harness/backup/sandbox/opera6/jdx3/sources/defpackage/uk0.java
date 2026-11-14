package defpackage;

/* loaded from: classes.dex */
public final class uk0 implements yc0 {
    public static final uk0 b = new uk0(0);
    public static final uk0 c = new uk0(1);
    public static final uk0 d = new uk0(2);
    public static final uk0 e = new uk0(3);
    public static final uk0 f = new uk0(4);
    public static final uk0 g = new uk0(5);
    public static final uk0 h = new uk0(6);
    public static final uk0 i = new uk0(7);
    public static final uk0 j = new uk0(8);
    public static final uk0 k = new uk0(9);
    public static final uk0 l = new uk0(10);
    public static final uk0 m = new uk0(11);
    public static final uk0 n = new uk0(12);
    public static final uk0 o = new uk0(13);
    public static final uk0 p = new uk0(14);
    public static final uk0 q = new uk0(15);
    public static final uk0 r = new uk0(16);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public uk0(int i2) {
        this.a = i2;
    }

    public static final uk0 a(int i2) {
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
