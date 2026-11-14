package defpackage;

/* loaded from: classes.dex */
public final class cn0 implements yc0 {
    public static final cn0 b = new cn0(0);
    public static final cn0 c = new cn0(1);
    public static final cn0 d = new cn0(2);
    public static final cn0 e = new cn0(3);
    public static final cn0 f = new cn0(4);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public cn0(int i) {
        this.a = i;
    }

    public static final cn0 a(int i) {
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
