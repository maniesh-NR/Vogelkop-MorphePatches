package defpackage;

/* loaded from: classes.dex */
public final class di0 implements yc0 {
    public static final di0 b = new di0(0);
    public static final di0 c = new di0(1);
    public static final di0 d = new di0(2);
    public static final di0 e = new di0(3);
    public static final di0 f = new di0(4);
    public static final di0 g = new di0(5);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public di0(int i) {
        this.a = i;
    }

    public static final di0 a(int i) {
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
