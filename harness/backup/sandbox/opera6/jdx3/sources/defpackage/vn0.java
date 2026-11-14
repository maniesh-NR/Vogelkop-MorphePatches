package defpackage;

/* loaded from: classes.dex */
public final class vn0 implements yc0 {
    public static final vn0 b = new vn0(0);
    public static final vn0 c = new vn0(1);
    public static final vn0 d = new vn0(2);
    public static final vn0 e = new vn0(3);
    public static final vn0 f = new vn0(4);
    public static final vn0 g = new vn0(5);
    public static final vn0 h = new vn0(6);
    public static final vn0 i = new vn0(7);
    public static final vn0 j = new vn0(8);
    public static final vn0 k = new vn0(9);
    public static final vn0 l = new vn0(10);
    public static final vn0 m = new vn0(11);
    public static final vn0 n = new vn0(12);
    public static final vn0 o = new vn0(13);
    public static final vn0 p = new vn0(14);
    public static final vn0 q = new vn0(15);
    public static final vn0 r = new vn0(16);
    public static final vn0 s = new vn0(17);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public vn0(int i2) {
        this.a = i2;
    }

    public static final vn0 a(int i2) {
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
