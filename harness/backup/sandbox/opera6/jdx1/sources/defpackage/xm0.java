package defpackage;

/* loaded from: classes.dex */
public final class xm0 implements yc0 {
    public static final xm0 b = new xm0(0);
    public static final xm0 c = new xm0(1);
    public static final xm0 d = new xm0(2);
    public static final xm0 e = new xm0(3);
    public static final xm0 f = new xm0(4);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public xm0(int i) {
        this.a = i;
    }

    public static final xm0 a(int i) {
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

    public final int getValue() {
        return this.a;
    }
}
