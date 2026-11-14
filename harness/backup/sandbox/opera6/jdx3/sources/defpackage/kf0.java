package defpackage;

/* loaded from: classes.dex */
public final class kf0 implements yc0 {
    public static final kf0 b = new kf0(0);
    public static final kf0 c = new kf0(1);
    public static final kf0 d = new kf0(2);
    public static final kf0 e = new kf0(3);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public kf0(int i) {
        this.a = i;
    }

    public static final kf0 a(int i) {
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
        hai.d();
        return null;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a;
    }
}
