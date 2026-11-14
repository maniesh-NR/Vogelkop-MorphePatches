package defpackage;

/* loaded from: classes.dex */
public final class nc0 implements yc0 {
    public static final nc0 b = new nc0(0);
    public static final nc0 c = new nc0(1);
    public static final nc0 d = new nc0(2);
    public static final nc0 e = new nc0(3);
    public static final nc0 f = new nc0(4);
    public static final nc0 g = new nc0(5);
    public static final nc0 h = new nc0(6);
    public static final nc0 i = new nc0(7);
    public static final nc0 j = new nc0(8);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public nc0(int i2) {
        this.a = i2;
    }

    public static final nc0 a(int i2) {
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
