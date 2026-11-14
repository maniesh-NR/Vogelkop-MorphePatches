package defpackage;

/* loaded from: classes.dex */
public final class f80 implements yc0 {
    public static final f80 b = new f80(0);
    public static final f80 c = new f80(1);
    public static final f80 d = new f80(2);
    public static final f80 e = new f80(3);
    public static final f80 f = new f80(4);
    public static final f80 g = new f80(5);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public f80(int i) {
        this.a = i;
    }

    public static final f80 a(int i) {
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
        if (i == 5) {
            return g;
        }
        hai.d();
        return null;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a;
    }
}
