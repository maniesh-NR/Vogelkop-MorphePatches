package defpackage;

/* loaded from: classes.dex */
public final class fn0 implements yc0 {
    public static final fn0 b = new fn0(0);
    public static final fn0 c = new fn0(1);
    public static final fn0 d = new fn0(2);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public fn0(int i) {
        this.a = i;
    }

    public static final fn0 a(int i) {
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
