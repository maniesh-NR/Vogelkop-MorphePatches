package defpackage;

/* loaded from: classes.dex */
public final class js0 implements yc0 {
    public static final js0 b = new js0(0);
    public static final js0 c = new js0(1);
    public static final js0 d = new js0(2);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public js0(int i) {
        this.a = i;
    }

    public static final js0 a(int i) {
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
