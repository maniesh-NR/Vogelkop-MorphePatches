package defpackage;

/* loaded from: classes.dex */
public final class vb0 implements yc0 {
    public static final vb0 b = new vb0(0);
    public static final vb0 c = new vb0(1);
    public static final vb0 d = new vb0(2);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public vb0(int i) {
        this.a = i;
    }

    public static final vb0 a(int i) {
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
