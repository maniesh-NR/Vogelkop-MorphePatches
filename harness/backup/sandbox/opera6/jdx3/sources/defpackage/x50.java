package defpackage;

/* loaded from: classes.dex */
public final class x50 implements yc0 {
    public static final x50 b = new x50(0);
    public static final x50 c = new x50(1);
    public static final x50 d = new x50(2);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public x50(int i) {
        this.a = i;
    }

    public static final x50 a(int i) {
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
