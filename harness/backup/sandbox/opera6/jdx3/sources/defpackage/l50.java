package defpackage;

/* loaded from: classes.dex */
public final class l50 implements yc0 {
    public static final l50 b = new l50(0);
    public static final l50 c = new l50(1);
    public static final l50 d = new l50(2);
    public static final l50 e = new l50(3);
    public static final l50 f = new l50(4);
    public static final l50 g = new l50(5);
    public static final l50 h = new l50(6);
    public static final l50 i = new l50(7);
    public static final l50 j = new l50(8);
    public static final l50 k = new l50(9);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public l50(int i2) {
        this.a = i2;
    }

    public static final l50 a(int i2) {
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
