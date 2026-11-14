package defpackage;

/* loaded from: classes.dex */
public final class ch0 implements yc0 {
    public static final ch0 b = new ch0(0);
    public static final ch0 c = new ch0(1);
    public static final ch0 d = new ch0(2);
    public static final ch0 e = new ch0(3);
    public static final ch0 f = new ch0(4);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public ch0(int i) {
        this.a = i;
    }

    public static final ch0 a(int i) {
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
