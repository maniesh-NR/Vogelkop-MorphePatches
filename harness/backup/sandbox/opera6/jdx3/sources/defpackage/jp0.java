package defpackage;

/* loaded from: classes.dex */
public final class jp0 implements yc0 {
    public static final jp0 b = new jp0(0);
    public static final jp0 c = new jp0(1);
    public static final jp0 d = new jp0(2);
    public static final jp0 e = new jp0(3);
    public static final jp0 f = new jp0(4);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public jp0(int i) {
        this.a = i;
    }

    public static final jp0 a(int i) {
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
