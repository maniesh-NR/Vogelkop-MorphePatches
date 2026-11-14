package defpackage;

/* loaded from: classes.dex */
public final class pt0 implements yc0 {
    public static final pt0 b = new pt0(0);
    public static final pt0 c = new pt0(1);
    public static final pt0 d = new pt0(2);
    public static final pt0 e = new pt0(3);
    public static final pt0 f = new pt0(4);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public pt0(int i) {
        this.a = i;
    }

    public static final pt0 a(int i) {
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
        if (i == 4) {
            return f;
        }
        hai.d();
        return null;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a;
    }
}
