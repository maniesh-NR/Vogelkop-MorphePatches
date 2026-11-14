package defpackage;

/* loaded from: classes.dex */
public final class e80 implements yc0 {
    public static final e80 b = new e80(0);
    public static final e80 c = new e80(1);
    public static final e80 d = new e80(2);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public e80(int i) {
        this.a = i;
    }

    public static final e80 a(int i) {
        if (i == 0) {
            return b;
        }
        if (i == 1) {
            return c;
        }
        if (i == 2) {
            return d;
        }
        hai.d();
        return null;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a;
    }
}
