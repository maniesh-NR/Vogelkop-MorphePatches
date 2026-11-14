package defpackage;

/* loaded from: classes.dex */
public final class xn0 implements yc0 {
    public static final xn0 b = new xn0(0);
    public static final xn0 c = new xn0(1);
    public static final xn0 d = new xn0(2);
    public static final xn0 e = new xn0(3);
    public static final xn0 f = new xn0(4);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public xn0(int i) {
        this.a = i;
    }

    public static final xn0 a(int i) {
        if (i == 0) {
            return b;
        }
        if (i == 1) {
            return c;
        }
        if (i == 2) {
            return d;
        }
        if (i == 3) {
            return e;
        }
        if (i == 4) {
            return f;
        }
        hai.d();
        return null;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a;
    }
}
