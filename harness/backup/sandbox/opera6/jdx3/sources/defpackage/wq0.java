package defpackage;

/* loaded from: classes.dex */
public final class wq0 implements yc0 {
    public static final wq0 b = new wq0(0);
    public static final wq0 c = new wq0(1);
    public static final wq0 d = new wq0(2);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public wq0(int i) {
        this.a = i;
    }

    public static final wq0 a(int i) {
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
