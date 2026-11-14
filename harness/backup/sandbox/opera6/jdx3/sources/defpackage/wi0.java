package defpackage;

/* loaded from: classes.dex */
public final class wi0 implements yc0 {
    public static final wi0 b = new wi0(0);
    public static final wi0 c = new wi0(1);
    public static final wi0 d = new wi0(2);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public wi0(int i) {
        this.a = i;
    }

    public static final wi0 a(int i) {
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
