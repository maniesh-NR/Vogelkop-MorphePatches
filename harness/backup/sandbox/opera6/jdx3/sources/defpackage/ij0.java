package defpackage;

/* loaded from: classes.dex */
public final class ij0 implements yc0 {
    public static final ij0 b = new ij0(0);
    public static final ij0 c = new ij0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public ij0(int i) {
        this.a = i;
    }

    public static final ij0 a(int i) {
        if (i == 0) {
            return b;
        }
        if (i == 1) {
            return c;
        }
        hai.d();
        return null;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
