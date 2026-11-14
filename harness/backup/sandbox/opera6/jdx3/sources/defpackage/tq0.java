package defpackage;

/* loaded from: classes.dex */
public final class tq0 implements yc0 {
    public static final tq0 b = new tq0(0);
    public static final tq0 c = new tq0(1);
    public static final tq0 d = new tq0(2);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public tq0(int i) {
        this.a = i;
    }

    public static final tq0 a(int i) {
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
