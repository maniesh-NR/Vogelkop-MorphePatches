package defpackage;

/* loaded from: classes.dex */
public final class dq0 implements yc0 {
    public static final dq0 b = new dq0(0);
    public static final dq0 c = new dq0(1);
    public static final dq0 d = new dq0(2);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public dq0(int i) {
        this.a = i;
    }

    public static final dq0 a(int i) {
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
