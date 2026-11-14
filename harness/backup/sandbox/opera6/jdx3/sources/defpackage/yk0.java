package defpackage;

/* loaded from: classes.dex */
public final class yk0 implements yc0 {
    public static final yk0 b = new yk0(0);
    public static final yk0 c = new yk0(1);
    public static final yk0 d = new yk0(2);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public yk0(int i) {
        this.a = i;
    }

    public static final yk0 a(int i) {
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
