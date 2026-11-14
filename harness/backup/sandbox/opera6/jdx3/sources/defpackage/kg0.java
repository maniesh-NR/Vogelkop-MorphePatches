package defpackage;

/* loaded from: classes.dex */
public final class kg0 implements yc0 {
    public static final kg0 b = new kg0(0);
    public static final kg0 c = new kg0(1);
    public static final kg0 d = new kg0(2);
    public static final kg0 e = new kg0(3);
    public static final kg0 f = new kg0(4);
    public static final kg0 g = new kg0(5);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public kg0(int i) {
        this.a = i;
    }

    public static final kg0 a(int i) {
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
        if (i == 5) {
            return g;
        }
        hai.d();
        return null;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a;
    }
}
