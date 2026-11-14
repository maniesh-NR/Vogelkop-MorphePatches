package defpackage;

/* loaded from: classes.dex */
public final class vd0 implements yc0 {
    public static final vd0 b = new vd0(0);
    public static final vd0 c = new vd0(1);
    public static final vd0 d = new vd0(2);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public vd0(int i) {
        this.a = i;
    }

    public static final vd0 a(int i) {
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
