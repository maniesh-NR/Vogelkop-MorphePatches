package defpackage;

/* loaded from: classes.dex */
public final class zn0 implements yc0 {
    public static final zn0 b = new zn0(0);
    public static final zn0 c = new zn0(1);
    public static final zn0 d = new zn0(2);
    public static final zn0 e = new zn0(3);
    public static final zn0 f = new zn0(4);
    public static final zn0 g = new zn0(5);
    public static final zn0 h = new zn0(6);
    public static final zn0 i = new zn0(7);
    public static final zn0 j = new zn0(8);
    public static final zn0 k = new zn0(9);
    public static final zn0 l = new zn0(10);
    public static final zn0 m = new zn0(11);
    public static final zn0 n = new zn0(12);
    public static final zn0 o = new zn0(13);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public zn0(int i2) {
        this.a = i2;
    }

    public static final zn0 a(int i2) {
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
