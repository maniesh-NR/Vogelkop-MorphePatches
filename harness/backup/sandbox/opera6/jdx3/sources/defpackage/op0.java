package defpackage;

/* loaded from: classes.dex */
public final class op0 implements yc0 {
    public static final op0 b = new op0(0);
    public static final op0 c = new op0(1);
    public static final op0 d = new op0(2);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public op0(int i) {
        this.a = i;
    }

    public static final op0 a(int i) {
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
